package co.eju.prj;

import java.util.ArrayList;
import java.util.List;

import co.eju.prj.board.service.BoardService;
import co.eju.prj.board.service.BoardVO;
import co.eju.prj.board.serviceImpl.BoardServiceImpl;
import co.eju.prj.member.service.MemberService;
import co.eju.prj.member.service.MemberVO;
import co.eju.prj.member.serviceImpl.MemberServiceImpl;
import co.eju.prj.menu.Menu;
import oracle.sql.ARRAY;

public class MainApp {
	public static void main(String[] args) {
	//	System.out.println("Hello!");
	//	List<BoardVO> list = new ArrayList<BoardVO>();
	//	BoardService dao = new BoardServiceImlp();//서비스 호출
	//	List<BoardVO> list = new ArrayList<BoardVO>();
	//	list = dao.boardSelectList();
	//	
		
	//	for(BoardVO vo : list) {
	//		System.out.println(vo.getBContents());
	
		
		//add new information
		
	//	BoardVO vo = new BoardVO();
	//	vo.setBWriter("류이주");
	//	vo.setBTitle("네번째공지");
	//	vo.setBContents("즐거운 수업시간^^......");
	//	int n = dao.boardInsert(vo); //if you succeed, return 0 
	//		if(n !=0) {
	//			System.out.println("입력 성공");
	//			list = dao.boardSelectList();
	//			for(BoardVO board : list) {
	//				System.out.println(board.getBId()+ " : " + board.getBContents());
	//			} // do commit >> class BoardServiceImpl >> openSession(true);
	//			
	//		}else {
	//			System.out.println("입력 실패");
		
	//		}
	//	List<MemberVO> list = new ArrayList<MemberVO>();
	//	MemberService dao = new MemberServiceImpl();
	//	list = dao.memberSelectList();
	//		for(MemberVO member : list){
	//			System.out.println(member.getId() + " : " + member.getName());
	//		}
	//		System.out.println("=================");
	//		BoardService bs = new BoardServiceImlp();
	//		List<BoardVO> boards = new ArrayList<BoardVO>();
	//		boards = bs.boardSelectList();
			
	//		for(BoardVO board : boards) {
	//			System.out.println(board.getBId() + " : " + board.getBContents());
		//	}
		Menu menu = new Menu();
		menu.run();
	}
		
	}

