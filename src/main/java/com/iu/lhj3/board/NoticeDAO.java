package com.iu.lhj3.board;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class NoticeDAO implements BoardDAO {
	
	private final String NAMESPACE="com.iu.lhj3.board.NoticeDAO.";
	
	@Autowired
	SqlSession sqlSession;

	@Override
	public BoardVO getSelect(BoardVO boardVO) throws Exception {
		
		return sqlSession.selectOne(NAMESPACE + "getSelect", boardVO);
	}
	
	@Override
	public List<BoardVO> getSelectList() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(NAMESPACE + "getSelectList");
	}
	
	@Override
	public int setDelete(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.delete(NAMESPACE + "setDelete", boardVO);
	}
	
	@Override
	public int setInsert(BoardVO boardVO) throws Exception {
		boardVO.setContents("컨텐츠");
		boardVO.setHit(0L);
		boardVO.setTitle("따이뚤");
		boardVO.setWriter("lhj");
		boardVO.setNum(1003L);
		return sqlSession.insert(NAMESPACE + "setInsert", boardVO);
	}
	
	@Override
	public int setUpdate(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.update(NAMESPACE + "setUpdate", boardVO);
	}
}
