package co.eju.prj.member.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import co.eju.prj.comm.Command;
import co.eju.prj.member.service.MemberService;
import co.eju.prj.member.service.MemberVO;

public class MemberList implements Command {
	private MemberService memberService = new MemberServiceImpl();
	
	@Override
	public void execute() {
		List<MemberVO> members = new ArrayList<MemberVO>();
		members = memberService.memberSelectList();
		
		System.out.println("====== 멤버 목록 ======");
		 for(MemberVO vo : members) {
			 System.out.print(vo.getId() + " : ");
			 System.out.print(vo.getName() + " : ");
			 System.out.print(vo.getPassword() + " : ");
			 System.out.print(vo.getTel() + " : ");
			 System.out.print(vo.getAddress() + " : ");
			 System.out.println(vo.getAuthor() + " : ");
		 }
		System.out.println("======멤버 목록 조회 끝 ======");

	}

}
