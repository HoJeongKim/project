<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>노래 목록</title>
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/style.css" rel="stylesheet">
<style type="text/css">
body {
	padding: 50px;
}

h1 {
	font-weight: bold;
	color: #A0B0DB;
}

.ranking {
	text-align: center;
	font-size: 28pt;
}

.spanTitle {
	font-size: 18pt;
	font-weight: bold;
	margin-right: 10px;
}

.pAlbum {
	color: gray;
	margin-left: 5px;
}

.imgAlbum {
	width: 80px;
	height: 80px;
	margin-right: 10px;
}

.btnPlay {
	margin-top: 40%
}
</style>
</head>
<body>
<%@ include file="header/header.jspf" %>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<h1>Music Chart</h1>
				<div align="right">
					<form action="list.do" method="post">
						<input type="text" placeholder="곡명을 입력하세요." name="searchName"> 
						
						<input class="btn btn-xs btn-default" type="submit" value="검색">
					</form>
				</div>
				<table class="table table-hover table-condensed">
					<colgroup>
						<col width="80" align="center">
						<col width="*">
						<col width="70">
					</colgroup>
					<thead>
						<tr>
							<th>순위</th>
							<th>곡정보/곡명</th>
							<th>담기</th>
						</tr>
					</thead>
					<tbody>
							<c:forEach items="${musics}" var="music" varStatus="status">
								<tr>
									<td class="ranking">${status.count}</td>
									<td>
										<table>
											<tr>
												<td rowspan="2"><img class="imgAlbum"
													src="resources/img/${music.image}"></td>
												<td><span class="spanTitle">${music.name}</span><a class="btn btn-xs btn-default"
													href="detail.do?id=${music.id}"><b>i</b></a></td>
											</tr>
											<tr>
												<td><p class="pAlbum">${music.artist} / ${music.album }</p></td>
											</tr>
										</table>
									</td>
									<td><a class="btn btn-xs btn-info btnPlay"
										href="addMyList.do?id=${music.id}">담기</a></td>
								</tr>
							</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>

</body>
</html>