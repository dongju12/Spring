<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<c:set var="cpath" value="${pageContext.request.contextPath}"/>
<!-- == controller -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>

<!-- Popper JS -->
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

	<div class="jumbotron">
		<h1>빅데이터 23차 게시판</h1>
		<p>Bootstrap을 사용하여 간단하게 게시판 만들기</p>
	</div>
	
	<div class="container">
		<div class="card">
			<div class="card-header">게시판 연습</div>
			<div class="card-body">
			
				<form class="form-inline">         
		           <div align="right" class="form-group">
		              <select class="form-control btn-warning" id="sel1">
		                <option class="btn-light">작성자</option>
		                <option class="btn-light">제목</option>
		              </select>
		           </div>
	              <input type ="text" class="form-control">
	              <input type="submit" class="btn btn-warning btn-sm" value="검색">
	            </form>
	           	<br>
			
				<table class="table table-bordered table-hover">
					<tr>
						<td>번호</td>
						<td>제목</td>
						<td>작성자</td>
						<td>작성일</td>
					</tr>
					<!-- JSTL/EL 사용해서 request영역안에 저장에 있는 게시글 정보를 전부 화면에 출력 -->
					<c:forEach items="${list}" var="b">
					<tr>
						<td>${b.idx}</td>
						<td>
							<!-- 1. QueryString으로 데이터 보내기
								 2. 경로상에 그냥 바로 데이터 포함해서 보내기
							 -->
							<a href="${cpath}/boardContent/${b.idx}">${b.title}</a>
						</td>
						<td>${b.writer}</td>
						<td>${b.indate}</td>
					</tr>
					</c:forEach>
				</table>
				<button onclick="location.href='${cpath}/register'" class="btn btn-primary btn-sm">글쓰기</button>
			</div>
		</div>
	</div>
	
</body>
</html>