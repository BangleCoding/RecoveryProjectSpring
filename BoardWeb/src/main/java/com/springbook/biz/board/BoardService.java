package com.springbook.biz.board;

import java.util.List;

public interface BoardService {
	
	//���
	void insertBoard(BoardVO vo);
	
	//����
	void upadateBoard(BoardVO vo);
	
	//����
	void deleteBoard(BoardVO vo);
	
	//����ȸ
	BoardVO getBoard(BoardVO vo);
	
	//�� ��� ��ȸ
	List<BoardVO> getBoardList(BoardVO vo);

}
