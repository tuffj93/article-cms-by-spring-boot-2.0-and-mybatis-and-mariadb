package com.sbs.starter.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Article{
	private long id;
	private String regDate;
	private String title;
	private String body;
	private long hit;
	public Article(int i, String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
		id=i;
		regDate=string;
		title=string2;
		body=string3;
		System.out.println(id);
		System.out.println(title);
		System.out.println(body);
		System.out.println(regDate);

	}

}