package xs;

public class javascripvalidatiom {

}









function pincodeValidation() {
    let element = document.getElementById("pincode");
    let error = document.getElementById("pincodeerror");
    let pincode = element.value.trim(); // Trim any leading or trailing whitespace
    console.log(element);
    console.log(pincode);
    console.log(error);

    if (pincode.length == 6 && !/^(\d)\1{5}$/.test(pincode)) {
        error.innerHTML = "";
        fieldsChecks["pincode"] = true;
    } else {
        error.innerHTML = "Pincode should contain exactly 6 digits and not be all the same.";
        error.style.color = "red";
        fieldsChecks["pincode"] = false;
    }
    validateAndEnableSubmit();
}