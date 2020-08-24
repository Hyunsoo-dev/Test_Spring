<%@page import="com.springbook.biz.board.impl.BoardDAO"%>
<%@page import="com.springbook.biz.board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%
	//���ǿ� ����� �Խñ� ������ ������.
	BoardVO board = (BoardVO)session.getAttribute("board");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�� ��</title>
</head>
<body>

<h1>�� ��</h1>
<a href="logout.do">Log-out</a>
<form action="updateBoard.do" method="post">
	<input type="hidden" name="seq" value="<%= board.getSeq() %>">
	<table border="1" cellpadding="0" cellspacing="0">
		<tr>
			<td bgcolor="orange" width="70">����</td>
			<td align="left"><input type="text" name="title" value="<%= board.getTitle() %>"></td>
		</tr>
		<tr>
			<td bgcolor="orange" width="70">�ۼ���</td>
			<td align="left"><%= board.getWriter() %></td>
		</tr>
		<tr>
			<td bgcolor="orange" width="70">����</td>
			<td align="left"><textarea rows="10" cols="40" name="content"> <%= board.getContent() %></textarea></td>
		</tr>
		<tr>
			<td bgcolor="orange" width="70">�����</td>
			<td align="left"><%= board.getRegDate() %></td>
		</tr>
		<tr>
			<td bgcolor="orange" width="70">��ȸ��</td>
			<td align="left"><%= board.getCnt() %></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="�� ����">
			</td>
		</tr>
		
	</table>
</form>
<hr>
<a href="insertBoard.jsp">�� ���</a>
<a href="deleteBoard.do?seq=<%= board.getSeq() %>">�� ����</a>
<a href="getBoardList.do">�� ���</a>


</body>
</html>