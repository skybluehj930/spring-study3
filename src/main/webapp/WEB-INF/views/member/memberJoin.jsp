<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/boot.jsp"></c:import>
<c:import url="../template/nav.jsp"></c:import>
</head>
<body>
<div class="container">
  <h2>Join form</h2>
  <form action="./member/memberJoin" method="post" enctype="multipart/form-data">
  
    <div class="form-group">
      <label for="id">Id:</label>
      <input type="text" class="form-control" id="id" placeholder="Enter Id" name="id">
    </div>
    
    <div class="form-group">
      <label for="pw">Password:</label>
      <input type="password" class="form-control" id="pw" placeholder="Enter password" name="pw">
    </div>
    
    <div class="form-group">
      <label for="name">Name:</label>
      <input type="text" class="form-control" id="name" placeholder="Enter Name" name="name">
    </div>
    
    <div class="form-group">
      <label for="id">Age:</label>
      <input type="text" class="form-control" id="age" placeholder="Enter Age" name="age">
    </div>
    
    <div class="form-group">
      <label for="id">Birth:</label>
      <input type="date" class="form-control" id="Birth" placeholder="Enter Birth" name="birth">
    </div>
    
    <div class="form-group">
      <label for="pic">Picture:</label>
      <input type="file" class="form-control" id="pic" name="pic">
    </div>
    
    <div class="checkbox">
      <label><input type="checkbox" name="remember"> Remember me</label>
    </div>
    
    <button type="submit" class="btn btn-default">Join</button>
    
  </form>
</div>
</body>
</html>