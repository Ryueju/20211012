package co.eju.prj.board.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSessionFactory;

import co.eju.prj.board.service.BoardService;
import co.eju.prj.board.service.BoardVO;
import co.eju.prj.comm.Command;
import co.eju.prj.comm.DataSource;

public class BoardInsert implements Command {
	private SqlSessionFactory dataSource = DataSource.getInstance();
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	@Override
	public void execute() {
		
	}

}
