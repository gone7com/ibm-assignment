"use strict";
exports.__esModule = true;
var readline = require("readline");
var runtimeVal = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
runtimeVal.question("Sum of digits ", function (answer) {
    var number = parseInt(answer);
    var ans = 0;
    while (number != 0) {
        ans += number % 10;
        number = Math.floor(number / 10);
    }
    console.log("Result: " + ans);
    runtimeVal.close();
});
