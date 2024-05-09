setTimeout(() => {
    document.getElementById("line4").innerHTML="This is a Timeout Example.<5 seconds"
}, 5000);

setTimeout(() => {
    document.getElementById("line3").innerHTML="This is a Timeout Example.<4 seconds"
}, 4000);

setTimeout(() => {
    document.getElementById("line2").innerHTML="This is a Timeout Example.<3 seconds"
}, 3000);

setTimeout(() => {
    document.getElementById("line1").innerHTML="This is a Timeout Example.<2 seconds"
}, 2000);

//set variable & clearTimeout

var b=setTimeout(() => {
    document.getElementById("line1").innerHTML="This is a Timeout Example.<2"
}, 2000);
clearTimeout(b);



//Function setTimeout
//To stop Timeout Function.

const myTimeout = setTimeout(myGreeting, 3000);

function myGreeting() {
    document.getElementById("demo").innerHTML = "Hii students!"
}

function myStopFunction() {
    clearTimeout(myTimeout);
}