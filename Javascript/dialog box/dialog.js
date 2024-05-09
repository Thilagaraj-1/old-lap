//alert dialog box
function alert1(){
    alert("alert called")
}

//confirmation dialog box
function confirm1(){
    var cVal1= confirm("Do you want to Exit")
    if (cVal1) {
        console.log("exit");
    }
    else{
        console.log("continue");
    }
}

//prompt dialog box
function prompt1(){
    var pVal2= prompt("My Name")
    if (pVal2!="null" && pVal2!="") {
        console.log("prompt value", pVal2);
    }
}

   
