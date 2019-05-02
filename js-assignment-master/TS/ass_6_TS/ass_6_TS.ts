import * as readline from 'readline';

let runtimeVal = readline.createInterface({
	input: process.stdin,
	output: process.stdout
});

function Result(num1?: number, num2?: number, num3?: number)	{


	var marksTotal: number = num1 + num2 + num3;
var result: boolean = true;
	if(marksTotal < 125)	{
		result = false;
	}
	if (num1 < 40)	{
		result = false;
	}
	if (num2 < 40)	{
		result = false;
	}
	if (num3 < 40)	{
		result = false;
	}

	//Test for result
	if(result == false)	{
		console.log("Fail");
	}
	else	{
		console.log("Pass");
	}
}

runtimeVal.question("Enter 3 numbers : ",
	(answer)=>	{
		var subjects = answer.split(" ");
		var firstSub = parseInt(subjects[0]);
		var secondSub = parseInt(subjects[1]);
		var thirdSub = parseInt(subjects[2]);

		Result(firstSub, secondSub, thirdSub);
		runtimeVal.close();
	}
);
