import * as readline from 'readline';

let runtimeVal = readline.createInterface({
	input: process.stdin,
	output: process.stdout
});

runtimeVal.question("Sum of digits ",
	(answer)=>	{
		var number: number = parseInt(answer);
		var ans: number = 0;
		while(number != 0)	{
			ans += number % 10;
			number = Math.floor(number/10);
		}
		console.log(`Result: ${ans}`);
		runtimeVal.close();
	}
);
