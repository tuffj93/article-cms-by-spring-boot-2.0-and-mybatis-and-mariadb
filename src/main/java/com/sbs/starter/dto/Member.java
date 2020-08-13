package com.sbs.starter.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Member{
	private long id;
	private String regDate;
	private String loginId;
	private String loginPw;
	public Member(int i, String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
		id=i;
		regDate=string;
		loginId=string2;
		loginPw=string3;


	}

}