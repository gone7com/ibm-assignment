import * as readline from 'readline';

let runtimeVal = readline.createInterface({
	input: process.stdin,
	output: process.stdout
});

runtimeVal.question("Enter a number to find it's hex value: ",
	(answer)=>	{
		var number: number = parseInt(answer);
		var hValue: string = "";
		while(number != 0)	{
			if(number==9)
					hValue += number%16;
						else	if(number==10)
					hValue += "A";

						else if(number==11)
					hValue += "B";

						else	if(number==12)
												hValue += "C";

				else	if(number==13)
					hValue += "D";

		else	if(number==14)
				hValue  += "E";
				else	if(number==15)
					hValue  += "F";
number = Math.floor(number/16);
			}



		var hValRev : string = "";
		for(var i:number=hValue .length-1; i>=0; --i)	{
			hValRev +=hValue [i];



		runtimeVal.close();
}
console.log( hValRev);
});
