package co.eju.prj.comm;

import java.util.Scanner;

import co.eju.prj.board.service.BoardService;

import co.eju.prj.board.serviceImpl.BoardServiceImpl;
import co.eju.prj.member.service.MemberService;
import co.eju.prj.member.serviceImpl.MemberServiceImpl;

public interface Command {
		 //make execute method

		public Scanner sc = new Scanner(System.in);
		public BoardService dao = new BoardServiceImpl();
		public MemberService mdao = new MemberServiceImpl();
		public void execute();

}
