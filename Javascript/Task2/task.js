var box1=document.getElementById("box1")
var box2=document.getElementById("box2")
var box3=document.getElementById("box3")
var box4=document.getElementById("box4")
var box5=document.getElementById("box5")
var box6=document.getElementById("box6")
var box7=document.getElementById("box7")
var box8=document.getElementById("box8")
var box9=document.getElementById("box9")

let user=true;
// user1="X"
// user2="O"
function b1(){
    
    if(user){
        box1.innerHTML="X"
        user=false;
    }
    else{
        box1.innerHTML="O"
        user=true;
    }
    box1.style.pointerEvents="none";
   

    if(b1.innerHTML=="X" && b2.innerHTML=="X" && b3.innerHTML=="X"){
        alert("You win")
    }
    if(b1.innerHTML=="X" && b4.innerHTML=="X" && b7.innerHTML=="X"){
        alert("You win")
    }
    if(b1.innerHTML=="X" && b5.innerHTML=="X" && b9.innerHTML=="X"){
        alert("You win")
    }
        
}    
function b2(){
    
    if(user){
        box2.innerHTML="X"
        user=false;
    }
    else{
        box2.innerHTML="O"
        user=true;
    }
    box2.style.pointerEvents="none";

    if(b1.innerHTML=="X" && b2.innerHTML=="X" && b3.innerHTML=="X"){
        alert("You win")
    }
    else if(b2.innerHTML=="X" && b5.innerHTML=="X" && b8.innerHTML=="X"){
        alert("You win")
    }
    
}
function b3(){
    
    if(user){
        box3.innerHTML="X"
        user=false;
    }
    else{
        box3.innerHTML="O"
        user=true;
    }
    box3.style.pointerEvents="none";

    if(b1.innerHTML=="X" && b2.innerHTML=="X" && b3.innerHTML=="X"){
        alert("You win")
    }
    else if(b3.innerHTML=="X" && b6.innerHTML=="X" && b9.innerHTML=="X"){
        alert("You win")
    }
    else if(b3.innerHTML=="X" && b5.innerHTML=="X" && b7.innerHTML=="X"){
        alert("You win")
    }
}
function b4(){
    
    if(user){
        box4.innerHTML="X"
        user=false;
    }
    else{
        box4.innerHTML="O"
        user=true;
    }
    box4.style.pointerEvents="none";

    if(b4.innerHTML=="X" && b5.innerHTML=="X" && b6.innerHTML=="X"){
        alert("You win")
    }
    else if(b1.innerHTML=="X" && b4.innerHTML=="X" && b7.innerHTML=="X"){
        alert("You win")
    }
}
function b5(){
    
    if(user){
        box5.innerHTML="X"
        user=false;
    }
    else{
        box5.innerHTML="O"
        user=true;
    }
    box5.style.pointerEvents="none";

    if(b4.innerHTML=="X" && b5.innerHTML=="X" && b6.innerHTML=="X"){
        alert("You win")
    }
    else if(b2.innerHTML=="X" && b5.innerHTML=="X" && b8.innerHTML=="X"){
        alert("You win")
    }
    else if(b1.innerHTML=="X" && b5.innerHTML=="X" && b9.innerHTML=="X"){
        alert("You win")
    }
    else if(b3.innerHTML=="X" && b5.innerHTML=="X" && b7.innerHTML=="X"){
        alert("You win")
    }
}
function b6(){
    
    if(user){
        box6.innerHTML="X"
        user=false;
    }
    else{
        box6.innerHTML="O"
        user=true;
    }
    box6.style.pointerEvents="none";

    if(b4.innerHTML=="X" && b5.innerHTML=="X" && b6.innerHTML=="X"){
        alert("You win")
    }
    else if(b3.innerHTML=="X" && b6.innerHTML=="X" && b9.innerHTML=="X"){
        alert("You win")
    }
}
function b7(){
    
    if(user){
        box7.innerHTML="X"
        user=false;
    }
    else{
        box7.innerHTML="O"
        user=true;
    }
    box7.style.pointerEvents="none";

    if(b7.innerHTML=="X" && b8.innerHTML=="X" && b9.innerHTML=="X"){
        alert("You win")
    }
    else if(b1.innerHTML=="X" && b4.innerHTML=="X" && b7.innerHTML=="X"){
        alert("You win")
    }
    else if(b3.innerHTML=="X" && b5.innerHTML=="X" && b7.innerHTML=="X"){
        alert("You win")
    }
}
function b8(){
    
    if(user){
        box8.innerHTML="X"
        user=false;
    }
    else{
        box8.innerHTML="O"
        user=true;
    }
    box8.style.pointerEvents="none";

    if(b7.innerHTML=="X" && b8.innerHTML=="X" && b9.innerHTML=="X"){
        alert("You win")
    }
    else if(b2.innerHTML=="X" && b5.innerHTML=="X" && b8.innerHTML=="X"){
        alert("You win")
    }
}
function b9(){
    
    if(user){
        box9.innerHTML="X"
        user=false;
    }
    else{
        box9.innerHTML="O"
        user=true;
    }
    box9.style.pointerEvents="none";

    if(b7.innerHTML=="X" && b8.innerHTML=="X" && b9.innerHTML=="X"){
        alert("You win")
    }
    else if(b3.innerHTML=="X" && b6.innerHTML=="X" && b9.innerHTML=="X"){
        alert("You win")
    }
    else if(b1.innerHTML=="X" && b5.innerHTML=="X" && b9.innerHTML=="X"){
        alert("You win")
    }
}
// if(b1.innerHTML=="X" && b2.innerHTML=="X" && b3.innerHTML=="X"){
//     alert("You win")
// }
// if(b4.innerHTML=="X" && b5.innerHTML=="X" && b6.innerHTML=="X"){
//     alert("You win")
// }       
// if(b7.innerHTML=="X" && b8.innerHTML=="X" && b9.innerHTML=="X"){
//     alert("You win")
// }
// if(b1.innerHTML=="X" && b4.innerHTML=="X" && b7.innerHTML=="X"){
//     alert("You win")
// }
// if(b2.innerHTML=="X" && b5.innerHTML=="X" && b8.innerHTML=="X"){
//     alert("You win")
// }
// if(b3.innerHTML=="X" && b6.innerHTML=="X" && b9.innerHTML=="X"){
//     alert("You win")
// }
// if(b1.innerHTML=="X" && b5.innerHTML=="X" && b9.innerHTML=="X"){
//     alert("You win")
// }
// if(b3.innerHTML=="X" && b5.innerHTML=="X" && b7.innerHTML=="X"){
//     alert("You win")
// }