<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<script type="text/javascript"  src="IPLValidation.js"></script>

</head>

<body>
<nav class="navbar navbar-dark bg-info">
  <div class="container-fluid">
    <div class="navbar-header" >
     
     
             <a class="navbar-brand  text-dark" href="index.jsp"><b>Home</b></a>
     
    
   </div>
   </div>
    </nav>
    
    <!-- card -->
 <div class="  container mt-5 mb-5 d-flex justify-content-center "> 
  <div class="card  p-4  bg-info">
  <div class="card-body">

<form action="match" method="post">


<h2><b>&nbsp;&nbsp;IPL Match Form</b></h2><br>

<div class="  row mb-3 ">
<span id="matchnoerror" ></span><br>
            <label for="matchno" class="form-label  "><b>MATCH NO:</b></label>
            <input type="number" class="form-control " id="matchno" onblur="matchnoValidation()"  name="matchno">
        </div>


<div class=" row mb-3">
<span id="matcherror"></span>
 <label for="match" class="form-label"><b>MATCH:</b></label>
            <select class="form-select custom-select-width" id="match"    onblur="matchValidation()"  name="match" aria-label="Select Color" >
  
  <option selected value="">select</option>
  <option >RCB VS CSK </option>
  <option >KKR VS SRH</option>
   <option >RR VS LSG</option>
 <option >MI VS RR</option>
 <option >RCS VS KKR</option>
  <option >GT VS PBKS</option>
   <option >RR VS DC</option>
 <option >GT VS PBKS</option>
   
  </select>
  </div>
  

<div class="  row mb-3 ">
<span id="dateerror" ></span><br>
            <label for="date" class="form-label  "><b>DATE:</b></label>
            <input type="date" class="form-control " id="name" onblur="dateValidation()"  name="date">
        </div>


<div class="  row mb-3 ">
<span id="dayerror" ></span><br>
            <label for="day" class="form-label  "><b>DAY:</b></label>
            <input type="text" class="form-control " id="day" onblur="dayValidation()"  name="day">
        </div>


<div class="  row mb-3 ">
<span id="timeerror" ></span><br>
            <label for="time" class="form-label  "><b>TIME(PM):</b></label>
            <input type="time" class="form-control " id="time" onblur="timeValidation()"  name="time">
        </div>



<div class=" row mb-3">
<span id="venueerror"></span>
 <label for="venue" class="form-label"><b>VENUE:</b></label>
            <select class="form-select custom-select-width" id="venue"    onblur="venueValidation()"  name="venue" aria-label="Select Color" >
  
  <option selected value="">select</option>
  <option >CHENNAI </option>
  <option >MOHALI</option>
   <option >KOLAKATA</option>
 <option >BENGALURU</option>
 <option >MUMBAI</option>
  <option >HYDERABAD</option>
   <option >JAIPUR</option>
 <option >LUCKNOW</option>
    <option >AHMEDABAD</option>
   
  </select>
  </div>
  
  <div class="  row mb-3 ">
<span id="tosswinnererror" ></span><br>
            <label for="tosswinner" class="form-label  "><b>TOSS WINNER:</b></label>
            <input type="text" class="form-control " id="tosswinner" onblur="tosswinnerValidation()"  name="tosswinner">
        </div>
        
  
  
  
 <div>
 <span id="errorrechargetype"></span>
</div>
 <b>TOSS WINNER:</b><div class="form-check">
 
  <input class="form-check-input" type="radio" name="winner" value="Monthly" id="flexRadioDefault1"  onclick="bat()">
  
  <label class="form-check-label" for="flexRadioDefault1"> BATTING
   
   </label>
</div>
<div class="form-check">
  <input class="form-check-input" type="radio" name="winner"  value="Topup" id="flexRadioDefault2" onclick="bat()" >
  <label class="form-check-label" for="flexRadioDefault2"> BOWLING
   
  </label>
</div>

  
  
  <div class="  row mb-3 ">
<span id="thometeamerror" ></span><br>
            <label for="hometeam" class="form-label  "><b>HOME TEAM:</b></label>
            <input type="text" class="form-control " id="hometeam" onblur="hometeamValidation()"  name="hometeam">
        </div>
  

 
  <div class="  row mb-3 ">
<span id="awayteamerror" ></span><br>
            <label for="awayteam" class="form-label  "><b>AWAY TEAM:</b></label>
            <input type="text" class="form-control " id="awayteam" onblur="hawayteamValidation()"  name="awayteam">
        </div>



  <div class="  row mb-3 ">
<span id="manofthematcherror" ></span><br>
            <label for="manofthematch" class="form-label  "><b>MAN OF TH MATCH :</b></label>
            <input type="number" class="form-control " id="manofthematch" onblur="manofthematchValidation()"  name="manofthematch">
        </div>



<div class="  row mb-3 ">
<span id="totalrunserror" ></span><br>
            <label for="totalruns" class="form-label  "><b>TOTAL RUNS SCORED :</b></label>
            <input type="text" class="form-control " id="totalruns" onblur="totalrunsValidation()"  name="totalruns">
        </div>




<div class=" row mb-3">
<span id="inningserror"></span>
 <label for="innings" class="form-label"><b>INNINGS:</b></label>
            <select class="form-select custom-select-width" id="innings"    onblur="inningsValidation()"  name="innings" aria-label="Select Color" >
  
  <option selected value="">select</option>
  <option >INNING 1 SCORE </option>
  <option >INNING 1 WICKETS</option>
   <option >INNING 2 SCORE</option>
 <option >INNING 2 WICKET</option>
 
   
  </select>
  </div>





<input type="submit" value="submit" >

</form>
</div>
</div>
</div>

</body>
</html>