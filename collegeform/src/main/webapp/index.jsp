<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Collge Information</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>

<nav class="navbar navbar-dark bg-info">
  <div class="container-fluid">
    <div class="navbar-header" >
     

        <a class="navbar-brand  text-dark" href="DegreePercentage.jsp"><b>Degree Percentage</b></a>
              
              <a class="navbar-brand  text-dark" href="Market.jsp"><b>Market Form</b></a>
      
   </div>
   </div>
    </nav>
    
  
         

</body>

  <div class="  container mt-5 mb-5 d-flex justify-content-center "> 
  <div class="card  p-4  bg-info">
  <div class="card-body">
<h2>Message</h2>

<form action="water" method="post">

<div class=" row mb-3 ">
<span id="errorflowe" ></span><br>
            <label for="jasmine" class="form-label  "><b>Message</b></label>
            <input type="text" class="form-control " id="jasmine"  name="message" >
        </div>
        
        <input type="submit"   id="submit" value="Send" >
        

</form>

</div>
</div>
</div>

</html>
