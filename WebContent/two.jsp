<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	String name=request.getParameter("username");
	String pass=request.getParameter("userpass");
	out.println("==="+name+"   "+pass );
%>