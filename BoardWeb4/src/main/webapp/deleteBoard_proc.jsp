<%@page import="com.springbook.biz.board.impl.BoardDAO"%>
<%@page import="com.springbook.biz.board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		//1. ����� �Է� ���� ���� 
		int seq = Integer.parseInt(request.getParameter("seq"));
		
		//2. DB ���� ó��
		BoardVO vo = new BoardVO();
		vo.setSeq(seq);
		
		BoardDAO boardDAO = new BoardDAO();
		boardDAO.deleteBoard(vo);
		
		//3. ȭ�� �׺���̼� 
		response.sendRedirect("getBoardList.jsp");
	%>
</body>
</html>