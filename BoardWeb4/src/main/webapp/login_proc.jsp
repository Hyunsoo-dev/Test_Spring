<%@page import="com.springbook.biz.user.impl.UserDAO"%>
<%@page import="com.springbook.biz.user.UserVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�α��� ���� ó��</title>
</head>
<body>
<%
	//1. ����� �Է� ���� ����
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	
	//2. DB ���� ó��
	UserVO vo = new UserVO();
	vo.setId(id);
	vo.setPassword(password);
	
	UserDAO userDAO = new UserDAO();
	UserVO user = userDAO.getUser(vo);
	
	//3.ȭ�� ���� ó��
	if(user != null){
		response.sendRedirect("getBoardList.jsp");
	}else{
		response.sendRedirect("login.jsp");
	}
%>


</body>
</html>