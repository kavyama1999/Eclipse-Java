<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>

<nav class="navbar navbar-dark bg-info">
  <div class="container-fluid">
    <div class="navbar-header" >
     
     
             <a class="navbar-brand  text-dark" href="contactdetails.jsp"><b>Home</b></a>
     
    
   </div>
   </div>
    </nav>

<div class="  container mt-5 mb-5 d-flex justify-content-center "> 
  <div class="card  p-4  bg-info">
  <div class="card-body">
  
  <form  action="contact" method="post">
  
  
  <div class="  row mb-3 ">
<span id="timeerror" ></span><br>
            <label for="time" class="form-label  "><b>First Name:</b></label>
            <input type="text" class="form-control " id="time" onblur="timeValidation()"  name="fname">
        </div>
  
  <div class="  row mb-3 ">
<span id="timeerror" ></span><br>
            <label for="time" class="form-label  "><b>Last Name:</b></label>
            <input type="text" class="form-control " id="time" onblur="timeValidation()"  name="lname">
        </div>
  
  <input type="submit" value="send">
  
  
  </form>
  </div>
</div>
</div>

</body>
</html>