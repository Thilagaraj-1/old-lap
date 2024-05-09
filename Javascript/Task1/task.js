var range=document.getElementById("range")
function rangeFn(x){
    console.log("onclick",x);
    if (x==1){
        range.value=10;
    }
    else if (x==2){
        range.value=20;
    }
    else if (x==3){
        range.value=30;
    }
    else if (x==4){
        range.value=40;
    }
    else if (x==5){
        range.value=50;
    }
}