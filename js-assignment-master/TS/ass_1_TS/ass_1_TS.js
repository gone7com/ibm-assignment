var myMatrix = [[7, 7, 7], [5, 5, 8], [8, 5, 4]];
function myDiagonal(newmatrix) {
    for (var i = 0; i < newmatrix.length; ++i) {
        for (var j = newmatrix.length - 1; j >= 0; --j) {
            if (i + j == newmatrix.length - 1) {
                console.log(" Diagonal number " + newmatrix[i][j]);
            }
        }
    }
}
myDiagonal(myMatrix);
