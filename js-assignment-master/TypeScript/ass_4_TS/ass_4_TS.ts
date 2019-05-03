// var key of ansString
import * as readline from 'readline';


  let valFromRuntime = readline.createInterface({
      input: process.stdin,
      output: process.stdout
    });

        valFromRuntime.question('Please enter a Number ',(userInput) => {
          var tuple={
1:"dheeraj",
2:"akash"

          }
var ansString:string=userInput;
var flag:number=1;
for(var i in tuple){
if(userInput==i){
  flag=0;
  console.log(tuple[userInput])
}
}
 if(flag!=0)
  console.log("not found")
})
