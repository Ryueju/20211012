package co.eju.prj.menu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import co.eju.prj.board.serviceImpl.BoardDelete;
import co.eju.prj.board.serviceImpl.BoardInsert;
import co.eju.prj.board.serviceImpl.BoardList;
import co.eju.prj.board.serviceImpl.BoardSelect;
import co.eju.prj.board.serviceImpl.BoardUpdate;

import co.eju.prj.comm.Command;
import co.eju.prj.member.serviceImpl.MemberDelete;
import co.eju.prj.member.serviceImpl.MemberInsert;
import co.eju.prj.member.serviceImpl.MemberList;
import co.eju.prj.member.serviceImpl.MemberLogin;
import co.eju.prj.member.serviceImpl.MemberSelect;
import co.eju.prj.member.serviceImpl.MemberUpdate;

public class Menu {
	private Scanner sc = new Scanner(System.in);
	private Map<String, Command> map = new HashMap<String, Command>();
	
	//메뉴생성자 //생성이 될 때 명령 실행그룹 map 구조 만들기
	public Menu() {
		map.put("BoardList", new BoardList());
		map.put("BoardSelect", new BoardSelect());
		map.put("BoardInsert", new BoardInsert());
		map.put("BoardUpdate", new BoardUpdate());
		map.put("BoardDelete", new BoardDelete());
		map.put("MemberList", new MemberList());
		map.put("MemberSelect", new MemberSelect());
		map.put("MemberInsert", new MemberInsert());
		map.put("MemberUpdate", new MemberUpdate());
		map.put("MemberDelete", new MemberDelete());
		map.put("memberLogin" ,new MemberLogin());
	}
	private void mainTitle() {
		System.out.println("=================");
		System.out.println("==== 1.멤버관리 ====");
		System.out.println("==== 2.공지관리 ====");
		System.out.println("==== 3.로 그 인 ====");
		System.out.println("==== 4.종  료 ====");
		System.out.println("=================");
		System.out.println("원하는 작업을 선택하세요>>>");
		
		
	}
	
	private  void memberTitle() {
		System.out.println("=====================");
		System.out.println("==== 1.회원목록 조회 ====");
		System.out.println("==== 2.회원정보 조회 ====");
		System.out.println("==== 3.회원정보 등록 ====");
		System.out.println("==== 4.회원정보 수정 ====");
		System.out.println("==== 5.회원정보 삭제 ====");
		System.out.println("==== 6.메인메뉴 가기 ====");
		System.out.println("=====================");
		System.out.println("원하는 작업을 선택하세요>>>");
		
	}
	private void boardTitle() {
		System.out.println("=====================");
		System.out.println("==== 1.공지사항 목록 ====");
		System.out.println("==== 2.공지사항 조회 ====");
		System.out.println("==== 3.공지사항 등록 ====");
		System.out.println("==== 4.공지사항 수정 ====");
		System.out.println("==== 5.공지사항 삭제 ====");
		System.out.println("==== 6.메인메뉴 가기 ====");
		System.out.println("=====================");
		System.out.println("원하는 작업을 선택하세요>>>");
	} //title complete
	private void menu() { //주 메뉴 선택
		while(true) {
			mainTitle();
			int jobNo = sc.nextInt();
			if(jobNo == 1) {
				memberManagement();
				continue;
			}else if(jobNo == 2) {
				boardManagement();
				continue;
				//while에서 break하면 while을 빠져나가므로... continue
			}else if(jobNo == 3) {
				executeRun("memberLogin");
				continue;
				//while에서 break하면 while을 빠져나가므로... continue
			}else {
				System.out.println("GOOD BYE");
				return;  //while문을 빠져나오면서 메뉴메소드가 끝나게 되는 것임.
				//메뉴가 끝나고 완전히 종료시킬때
			}
		}
	}

	private void boardManagement() {
		boolean b = false;
		do {
			boardTitle();
			int key = sc.nextInt();
			switch(key) {
			case 1: 
				executeRun("BoardList");
				break;
			case 2: 
				executeRun("BoardSelect");
				break;
			case 3: 
				executeRun("BoardInsert");
				break;
			case 4: 
				executeRun("BoardUpdate");

				break;
			case 5: 
				executeRun("BoardDelete");
				break;
			case 6: 
				b = true;
				break;
				}
			} while(!b);
		
		
	}

	private void memberManagement() {
		boolean b = false;
		do {
			memberTitle();
			int key = sc.nextInt();
			switch(key) {
			case 1: 
				executeRun("MemberList");
				break;
			case 2: 
				executeRun("MemberSelect");
				break;
			case 3: 
				executeRun("MemberInsert");
				break;
			case 4: 
				executeRun("MemberUpdate");
				break;
			case 5: 
				executeRun("MemberDelete");
				break;
			case 6: 
				b = true;
				break;
				}
			} while(!b);
		
	}

	private void executeRun(String string) {
		//실해할 명령을 구현한다.
		Command command = map.get(string);
		command.execute();
		
		
	}
	public void run() {
		menu();
		sc.close();
	}
		
	}

