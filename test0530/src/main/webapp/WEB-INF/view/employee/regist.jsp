<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>직원 등록</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css">
</head>
<body>
<form:form modelAttribute="employee" action="regist" method="post">
<table>
<tr><td colspan="2">회원가입
<spring:hasBindErrors name="employee">
    <font color="red">
      <c:forEach items="${errors.globalErrors }" var="error">
        <br><spring:message code="${error.code }"/>
      </c:forEach>
    </font>
  </spring:hasBindErrors>
</td></tr>
<tr><th>사번</th><td><form:input path="empno"/><form:errors path="empno" /></td></tr>
<tr><th>이름</th><td><form:input path="name"/><form:errors path="name" /></td></tr>
<tr><th>집주소1</th><td><form:input path="addr1"/><form:errors path="addr1" /></td></tr>
<tr><th>집주소2</th><td><form:input path="addr2"/><form:errors path="addr2" /></td></tr>
<tr><th>우편번호</th><td><form:input path="zipcode"/><form:errors path="zipcode" /></td></tr>
<tr><th>태어난 연도</th><td><form:input path="birthyear"/><form:errors path="birthyear" /></td></tr>
<tr><th>팀 번호</th><td><form:input path="teamno"/><form:errors path="teamno" /></td></tr>
<tr><th>입사일</th><td><form:input path="hiredate"/><form:errors path="hiredate" /></td></tr>
<tr><td colspan="2"><input type="submit" value="등록" /></td></tr>
</table>
</form:form>
</body>
</html>