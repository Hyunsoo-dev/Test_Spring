package com.springbook.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.springbook.biz.board.impl.BoardDAOJPA;

public class BoardServiceClient {

	public static void main(String[] args) {
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");

		BoardDAOJPA boardJpa = (BoardDAOJPA)container.getBean("BoardDAOJPA");
		
		BoardVO vo = new BoardVO();
		vo.setTitle("�ӽ� ����");
		vo.setWriter("ȫ�浿");
		vo.setContent("�ӽ� ����..");
		
		
		boardJpa.insertBoard(vo);
		
		List<BoardVO> boardList = boardJpa.getBoardList(vo);
		for(BoardVO board : boardList) {
			System.out.println(board.toString());
		}
		
		container.close();
	}

}
