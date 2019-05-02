"use strict";
exports.__esModule = true;
var readline = require("readline");
var runtimeVal = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
runtimeVal.question("Enter string : ", function (answer) {
    var first = 0;
    var second = 0;
    var third = 0;
    var fourth = 0;
    var fifth = 0;
    for (var i = 0; i < answer.length; ++i) {
        if (answer[i] == 'a' || answer[i] == 'A')
            ++first;
        else if (answer[i] == 'e' || answer[i] == 'E')
            ++second;
        else if (answer[i] == 'i' || answer[i] == 'I')
            ++third;
        else if (answer[i] == 'o' || answer[i] == 'O')
            ++fourth;
        else if (answer[i] == 'u' || answer[i] == 'U')
            ++fifth;
    }
    console.log("\na occured: " + first + " times.\ne occured: " + second + " times.\ni occured: " + third + " times.\no occured: " + fourth + " times.\nu occured: " + fifth + " times.\n");
    runtimeVal.close();
});
