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
		vo.setTitle("임시 제목");
		vo.setWriter("홍길동");
		vo.setContent("임시 내용..");
		
		
		boardJpa.insertBoard(vo);
		
		List<BoardVO> boardList = boardJpa.getBoardList(vo);
		for(BoardVO board : boardList) {
			System.out.println(board.toString());
		}
		
		container.close();
	}

}
