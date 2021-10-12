package co.eju.prj.member.service;

import lombok.Getter;
import lombok.Setter;

//use lombok library //가끔충돌일어나기도 함 완벽한 API는 없다고 생각하자.
@Setter
@Getter

public class MemberVO {
	private String id;
	private String name;
	private String password;
	private String tel;
	private String address;
	private String author;
	
}
