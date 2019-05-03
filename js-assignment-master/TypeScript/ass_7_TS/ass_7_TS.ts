import * as readline from 'readline';

let runtimeVal = readline.createInterface({
	input: process.stdin,
	output: process.stdout
});

runtimeVal.question("Enter string : ",
	(answer)=>	{
		var first: number = 0;
var second: number = 0;
		var third: number = 0;
		var fourth: number = 0;
		var fifth: number = 0;
		for(let i: number=0; i<answer.length; ++i)	{
			if(answer[i] == 'a' || answer[i] == 'A')	++first;
			else if(answer[i] == 'e' || answer[i] == 'E')	++second;
			else if(answer[i] == 'i' || answer[i] == 'I')	++third;
			else if(answer[i] == 'o' || answer[i] == 'O')	++fourth;
			else if(answer[i] == 'u' || answer[i] == 'U')	++fifth;
		}
		console.log(`
a occured: ${first} times.
e occured: ${second} times.
i occured: ${third} times.
o occured: ${fourth} times.
u occured: ${fifth} times.
`);
		runtimeVal.close();
	}
);
