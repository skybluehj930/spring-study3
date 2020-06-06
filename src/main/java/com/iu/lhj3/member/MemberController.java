package com.iu.lhj3.member;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/member/**")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value = "memberJoin", method = RequestMethod.GET)
	public String memberJoinForm() throws Exception {
		System.out.println("Member Join Form");
		return "/member/memberJoin";
	}
	
	@RequestMapping(value = "memberJoin", method = RequestMethod.POST)
	public String memberJoin(MemberVO member) throws Exception {
		System.out.println("Member Join");
		
		System.out.println(member.getId());
		System.out.println(member.getPw());
		System.out.println(member.getAge());
		System.out.println(member.getBirth());
		
		int result = memberService.setMember(member);
		System.out.println("result : " + result);
		
		return "/member/memberJoin";
	}
	
	@RequestMapping(value = "memberLogin", method = RequestMethod.GET)
	public String memberLoginForm() throws Exception {
		System.out.println("Member Login Form");
		return "/member/memberLogin";
	}
	
	@RequestMapping(value = "memberLogin", method = RequestMethod.POST)
	public String memberLogin(MemberVO member) throws Exception {
		
		// HttpServletRequest request
//		String id = request.getParameter("id");
//		String pw = request.getParameter("pw");
		member = memberService.getMember(member);
		System.out.println("id : " + member.getId());
		System.out.println("pw : " + member.getPw());
		
		System.out.println("Member Login");
		return "/member/memberLogin";
	}
	
	@RequestMapping(value = "memberPage")
	public String memberPage() throws Exception {
		System.out.println("Member Page");
		return "/member/memberPage";
	}
}
