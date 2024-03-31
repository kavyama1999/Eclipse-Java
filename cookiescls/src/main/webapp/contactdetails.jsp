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
  
  
  <!-- <h1>IPL Result </h1> -->

<h1><span style="color:blue">${fname1}</span></h1>
<h1><span style="color:blue">${lname1}</span></h1>
<h3><span style="color:blue">Please provide contact details</h3>

  <form action="contactdetails" method="post">
  
  
  
  <div class="  row mb-3 ">
<span id="timeerror" ></span><br>
            <label for="time" class="form-label  "><b>Email:</b></label>
            <input type="text" class="form-control " id="time" onblur="timeValidation()"  name="email">
        </div>
  
  <div class="  row mb-3 ">
<span id="timeerror" ></span><br>
            <label for="time" class="form-label  "><b>Mobile:</b></label>
            <input type="text" class="form-control " id="time" onblur="timeValidation()"  name="mobile">
        </div>
  
  <input type="submit" value="send">
  
  </form>
 </div>
</div>
</div>

</body>
</html>