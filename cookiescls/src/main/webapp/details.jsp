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
  
  <h2>Below are complete details</h2>
  <h1>First Name:<span style="color:blue">${fname1}</span></h1>
<h1>Last Name:<span style="color:blue">${lname1}</span></h1>
<h1>Email:<span style="color:blue">${email1}</span></h1>
<h1>Mobile:<span style="color:blue">${mobile1}</span></h1>
   
     </div>
</div>
</div>
    

</body>
</html>