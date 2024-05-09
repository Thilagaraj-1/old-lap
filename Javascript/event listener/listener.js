function fun1(){
    console.log("div click");
}
function fun2(){
    console.log("para");
}
var button1=document.getElementById('div1')
var button2=document.getElementById('p1')
button1.addEventListener('dblclick',fun1,true)
button2.addEventListener('dblclick',fun2,true)