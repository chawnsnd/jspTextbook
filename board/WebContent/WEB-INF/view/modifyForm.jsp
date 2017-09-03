<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="u" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시글수정</title>
</head>
<body>
<form action="modify.do" method="post">
<p>
	번호:<br/>${modReq.articleNumber }
	
	<input type="hidden" name="no" value="${modReq.articleNumber }">
</p>
<p>
	제목:<br/><input type="text" name="title" value="${modReq.title }">
	<c:if test="${errors.title }">제목을 입력하세요.</c:if>
</p>
<p>
	내용:<br/>
	<textarea name="content" rows="5" cols="30">${modReq.content }</textarea>
	<c:if test="${errors.title }">제목을 입력하세요.</c:if>
</p>
<input type="submit" value="글 수정">
</form>
</body>
</html>

