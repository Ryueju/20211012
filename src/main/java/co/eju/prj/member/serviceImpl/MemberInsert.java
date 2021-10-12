package co.eju.prj.member.serviceImpl;

import co.eju.prj.comm.Command;
import co.eju.prj.member.service.MemberService;
import co.eju.prj.member.service.MemberVO;

public class MemberInsert implements Command{

private MemberService memberService = new MemberServiceImpl();

	@Override
	public void execute() {
	 
		MemberVO vo = new MemberVO();
		System.out.println(" 등록할 회원정보를 입력해 주세요");
		String id = 

}
}

