package co.eju.prj.comm;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DataSource {
	private Connection conn;
	private String driver;
	private String url;
	private String user;
	private String password;
	
	private static SqlSessionFactory sqlSessionFactory;
	//singleton으로 만들기위해 static 키워드를 넣어준 것
	private DataSource() {}
	
	public static SqlSessionFactory getInstance() { //database에 연결완료.connection pool기반
		String resource = "mybatis-config.xml";
	
		try {
			InputStream	inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sqlSessionFactory;
	}

	public Connection getConnection() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,user,password);
		}catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
		return conn;
		}
		// TODO Auto-generated method stub
	
	
}
