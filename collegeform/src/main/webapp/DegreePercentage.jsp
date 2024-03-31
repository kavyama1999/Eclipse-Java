<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Degree Percentage</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<script>

let fieldsChecks=
{
		"name":false,
		"email":false,
		"clg":false,
		 "degree1":false,
         "stream1":false,
         "percentage":false
         
	}

function validateAndEnableSubmit()
{
    let flag = false;

    for(let [key, value] of Object.entries(fieldsChecks))
    {

        if(value === false)
        {
            flag = true;
            break;
        }
    }

    if(!flag)
    {
        document.getElementById("submit").removeAttribute("disabled");
    }else
    {
        document.getElementById("submit").setAttribute("disabled","");
    }
}

//name
function nameValidation()

{
    let element = document.getElementById("name");
    let error = document.getElementById("errorname");
    console.log(element);
    console.log(element.value);
    console.log(error);

    if(element.value.length >3)
    {
        error.innerHTML = "";
        fieldsChecks["name"] = true;
    }
    else
    {
        error.innerHTML = "Invalid name. Characters should be greater than 3 ";
        error.style.color="red"
        fieldsChecks["name"] = false;
        
}
    validateAndEnableSubmit();
}

//Email

function emailIdValidation()

{
    let element = document.getElementById("email");
    let error = document.getElementById("erroremail");
    console.log(element);
    console.log(element.value);
    console.log(error);

    if(element.value.length != "0")
    {
        error.innerHTML = "";
        fieldsChecks["email"] = true;
    }
    else
    {
        error.innerHTML = "Please enter emailId ";
        error.style.color="red"
        fieldsChecks["email"] = false;
        
}
    validateAndEnableSubmit();
}


//College

function clgValidation()

{
    let element = document.getElementById("clg");
    let error = document.getElementById("clgerror");
    console.log(element);
    console.log(element.value);
    console.log(error);

    if(element.value.length >3)
    {
        error.innerHTML = "";
        fieldsChecks["clg"] = true;
    }
    else
    {
        error.innerHTML = "Please Select  College ";
        error.style.color="red"
        fieldsChecks["clg"] = false;
        
}
    validateAndEnableSubmit();
}


//Degree

function degreeValidation()

{
    let element = document.getElementById("degree1");
    let error = document.getElementById("degreerror");
    console.log(element);
    console.log(element.value);
    console.log(error);

    if(element.value.length !="0")
    {
        error.innerHTML = "";
        fieldsChecks["degree1"] = true;
    }
    else
    {
        error.innerHTML = "Please select degree ";
        error.style.color="red"
        fieldsChecks["degree1"] = false;
        
}
    validateAndEnableSubmit();
}


//Stream

function streamValidation()

{
    let element = document.getElementById("stream1");
    let error = document.getElementById("streamerror");
    console.log(element);
    console.log(element.value);
    console.log(error);

    if(element.value.length !="0")
    {
        error.innerHTML = "";
        fieldsChecks["stream1"] = true;
    }
    else
    {
        error.innerHTML = "Please Select Stream";
        error.style.color="red"
        fieldsChecks["stream1"] = false;
        
}
    validateAndEnableSubmit();
}


//Percentage

function percentageValidation()
{
    let element = document.getElementById("percentage");
    let error = document.getElementById("pererror");
    console.log(element);
    console.log(element.value);
    console.log(error);

    if(element.value.length !="0")
    {
        error.innerHTML = "";
        fieldsChecks["percentage"] = true;
    }
    else
    {
        error.innerHTML = "Please enter percentage ";
        error.style.color="red"
        fieldsChecks["name"] = false;
        
}
    validateAndEnableSubmit();
}
</script>





















</head>


<body>


<nav class="navbar navbar-dark bg-dark">
  <div class="container-fluid">
    <div class="navbar-header" >
     

        <a class="navbar-brand" href="DegreePercentage.jsp">Degree Percentage</a>
              <a class="navbar-brand" href="message.jsp">Message</a>
      
   </div>
   </div>
    </nav>
    
  
       <div class="  container mt-5 mb-5 d-flex justify-content-center "> 
  <div class="card  p-4  bg-secondary">
  <div class="card-body">
     

<form  action="dg" method="post">



<h2> &nbsp;&nbsp;&nbsp;<b>Degree Percentage Form</b></h2>


<div class="  row mb-3 ">
<span id="errorname" ></span><br>
            <label for="name" class="form-label  "><b>Name:</b></label>
            <input type="text" class="form-control " id="name" onblur="nameValidation()"  name="name">
        </div>

<div class="  row mb-3 ">
<span id="erroremail" ></span><br>
            <label for="email" class="form-label  "><b>Email:</b></label>
            <input type="text" class="form-control " id="email" onblur="emailIdValidation()"  name="email">
        </div>



<div class=" row mb-3">
<span id="clgerror"></span>
 <label for="clg" class="form-label"><b>College:</b></label>
            <select class="form-select custom-select-width" id="clg"    onblur="clgValidation()"  name="college" aria-label="Select Color" >
  <option selected value="">select</option>
  <option value="Java Developer">BGS College</option>
  <option value="Senior Java Developer">GFGC Clg</option>
   <option value="Junior Java Developer">Presidency Clg</option>
 
  </select>
  </div>
  
  
  <div class=" row mb-3">
<span id="degreerror"></span>
 <label for="degree1" class="form-label"><b>Degree:</b></label>
            <select class="form-select custom-select-width" id="degree1"    onblur="degreeValidation()"  name="degree" aria-label="Select Color" >
  <option selected value="">select</option>
  <option value="">Msc</option>
  <option value="">Bsc</option>
   <option value="">BE</option>
 
  </select>
  </div>
  
  <div class=" row mb-3">
<span id="streamerror"></span>
 <label for="stream1" class="form-label"><b>Stream:</b></label>
            <select class="form-select custom-select-width" id="stream1"    onblur="streamValidation()"  name="stream" aria-label="Select Color" >
  <option selected value="">select</option>
  <option value="Java Developer">Cs</option>
  <option value="Senior Java Developer">Electronics</option>
   <option value="Junior Java Developer">Mathematics</option>
 
  </select>
  </div>
  
  
  
  


<div class="  row mb-3 ">
<span id="pererror" ></span><br>
            <label for="percentage" class="form-label  "><b>Percentage:</b></label>
            <input type="text" class="form-control " id="percentage" onblur="percentageValidation()"  name="percenatge">
        </div>
        
        <div>
                <input type="submit"   id="submit" value="Send"  disabled>
        </div>
</form>

</div>
</div>
</div>

</body>


</html>