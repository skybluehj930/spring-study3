package com.iu.lhj3.board;

import java.util.List;

public interface BoardService {
	public int setInsert(BoardVO boardVO) throws Exception;
	
	public int setUpdate(BoardVO boardVO) throws Exception;
	
	public int setDelete(BoardVO boardVO) throws Exception;
	
	public BoardVO getSelect(BoardVO boardVO) throws Exception;
	
	public List<BoardVO> getSelectList() throws Exception;
}
