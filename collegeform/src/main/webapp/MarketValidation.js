let fieldsChecks=
{
		"name":false,
		"location":false,
		"city":false,
		 "pincode":false,
         "area":false,
         "type":false,
         "stall":false,
         "item":false,
         "quality":false,
         "quantity":false,
         "cost":false,
         "owner":false,
         "keb":false,
         "gst":false,
         "weekly":false
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

    if(element.value.length >5 && element.value.length <20)
    {
        error.innerHTML = "";
        fieldsChecks["name"] = true;
    }
    else
    {
        error.innerHTML = "Invalid name. Characters should be greater 5 and lessthan 20 ";
        error.style.color="red"
        fieldsChecks["name"] = false;
        
}
    validateAndEnableSubmit();
}


//location
  
  function locationValidation()
{
    let element = document.getElementById("location");
    let error = document.getElementById("locationerror");
    console.log(element);
    console.log(element.value);
    console.log(error);

    if(element.value.length != "0")
    {
        error.innerHTML = "";
        fieldsChecks["location"] = true;
    }
    else
    {
        error.innerHTML = "Please Select Location ";
        error.style.color="red"
        fieldsChecks["location"] = false;
        
}
    validateAndEnableSubmit();
}


//city

 function cityValidation()
{
    let element = document.getElementById("city");
    let error = document.getElementById("cityerror");
    console.log(element);
    console.log(element.value);
    console.log(error);

    if(element.value.length != "0")
    {
        error.innerHTML = "";
        fieldsChecks["city"] = true;
    }
    else
    {
        error.innerHTML = "Please Select City ";
        error.style.color="red"
        fieldsChecks["city"] = false;
        
}
    validateAndEnableSubmit();
}
 
 
 //Pincode
 
 function pincodeValidation()
{
    let element = document.getElementById("pincode");
    let error = document.getElementById("pincodeerror");
    console.log(element);
    console.log(element.value);
    console.log(error);

    if(element.value.length == 6)
    {
        error.innerHTML = "";
        fieldsChecks["pincode"] = true;
    }
    else
    {
        error.innerHTML = "number should contain excat 6 numbers";
        error.style.color="red"
        fieldsChecks["pincode"] = false;
        
}
    validateAndEnableSubmit();
}

//Area

function areaValidation()
{
    let element = document.getElementById("area");
    let error = document.getElementById("areaerror");
    console.log(element);
    console.log(element.value);
    console.log(error);

    if(element.value.length >5 && element.value.length <20)
    {
        error.innerHTML = "";
        fieldsChecks["area"] = true;
    }
    else
    {
        error.innerHTML = "Please Enter area..it should be contain greater than 5 and less than 20";
        error.style.color="red"
        fieldsChecks["area"] = false;
        
}
    validateAndEnableSubmit();
}

//Type


function typeValidation()
{
    let element = document.getElementById("type");
    let error = document.getElementById("typeerror");
    console.log(element);
    console.log(element.value);
    console.log(error);

    if(element.value.length != "0")
    {
        error.innerHTML = "";
        fieldsChecks["type"] = true;
    }
    else
    {
        error.innerHTML = "Please Select Type";
        error.style.color="red"
        fieldsChecks["type"] = false;
        
}
    validateAndEnableSubmit();
}

//Stall No

function stalValidation()
{
    let element = document.getElementById("stall");
    let error = document.getElementById("stalerror");
    console.log(element);
    console.log(element.value);
    console.log(error);

    if(element.value >1 && element.value <8)
    {
        error.innerHTML = "";
        fieldsChecks["stall"] = true;
    }
    else
    {
        error.innerHTML = "Please enter Stallnumber..It should be >1 and <8 ";
        error.style.color="red"
        fieldsChecks["stall"] = false;
        
}
    validateAndEnableSubmit();
}


//Item Name

function itemValidation()
{
    let element = document.getElementById("item");
    let error = document.getElementById("itemerror");
    console.log(element);
    console.log(element.value);
    console.log(error);

    if(element.value.length >3 && element.value.length <20)
    {
        error.innerHTML = "";
        fieldsChecks["item"] = true;
    }
    else
    {
        error.innerHTML = "Please enter Item..It should be >3 and <20 ";
        error.style.color="red"
        fieldsChecks["item"] = false;
        
}
    validateAndEnableSubmit();
}


