const {stdin,stdout} = require('process')

const rl = require("readline").createInterface({
    input: stdin,
    output: stdout
})

// rl.question("What is your name : ", (val)=>{
//     console.log("Welcome ",val)
//     readline.close()
// })

rl.question("What is your name : ",val)

function val(answer){
    console.log("Answer is: ",answer)
    rl.close()
}