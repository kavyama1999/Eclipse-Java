<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<script type="text/javascript"  src="MarketValidation.js"></script>


</head>


<body>


<nav class="navbar navbar-dark bg-info">
  <div class="container-fluid">
    <div class="navbar-header" >
     
     
             <a class="navbar-brand  text-dark" href="index.jsp"><b>Home</b></a>
     

        <a class="navbar-brand   text-dark" href="DegreePercentage.jsp"><b>Degree Percentage</b></a>
<!--               <a class="navbar-brand  text-dark" href="message.jsp"> <b>Message</b></a>
 -->      
   </div>
   </div>
    </nav>
    
    
    <div class="  container mt-5 mb-5 d-flex justify-content-center "> 
  <div class="card  p-4  bg-info">
  <div class="card-body">

<form action="items"   method="post">

<h2>Market Form</h2>

<div class="  row mb-3 ">
<span id="errorname" ></span><br>
            <label for="name" class="form-label  "><b>Name:</b></label>
            <input type="text" class="form-control " id="name" onblur="nameValidation()"  name="name">
        </div>


<div class=" row mb-3">
<span id="locationerror"></span>
 <label for="location" class="form-label"><b>Location:</b></label>
            <select class="form-select custom-select-width" id="location"    onblur="locationValidation()"  name="location" aria-label="Select Color" >
  <option selected value="">select</option>
  <option value="Java Developer">BTM Layout</option>
  <option value="Senior Java Developer">Jayanaga</option>
   <option value="Junior Java Developer">K R Market</option>
 <option value="Senior Java Developer">Malleshwram</option>
   
  </select>
  </div>
  
  <div class=" row mb-3">
<span id="cityerror"></span>
 <label for="city" class="form-label"><b>City:</b></label>
            <select class="form-select custom-select-width" id="city"    onblur="cityValidation()"  name="city" aria-label="Select Color" >
  <option selected value="">select</option>
  <option value="Java Developer">Bengaluru</option>
  <option value="Senior Java Developer">Mysore</option>
   <option value="Junior Java Developer">Karwar</option>
   <option value="Senior Java Developer">Shivamogga</option>
   <option value="Junior Java Developer">Udupi</option>
   
 
  </select>
  </div>
  
  <div class="  row mb-3 ">
<span id="pincodeerror" ></span><br>
            <label for="pincode" class="form-label  "><b>Pincode:</b></label>
            <input type="number" class="form-control " id="pincode" onblur="pincodeValidation()"  name="pincode">
        </div>


 
  <div class="  row mb-3 ">
<span id="areaerror" ></span><br>
            <label for="area" class="form-label  "><b>Area:</b></label>
            <input type="text" class="form-control " id="area" onblur="areaValidation()"  name="area">
        </div>
        
        
        
        
      <div class=" row mb-3">
<span id="typeerror"></span>
 <label for="type" class="form-label"><b>Type:</b></label>
            <select class="form-select custom-select-width" id="type"    onblur="typeValidation()"  name="type" aria-label="Select Color" >
  <option selected value="">select</option>
  <option value="Java Developer">Clothes</option>
  <option value="Senior Java Developer">Grosary</option>
   <option value="Junior Java Developer">Vegetables</option>
   
   
 
  </select>
  </div>
    
        
        
        
       <div class="  row mb-3 ">
<span id="stalerror" ></span><br>
            <label for="stall" class="form-label  "><b>Stall No:</b></label>
            <input type="number" class="form-control " id="stall" onblur="stalValidation()"  name="stall">
        </div>


  
       <div class="  row mb-3 ">
<span id="itemerror" ></span><br>
            <label for="item" class="form-label  "><b>Item Name:</b></label>
            <input type="text" class="form-control " id="item" onblur="itemValidation()"  name="item">
        </div>



       <div class="  row mb-3 ">
<span id="qualityerror" ></span><br>
            <label for="quality" class="form-label  "><b>Item Quality:</b></label>
            <input type="text" class="form-control " id="quality" onblur="qualityValidation()"  name="quality">
        </div>


<div class="  row mb-3 ">
<span id="itemquantityerror" ></span><br>
            <label for="quantity" class="form-label  "><b>Item Quantity:</b></label>
            <input type="text" class="form-control " id="quantity" onblur="quantityValidation()"  name="quantity">
        </div>
        
        
        
        <div class="  row mb-3 ">
<span id="costerror" ></span><br>
            <label for="cost" class="form-label  "><b>Item Cost:</b></label>
            <input type="number" class="form-control " id="cost" onblur="costValidation()"  name="cost">
        </div>


<div class="  row mb-3 ">
<span id="ownererror" ></span><br>
            <label for="owner" class="form-label  "><b>Stall Owner:</b></label>
            <input type="text" class="form-control " id="owner" onblur="ownerValidation()"  name="owner">
        </div>
        
       
        
        <div class="  row mb-3 ">
<span id="keberror" ></span><br>
            <label for="keb" class="form-label  "><b>Stall KEB NO:</b></label>
            <input type="text" class="form-control " id="keb" onblur="kebValidation()"  name="keb">
        </div>


<div class="  row mb-3 ">
<span id="gsterror" ></span><br>
            <label for="gst" class="form-label  "><b>Stall Owner GST NO:</b></label>
            <input type="text" class="form-control " id="gst" onblur="gstValidation()"  name="gst">
        </div>



<div class="  row mb-3 ">
<span id="weeklyerror" ></span><br>
            <label for="weekly" class="form-label  "><b>Weekly Transition:</b></label>
            <input type="number" class="form-control " id="weekly" onblur="weeklyValidation()"  name="weekly">
        </div>









<div>
                <input type="submit"   id="submit" value="Send"  disabled >
        </div>
        
        
        
        
</form>

</div>
</div>
</div>

</body>
</html>