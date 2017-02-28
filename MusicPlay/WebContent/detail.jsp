<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>상세정보</title>
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/style.css" rel="stylesheet">
<style>
body {
	padding : 10% 30%;
}
td{
	padding: 10px;
}
#musicDetail {
	width:100%;
}
</style>
</head>
<body>
<c:forEach items="${musics}" var="music">
<div style="text-align: right;">
	
		<a class="btn btn-xs btn-info" href="addMyList.do?id=${music.id}">담기</a>&nbsp;
		<a class="btn btn-xs btn-default" href="list.do">뮤직차트</a>
	</div>
	<h2>이럴거면 그러지 말지</h2>
	<hr>
	<table id="musicDetail">
		<colgroup>
			<col width="200px">
			<col width="*">
		</colgroup>
		<tr>
		
			<td><img src="resources/img/${music.image }" width="180px"></td>
			<td>
			<table class="table">
					<colgroup>
						<col width="150">
						<col width="*">
					</colgroup>
					<tr>
						<th>곡명</th>
						<td>${music.name }</td>
					</tr>
					<tr>
						<th>앨범명</th>
						<td>${music.album }</td>
					</tr>
					<tr>
						<th>아티스트</th>
						<td>{music.artist}</td>
					</tr>
					<tr>
						<th>기획사</th>
						<td>{music.agent}</td>
					</tr>
				</table>
			</td>
		
		</tr>
	</table>
	<br>
</c:forEach>
</body>
</html>