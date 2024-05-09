function fname(x,y){
    return x*y;
} 
console.log(fname(1000,2))

/*function fname(){
    console.log("sample function")
}
fname("a,b");
*/
function fname(a,b){
    console.log(a/b)
}
fname(1000,25);

//function expression
var value1=function fName(a,b){
    let="name"
    return a*b
}
//anonymous function
var value2=(value1(6,3));
console.log(value2);