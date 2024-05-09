var name1={
    name:"naresh",
    job:"developer",
    place:"madurai"
}
//collection of data => object
//var name2="k"
//console.log(`my name is ${name1}`)

//object(for...in)
for(let val in name1){
    console.log(val+":"+name1[val]);//(name1);//[val]);
}

//array(for...of)
let values=["naresh","rahith","muthu"];
for(let names of values)
{
    console.log(names);
}

//string(for...of)
let string="naresh";
for(let val1 of string)
{
    console.log(val1);
}

var name1=["Thilagaraj","developer","madurai"]
var value1={
    name:"Thilagaraj"
}
console.log(value1.name)