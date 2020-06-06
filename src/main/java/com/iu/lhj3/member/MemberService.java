package com.iu.lhj3.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

	@Autowired
	private MemberDAO memberDAO;
	
	public int setMember(MemberVO memberVO) throws Exception {
		return memberDAO.setMember(memberVO);
	}
	
	
	public MemberVO getMember(MemberVO memberVO) throws Exception {
		return memberDAO.getMember(memberVO);
	}
}
