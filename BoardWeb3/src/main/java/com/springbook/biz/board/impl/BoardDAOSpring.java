package com.springbook.biz.board.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.springbook.biz.board.BoardVO;


@Repository
public class BoardDAOSpring extends JdbcDaoSupport{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//SQL
	private final String BOARD_INSERT = "insert into board(seq,title,writer,content) values ((select nvl(max(seq),0)+1 from board),?,?,?)";
	private final String BOARD_UPDATE = "update board set title=?, content=? where seq=?";
	private final String BOARD_DELETE = "delete board where seq=?";
	private final String BOARD_GET = "select * from board where seq=?";
	private final String BOARD_LIST = "select * from board order by seq desc";
	
	
	@Autowired
	public void setSuperDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}
	
	//CRUD 메소드 구현
	
	//글 등록
	public void insertBoard(BoardVO vo) {
		System.out.println("Spring JDBC로 insertBoard 기능 처리");
		getJdbcTemplate().update(BOARD_INSERT, vo.getTitle(),vo.getWriter(),vo.getContent());
	}
	
	//글 수정
	public void updateBoard(BoardVO vo) {
		System.out.println("Spring JDBC로 updateBoard 기능 처리");
		getJdbcTemplate().update(BOARD_UPDATE, vo.getTitle(),vo.getContent(),vo.getSeq());
	}
	
	//글 삭제
	public void deleteBoard(BoardVO vo) {
		System.out.println("Spring JDBC로 deleteBoard 기능 처리");
		getJdbcTemplate().update(BOARD_DELETE, vo.getSeq());
	}
	
	//글 상세 조회
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("Spring JDBC로 getBoard 기능 처리");
		Object[] args = {vo.getSeq()};
		return getJdbcTemplate().queryForObject(BOARD_GET, args, new BoardRowMapper());
	}
	//글 목록 조회
	public List<BoardVO> getBoardList(BoardVO vo){
		System.out.println("Spring JDBC로 getBoardList 기능 처리");
		return getJdbcTemplate().query(BOARD_LIST, new BoardRowMapper());
	}
	

}
