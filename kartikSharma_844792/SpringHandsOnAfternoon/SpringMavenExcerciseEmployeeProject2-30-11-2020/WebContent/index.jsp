<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<br>
<br>
<hr>
<form id="allEmployee" action="employeeDb" method="get">
 <button><cite>All EMPLOYEES</cite></button>
   </form>
 <br>
<br>
<hr>
<form id="addEmployee" action="addEmployee" method="post">
<cite>ADD EMPLOYEE</cite><br><br>
    <label>Employee Id : </label>
    <input type="number" name="id">
    <br/>
    <label>Employee Name : </label>
    <input type="text" name="name">
    <br/>
    <label>Employee Salary : </label>
    <input type="number" name="salary">
    <br/>
    <button>Submit</button>
     <b>${exceptionMsg0}</b>
</form>
<br>  
<br>
<hr>
<form id="findEmployee" action="findEmployee" method="get">
<cite>FIND EMPLOYEE</cite><br><br>
    <label>Employee Id : </label>
    <input type="number" name="id">
    <br/>
    <button>Submit</button>
     <b>${exceptionMsg1}</b>
</form>
<br>
<hr>
<form id="removeEmployee" action="removeEmployee" method="get">
<cite>REMOVE EMPLOYEE</cite><br><br>
    <label>Employee Id : </label>
    <input type="number" name="id">
    <br/>
    <label>Employee Name : </label>
    <input type="text" name="name">
    <br/>
    <button>Submit</button>
    <b>${exceptionMsg2}</b>
</form>





</body>
</html>