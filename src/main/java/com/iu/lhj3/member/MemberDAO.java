package com.iu.lhj3.member;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {

	@Autowired
	private SqlSession sqlSession;
	
	//NAMESPACE의 이름은 현재클래스의 경로명(패키지명)과 일치하게 작성
	//Mapper의 namespace속성명과 일치
	private final String NAMESPACE="com.iu.lhj3.member.MemberDAO.";
	
	//insert
	public int setMember(MemberVO memberVO) throws Exception {
		//DB data 전달
		return sqlSession.insert(NAMESPACE + "setMember", memberVO);
	}
	
	public int setDelete(MemberVO memberVO) throws Exception {
		
		return sqlSession.insert(NAMESPACE + "setDelete", memberVO);
	}
	
	public MemberVO getMember (MemberVO memberVO) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("id", "lhjID");
//		map.put("pw", "lhjPW");
		map.put("vo", memberVO);
		return sqlSession.selectOne(NAMESPACE + "getMember", map);
	}
	
	public int setUpdate (MemberVO memberVO) throws Exception {
		return sqlSession.update(NAMESPACE + "setUpdate", memberVO);
	}
}
