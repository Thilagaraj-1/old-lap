//Creating a simple object to serve as a prototype
const personPrototype={
    greet:function(){
        console.log("hello",this.name);
    }
}

const person = Object.create(personPrototype);

person.name="Naresh";
person.age=24;

console.log(person);
person.greet();

