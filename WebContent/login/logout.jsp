<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//현재 세션(ID)를 무효화하기 또는 애트리뷰트만 삭제하기
	session.invalidate();		//1)
	//session.removeAttribute("user");//2)

	response.sendRedirect("../index.jsp");
	//response 객체 이용해서 새로운 url 요청 보내기
%>