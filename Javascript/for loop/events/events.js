var names=["honda","yamaha","bajaj"]
for(let[index,value] of names.entries())
  {
     console.log(index,value);
  }  

  function clickevent1(){
     console.log("button clicked");
  }

  function clickevent2(){
   console.log("button moved");
} 

function clickevent3(){
   console.log("button down");
}

function clickevent4(){
   console.log("button leaved");
}

//document.getElementById("button1").addEventListener("click",clickevent1);
//document.getElementById("button").innerHTML="changed Text"

var button1=document.getElementById("button1");
button1.innerHTML="log2";
button1.addEventListener('click',clickevent1)