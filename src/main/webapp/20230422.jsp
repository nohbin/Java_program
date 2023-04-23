<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>폼 태그</title>
</head>
<body>
	<form action="process_20230422.jsp" method="post">
		<p>아이디		: <input type = "text" name = "id" placehorder = "아이디">
		<p>비밀번호	: <input type = "password" name = "pwd">
		<p>이름		: <input type = "text" name = "name">
		<p>연락처		: <input type = "text" maxlength="4" name ="phone1">
		- <input type = "text" maxlength="4" name ="phone2">
		- <input type = "text" maxlength="4" name ="phone3">
		<p>성별 		: <input type = "radio" name = "gender" value = "남성" checked="checked">남성
		<input type = "radio" name = "gender" value = "여성">여성
		<p>취미 		: <input type = "checkbox" name  ="hobby" value = "독서">독서
		<input type = "checkbox" name  ="hobby" value = "운동">운동
		<input type = "checkbox" name  ="hobby" value = "영화">영화
		<p>도시 
		<select name = "city" size = 3> <!-- 최초 보여줄 row 의 수 -->
			<option value = "seoul">서울</option>
			<option value = "daejun">대전</option>
			<option value = "daegu">대구</option>
			<option value = "busan">부산</option>
		</select>
		<p>메모 : <textarea name = "comment" rows="10" cols="30" placeholder="한글자 이상 입력하세요"></textarea>
		<p><input type = "submit" value = "가입하기">
		<input type = "reset" value = "다시쓰기">
	</form>
</body>
</html>
