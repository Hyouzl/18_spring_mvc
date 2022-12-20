<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입폼</title>
</head>
<body>

	<form action="transfer4" method="post"> 
		<input type="hidden" name="isPC" value="true">
		<input type="hidden" name="locationCd" value="1">
		<input type="hidden" name="lang" value="kor">
		<fieldset>
			<legend>회원가입</legend>
			<p> 아이디 : <input type="text" name="memberId" /></p>
			<p> 이름 :  <input type="text" name="memberName" /></p>
			<p> 
				성별 : <select name="memberGender">
							<option value="M">남자</option>
							<option value="F">여자</option>
						</select>
			</p>		
			<p> 연락처 : <input type="text"  name="hp" ></p>		
			<p> 이메일 : <input type="email" name="email" ></p>		
			<p> 거주지 : <input type="text"  name="residence" ></p>		
		    <p><input type="submit" value="회원가입" ></p>
		</fieldset>	
     </form>
     
    <p>이미 회원가입이 되어있으면 <a href="transfer5?isMember=false&isSession=false">로그인(param)으로 이동하기</a></p>
    <p>이미 회원가입이 되어있으면 <a href="transfer6/false/false">로그인(path variable)으로 이동하기</a></p>

</body>
</html>