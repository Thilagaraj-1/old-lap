function greet(name, mycallback) {
    console.log('Hello world');
    mycallback(name);
}

function callBack(name) {
    console.log('hello' + ' ' + name);
}

setTimeout(greet, 2000, 'naresh', callBack);


