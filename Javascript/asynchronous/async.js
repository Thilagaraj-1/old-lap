// a promise
let promise = new Promise(function (resolve, reject) {
    setTimeout(function () {
    resolve('Promise resolved')}, 3000);
});
// var set1=setTimeout(() => {
//     name1("done");
// }, 1000);
// function name1(params) {
//     console.log(params);
// }
// // async function
async function asyncFunc() {
    // wait until the promise resolves
    let result = await promise;
    // let result = await set1;
    console.log(result);
    console.log('hello');
}
// // calling the async function
asyncFunc();