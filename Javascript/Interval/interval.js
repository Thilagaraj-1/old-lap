var time1=setInterval(() => {
    timeCal()
    //document.getElementById("line1").innerHTML+="This is an Interval Example for every 2 seconds"
}, 1000);

function timeCal (params) {
    var date1= new Date();
    var time = date1.toLocaleTimeString()
    document.getElementById("Current time").innerHTML=time;
}
function myStopFunction() {
    clearInterval(time1);
}
