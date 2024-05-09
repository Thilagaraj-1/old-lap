var obj = {Name:'naresh'}
sessionStorage.setItem("msk",obj);
console.log("===========================",sessionStorage.getItem("msk"));

var obj = {Name:'mayakanna'}
sessionStorage.setItem("ns",obj);
console.log(sessionStorage.getItem("ns"));

//sessionStorage.removeItem("key")
sessionStorage.clear();

/*var sValue=("session 1 value");
var obj1={
    name: 'naresh',
    role: 'dev'
}

sessionStorage.setitem("current_user",JSON.stringify(obj1));
var session1=sessionStorage.getItem("session");

console.log("JSON.stringify(obj1))",JSON.stringify(obj));
console.log("session1 value =====> ",JSON.parse(sessionStorage.getItem("current_user")));
*/