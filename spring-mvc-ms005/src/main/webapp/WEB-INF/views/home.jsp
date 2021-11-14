<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	<title>SPRING MISSION 005</title>
	<style>
	table {
		width: 100%;
		border: 1px solid black
	}
	th, td {
		border: 1px solid black
	}
	</style>
</head>
<body>
<h1>
	SPRING MISSION 005
</h1>
<table>
<colgroup>
<col width="150em">
<col width="400em">
<col style="text-align:center"width="250em" >
</colgroup>
	<tr><th>no</th><th>url</th><th>title</th></tr>
	<tr><th>1</th><td><a href="/board/get?register">/board/get?register</a></td><td>등록</td></tr>
	<tr><th>2</th><td><a href="/board/get?modify">/board/get?modify</a></td><td>수정</td></tr>
	<tr><th>3</th><td><a href="/board/get?list">/board/get?list</a></td><td>목록</td></tr>
	<tr><th>4</th><td><a href="/board/get?read">/board/get?read</a></td><td>읽기</td></tr>
	<tr><th>5</th><td><a href="/board/get?remove">/board/get?remove</a></td><td>삭제</td></tr>
</table>
</body>
</html>
