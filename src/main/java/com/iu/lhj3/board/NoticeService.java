package com.iu.lhj3.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticeService implements BoardService {
	
	@Autowired
	private NoticeDAO noticeDAO;

	@Override
	public int setInsert(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.setInsert(boardVO);
	}

	@Override
	public int setUpdate(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setDelete(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public BoardVO getSelect(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardVO> getSelectList() throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.getSelectList();
	}

}
