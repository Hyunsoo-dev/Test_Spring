<%@page import="com.springbook.biz.board.impl.BoardDAO"%>
<%@page import="com.springbook.biz.board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>글 상세</title>
</head>
<body>

<h1>글 상세</h1>
<a href="logout.do">Log-out</a>
<form action="updateBoard.do" method="post">
	<input type="hidden" name="seq" value="${board.seq }">
	<table border="1" cellpadding="0" cellspacing="0">
		<tr>
			<td bgcolor="orange" width="70">제목</td>
			<td align="left"><input type="text" name="title" value="${board.title }"></td>
		</tr>
		<tr>
			<td bgcolor="orange" width="70">작성자</td>
			<td align="left">${board.writer }</td>
		</tr>
		<tr>
			<td bgcolor="orange" width="70">내용</td>
			<td align="left"><textarea rows="10" cols="40" name="content"> ${board.content }</textarea></td>
		</tr>
		<tr>
			<td bgcolor="orange" width="70">등록일</td>
			<td align="left">${board.regDate }</td>
		</tr>
		<tr>
			<td bgcolor="orange" width="70">조회수</td>
			<td align="left">${board.cnt }</td>
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
<a href="deleteBoard.do?seq=${board.seq}">글 삭제</a>
<a href="getBoardList.do">글 목록</a>


</body>
</html>