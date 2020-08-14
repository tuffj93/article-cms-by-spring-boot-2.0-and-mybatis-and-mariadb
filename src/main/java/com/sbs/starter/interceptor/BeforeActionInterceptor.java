package com.sbs.starter.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.sbs.starter.dto.Member;
import com.sbs.starter.service.MemberService;

@Component("beforeActionInterceptor") // 컴포넌트 이름 설정
public class BeforeActionInterceptor implements HandlerInterceptor {
	
	@Autowired
	MemberService memberService;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("test");
		boolean isLogined = false;
		long loginedMemberId = 0;
		Member loginedMember = null;
		
		HttpSession session = request.getSession();
		System.out.println("test123");
		if ( session.getAttribute("loginedMemberId") != null ) {
			isLogined = true;
			loginedMemberId = (long)session.getAttribute("loginedMemberId");
			loginedMember = memberService.getOne(loginedMemberId);
		}
		
		System.out.println("loginedMember="+isLogined);
		System.out.println("loginedMember="+loginedMemberId);
		System.out.println("loginedMember="+loginedMember);
		
		request.setAttribute("isLogined", isLogined);
		request.setAttribute("loginedMemberId", loginedMemberId);
		request.setAttribute("loginedMember", loginedMember);
		
		System.out.println();
		
		return HandlerInterceptor.super.preHandle(request, response, handler);
	}
}