//Item Quality

function qualityValidation()
{
    let element = document.getElementById("quality");
    let error = document.getElementById("qualityerror");
    console.log(element);
    console.log(element.value);
    console.log(error);

    if(element.value.length >1 && element.value.length <30)
    {
        error.innerHTML = "";
        fieldsChecks["quality"] = true;
    }
    else
    {
        error.innerHTML = "Please enter quality..It should be >1 and <30 ";
        error.style.color="red"
        fieldsChecks["quality"] = false;
        
}
    validateAndEnableSubmit();
}

//Item Quantity

function quantityValidation()
{
    let element = document.getElementById("quantity");
    let error = document.getElementById("itemquantityerror");
    console.log(element);
    console.log(element.value);
    console.log(error);

    if(element.value >1 && element.value <1000)
    {
        error.innerHTML = "";
        fieldsChecks["quantity"] = true;
    }
    else
    {
        error.innerHTML = "Please enter Quantity..It should be >1 and <1000 ";
        error.style.color="red"
        fieldsChecks["quantity"] = false;
        
}
    validateAndEnableSubmit();
}

//cost

function costValidation()
{
    let element = document.getElementById("cost");
    let error = document.getElementById("costerror");
    console.log(element);
    console.log(element.value);
    console.log(error);

    if(element.value >1 && element.value <1000)
    {
        error.innerHTML = "";
        fieldsChecks["cost"] = true;
    }
    else
    {
        error.innerHTML = "Please enter Cost..It should be >1 and <1000 ";
        error.style.color="red"
        fieldsChecks["cost"] = false;
        
}
    validateAndEnableSubmit();
}

//Stall Owner

function ownerValidation()
{
    let element = document.getElementById("owner");
    let error = document.getElementById("ownererror");
    console.log(element);
    console.log(element.value);
    console.log(error);

    if(element.value.length >1 && element.value.length <20)
    {
        error.innerHTML = "";
        fieldsChecks["owner"] = true;
    }
    else
    {
        error.innerHTML = "Please owner name..It should be >1 and <20 ";
        error.style.color="red"
        fieldsChecks["owner"] = false;
        
}
    validateAndEnableSubmit();
}

//Stall KEB No

function kebValidation()
{
    let element = document.getElementById("keb");
    let error = document.getElementById("keberror");
    console.log(element);
    console.log(element.value);
    console.log(error);

    if(element.value.length >1 && element.value.length <20)
    {
        error.innerHTML = "";
        fieldsChecks["keb"] = true;
    }
    else
    {
        error.innerHTML = "Please enter KEB number..It should be >1 and <20 ";
        error.style.color="red"
        fieldsChecks["keb"] = false;
        
}
    validateAndEnableSubmit();
}

//Stall Owner GST No

function gstValidation()
{
    let element = document.getElementById("gst");
    let error = document.getElementById("gsterror");
    console.log(element);
    console.log(element.value);
    console.log(error);

    if(element.value.length >1 && element.value.length <20)
    {
        error.innerHTML = "";
        fieldsChecks["gst"] = true;
    }
    else
    {
        error.innerHTML = "Please enter Gst number..It should be >1 and <20";
        error.style.color="red"
        fieldsChecks["gst"] = false;
        
}
    validateAndEnableSubmit();
}

//weekly Transaction

function weeklyValidation()
{
    let element = document.getElementById("weekly");
    let error = document.getElementById("weeklyerror");
    console.log(element);
    console.log(element.value);
    console.log(error);

    if(element.value >1 && element.value <20)
    {
        error.innerHTML = "";
        fieldsChecks["weekly"] = true;
    }
    else
    {
        error.innerHTML = "Please enter Transaction..It should be >1 and <20 ";
        error.style.color="red"
        fieldsChecks["weekly"] = false;
        
}
    validateAndEnableSubmit();
}
