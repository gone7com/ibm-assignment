var myMatrix: number[][] = [[7, 7, 7], [5, 5, 8], [8, 5, 4]];

function myDiagonal(newmatrix: number[][])	{
	for(let i=0; i<newmatrix.length; ++i)	{
		for(let j=newmatrix.length-1 ; j>=0; --j)	{
			if(i+j == newmatrix.length-1)	{
				console.log(` Diagonal number ${newmatrix[i][j]}`);
			}
		}
	}
}

myDiagonal(myMatrix);
