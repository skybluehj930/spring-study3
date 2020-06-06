package com.iu.lhj3.member;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.lhj3.MyAbstractTest;

public class MemberDAOTest extends MyAbstractTest{
	
	@Autowired
	private MemberDAO memberDAO;
	
	@Test
	public void setMemberTest() throws Exception{
		MemberVO memberVO = new MemberVO();
		memberVO.setId("lhjID");
		memberVO.setPw("lhjPW");
		memberVO.setAge(30);
		memberVO.setName("lhj");
		memberVO.setBirth("2020-05-23");
		int result = memberDAO.setMember(memberVO);
		assertEquals(1, result);
	}
	
	@Test
	public void setMembeDeleteTest() throws Exception{
		MemberVO memberVO = new MemberVO();
		memberVO.setId("lhjID");
		int result = memberDAO.setDelete(memberVO);
		assertEquals(1, result);
	}
	
	@Test
	public void getMember() throws Exception {
		MemberVO memberVO = new MemberVO();
		memberVO.setId("lhjID");
		memberVO.setPw("lhjPW");
		memberVO = memberDAO.getMember(memberVO);
		System.out.println(memberVO.getAge());
		System.out.println(memberVO.getBirth());
		System.out.println(memberVO.getName());
	}
	
	
	@Test
	public void setUpdate() throws Exception {
		MemberVO memberVO = new MemberVO();
		memberVO.setId("lhjID");
		memberVO.setAge(22);
		memberVO.setName("ddd");
	    int result = memberDAO.setUpdate(memberVO);
	    assertNotEquals(0, result);
	}
}
