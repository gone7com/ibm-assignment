"use strict";
exports.__esModule = true;
// var key of ansString
var readline = require("readline");
var valFromRuntime = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
valFromRuntime.question('Please enter a Number ', function (userInput) {
    var tuple = {
        1: "dheeraj",
        2: "akash"
    };
    var ansString = userInput;
    var flag = 1;
    for (var i in tuple) {
        if (userInput == i) {
            flag = 0;
            console.log(tuple[userInput]);
        }
    }
    if (flag != 0)
        console.log("not found");
});
