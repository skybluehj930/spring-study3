package com.iu.lhj3.notice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.lhj3.MyAbstractTest;
import com.iu.lhj3.board.BoardVO;
import com.iu.lhj3.board.NoticeDAO;
import com.iu.lhj3.board.NoticeVO;

public class NoticeDAOTest extends MyAbstractTest{

	@Autowired
	NoticeDAO noticeDAO;
	
	@Test
	public void setInsert() throws Exception {
		NoticeVO noticeVO = new NoticeVO();
		noticeVO.setContents("컨텐츠3");
		noticeVO.setHit(0L);
		noticeVO.setTitle("따이뚤3");
		noticeVO.setWriter("lhj3");
		noticeVO.setNum(1003L);
		int result = noticeDAO.setInsert(noticeVO);
		assertEquals(1, result);
	}
	
	@Test
	public void getSelect() throws Exception {
		NoticeVO noticeVO = new NoticeVO();
		noticeVO.setNum(1002L);
		BoardVO boardVO = noticeDAO.getSelect(noticeVO);
		System.out.println("Num : " + boardVO.getNum());
		System.out.println("Title : "+ boardVO.getTitle());
		System.out.println("Contents : " + boardVO.getContents());
		System.out.println("Writer : " + boardVO.getWriter());
		System.out.println("Hit : " + boardVO.getHit());
		System.out.println("CreateDate : " + boardVO.getCreateDate());
		assertNotNull(boardVO);
	}
	
	
	@Test
	public void getSelectList() throws Exception {
		List<BoardVO> boardVOList = noticeDAO.getSelectList();
		for (BoardVO boardVO : boardVOList) {
			System.out.println("Num : " + boardVO.getNum());
			System.out.println("Title : "+ boardVO.getTitle());
			System.out.println("Contents : " + boardVO.getContents());
			System.out.println("Writer : " + boardVO.getWriter());
			System.out.println("Hit : " + boardVO.getHit());
			System.out.println("CreateDate : " + boardVO.getCreateDate());
			System.out.println("------------------------------------------");
		}
	}
	
	@Test
	public void setUpdate() throws Exception {
		NoticeVO noticeVO = new NoticeVO();
		noticeVO.setNum(1001L);
		noticeVO.setTitle("변경따이틀");
		noticeVO.setContents("변경꼰탠");
		int result = noticeDAO.setUpdate(noticeVO);
		assertNotEquals(0, result);
	}
	
	
	@Test
	public void setDelete() throws Exception {
		NoticeVO noticeVO = new NoticeVO();
		noticeVO.setNum(1002L);
		int result = noticeDAO.setDelete(noticeVO);
		System.out.println("result : " + result);
		assertEquals(1, result);
	}
}
