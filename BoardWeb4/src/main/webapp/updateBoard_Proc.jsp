<%@page import="com.springbook.biz.board.impl.BoardDAO"%>
<%@page import="com.springbook.biz.board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%
	//1. 사용자 입력 정보 추출 
	request.setCharacterEncoding("euc-kr");
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	int seq = Integer.parseInt(request.getParameter("seq"));
	
	//2. DB 연동 처리
	BoardVO vo = new BoardVO();
	vo.setTitle(title);
	vo.setContent(content);
	vo.setSeq(seq);
	
	BoardDAO boardDAO = new BoardDAO();
	boardDAO.updateBoard(vo);
	
	//3. 화면 네비게이션 
	response.sendRedirect("getBoardList.jsp");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

</body>
</html>