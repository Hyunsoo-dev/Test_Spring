<%@page import="java.util.List"%>
<%@page import="com.springbook.biz.board.impl.BoardDAO"%>
<%@page import="com.springbook.biz.board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>    
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title><spring:message code="message.board.list.mainTitle" /></title>
</head>
<body>
	<h1><spring:message code="message.board.list.mainTitle" /></h1>
	<h3>${userName}<spring:message code="message.board.list.welcomeMsg"/></h3>
	<a href="logout.do">Log-out</a>
	
	<!-- �˻� ���� -->
	<form action="getBoardList.do" method="post">
		<table border="1" cellpadding="0" cellspacing="0" width="700">
			<tr>
				<td align="right">
					<select name="searchCondition">
					<c:forEach items="${conditionMap}" var="option">
						<option value="${option.value }">${option.key }</option>
					</c:forEach>
					</select>
					<input type="text" name="searchKeyword" />
					<input type="submit" value="<spring:message code="message.board.list.search.condition.btn"/>" />
				</td>
			</tr>
		</table>
	</form>
	
	<!-- �˻� ���� -->
	<table border="1" cellpadding="0" cellspacing="0" width="700">
		<tr>
			<th bgcolor="orange" width="100"><spring:message code="message.board.list.table.head.seq"/></th>
			<th bgcolor="orange" width="200"><spring:message code="message.board.list.table.head.title"/></th>
			<th bgcolor="orange" width="150"><spring:message code="message.board.list.table.head.writer"/></th>
			<th bgcolor="orange" width="150"><spring:message code="message.board.list.table.head.regDate"/></th>
			<th bgcolor="orange" width="100"><spring:message code="message.board.list.table.head.cnt"/></th>
		</tr>
		
		<c:forEach items="${boardList }" var="board">
		<tr>
			<td>${board.seq }</td>
			<td><a href="getBoard.do?seq=${board.seq }">${board.title }</a></td>
			<td>${board.writer }</td>
			<td><fmt:formatDate value="${board.regDate }" pattern="yyyy-MM-dd"/></td>
			<td>${board.cnt }</td>
		</tr>
			</c:forEach>
	
	</table>
	<br>
	<a href="insertBoard.jsp"><spring:message code="message.board.list.link.insertBoard"/></a>
</body>
</html>