<%@page import="com.springbook.biz.board.impl.BoardDAO"%>
<%@page import="com.springbook.biz.board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%
	//1. 검색할 게시글 번호 추출 
	int seq = Integer.parseInt(request.getParameter("seq"));

	//2. DB 연동 처리
	BoardVO vo = new BoardVO();
	vo.setSeq(seq);
	
	BoardDAO boardDAO = new BoardDAO();
	BoardVO board = boardDAO.getBoard(vo);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>글 상세</title>
</head>
<body>

<h1>글 상세</h1>
<a href="logout_proc.jsp">Log-out</a>
<form action="updateBoard_Proc.jsp" method="post">
	<input type="hidden" name="seq" value="<%= board.getSeq() %>">
	<table border="1" cellpadding="0" cellspacing="0">
		<tr>
			<td bgcolor="orange" width="70">제목</td>
			<td align="left"><input type="text" name="title" value="<%= board.getTitle() %>"></td>
		</tr>
		<tr>
			<td bgcolor="orange" width="70">작성자</td>
			<td align="left"><%= board.getWriter() %></td>
		</tr>
		<tr>
			<td bgcolor="orange" width="70">내용</td>
			<td align="left"><textarea rows="10" cols="40" name="content"> <%= board.getContent() %></textarea></td>
		</tr>
		<tr>
			<td bgcolor="orange" width="70">등록일</td>
			<td align="left"><%= board.getRegDate() %></td>
		</tr>
		<tr>
			<td bgcolor="orange" width="70">조회수</td>
			<td align="left"><%= board.getCnt() %></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="글 수정">
			</td>
		</tr>
		
	</table>
</form>
<hr>
<a href="insertBoard.jsp">글 등록</a>
<a href="deleteBoard_proc.jsp?seq=<%= board.getSeq() %>">글 삭제</a>
<a href="getBoardList.jsp">글 목록</a>


</body>
</html>