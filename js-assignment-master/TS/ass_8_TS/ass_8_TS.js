"use strict";
exports.__esModule = true;
var readline = require("readline");
var runtimeVal = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
runtimeVal.question("Enter a number to find it's hex value: ", function (answer) {
    var number = parseInt(answer);
    var hValue = "";
    while (number != 0) {
        if (number % 16 <= 9)
            hValue += number % 16;
        else if (number % 16 == 10)
            hValue += "A";
        else if (number % 16 == 11)
            hValue += "B";
        else if (number % 16 == 12)
            hValue += "C";
        else if (number % 16 == 13)
            hValue += "D";
        else if (number % 16 == 14)
            hValue += "E";
        else if (number % 16 == 15)
            hValue += "F";
        number = Math.floor(number / 16);
    }
    var hValRev = "";
    for (var i = hValue.length - 1; i >= 0; --i) {
        hValRev += hValue[i];
        runtimeVal.close();
    }
    console.log(hValRev);
});
