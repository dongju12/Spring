<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<c:set var="cpath" value="${pageContext.request.contextPath}" />
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
	src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.min.js"></script>

<!-- Popper JS -->
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>

<!-- 자동완성 기능을 위해 가져온 jquery-ui library -->
<script src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"></script>
<link rel="stylesheet"
	href="https://code.jquery.com/ui/1.13.1/themes/smoothness/jquery-ui.css">

<!-- Chart를 그리기 위해 가져오는 라이브러리 -->
<script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
<script src="https://cdn.jsdelivr.net/npm/chartjs-plugin-datalabels@2"></script>

</head>
<body>
	<div>
		<h1>보유 도서 현황</h1>
	</div>
	<div>
		<table border="1">
			<tr>
				<td>번호</td>
				<td>제목</td>
				<td>작가</td>
				<td>출판사</td>
				<td>ISBN</td>
				<td>보유도서수</td>
			</tr>
			<c:forEach items="${list}" var="b">
				<tr>
					<td>${b.num}</td>
					<td>${b.title}</td>
					<td>${b.author}</td>
					<td>${b.company}</td>
					<td>${b.isbn}</td>
					<td>${b.count}</td>
				</tr>
			</c:forEach>
		</table>
	</div>


	<form action="bookInsert.do" method="post">
		<div>
			<label>제목 :</label> <input name="title" type="text" id="title">
		</div>
		<div>
			<label>작가 :</label> <input name="author" type="text" id="author">
		</div>
		<div>
			<label>출판사 :</label> <input name="company" type="text" id="company">
		</div>
		<div>
			<label>ISBN :</label> <input name="isbn" type="text" id="isbn">
		</div>
		<div>
			<label>보유도서 수 :</label> <input name="count" type="text" id="count">
		</div>

		<button type="submit" onclick="location.href='${cpath}/bookList.do'">등록</button>
	</form>


</body>
</html>