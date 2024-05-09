var obj1={
    name: "naresh",
    age: "19"
}

obj1.place="madurai"
console.log("obj1",obj1);

var obj2= new Object();
obj2.name="rahith";
obj2.age= "19";
console.log("obj2",obj2);

obj2.place="chennai"
console.log("obj2",obj2["place"]);
//delete obj2.name;


let nestObj={
    name:"naresh",
    innerObj:{
        role: "dev",
        interest:{
            ml:"html",
            script:"js",
            framework:"vue"
        }
    }
}

console.log(nestObj["innerObj"]["role"]);
console.log(nestObj.innerObj.interest.script);


let objArray={
    name:"naresh",
    arr1:[
        {
            hobbie:"reading",
            time:"6pm" 
        },
        {
            hobbie:"writing",
            time:"7pm"
        }        
        
    ]
}

for (const i in objArray.arr1) {
    console.log(objArray.arr1[i]);
    let newObj=objArray.arr1[i]
    for (const j in newObj){
        console.log(j)
    }
}

function Con1(){
    this.name="naresh",
    this.age="19";
}
var obj1 = new Con1();
var obj2 = new Con1();

console.log(obj2.age);


console.log(Object.keys(obj1));
console.log(Object.values(obj2));

//greet function
const person={
    greet(){
        console.log("Hi this is Greet function");
    }
}
const person1=Object.create(person);
person1.greet();
