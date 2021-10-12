package co.eju.prj.member.service;

import java.util.List;

public interface MemberMapper { //It is equal with memberservice interface
	List<MemberVO> memberSelectList();
	MemberVO memberSelect(MemberVO vo);
	int memberInsert(MemberVO vo);
	int memberUpdate(MemberVO vo);
	int memberDelete(MemberVO vo);
	MemberVO loginCheck(MemberVO vo);
}
