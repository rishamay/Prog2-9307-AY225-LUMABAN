/**
 * =====================================================
 * Student Name    : LUMABAN RISHAMAY FE R.
 * Course          : Math 101 — Linear Algebra
 * Assignment      : Programming Assignment 1 — 3x3 Matrix Determinant Solver
 * School          : University of Perpetual Help System DALTA, Molino Campus
 * Date            : March 2026
 * GitHub Repo     : https://github.com/[your-username]/uphsd-cs-lumaban-rishamay
 * Runtime         : Node.js (run with: node determinant_solver.js)
 * =====================================================
 */

const matrix = [
    [3,6,2],
    [5,1,4],
    [2,3,5]
];

function printMatrix(m){
    console.log("┌               ┐");
    m.forEach(row=>{
        const fmt = row.map(v=>v.toString().padStart(3)).join("  ");
        console.log(`│ ${fmt}  │`);
    });
    console.log("└               ┘");
}

function computeMinor(a,b,c,d){
    return (a*d)-(b*c);
}

function solveDeterminant(m){

    const line="=".repeat(52);

    console.log(line);
    console.log("  3x3 MATRIX DETERMINANT SOLVER");
    console.log("  Student: LUMABAN RISHAMAY FE R.");
    console.log("  Assigned Matrix:");
    console.log(line);

    printMatrix(m);
    console.log(line);

    const minor11=computeMinor(m[1][1],m[1][2],m[2][1],m[2][2]);
    console.log(`Step 1 — Minor M11 = ${minor11}`);

    const minor12=computeMinor(m[1][0],m[1][2],m[2][0],m[2][2]);
    console.log(`Step 2 — Minor M12 = ${minor12}`);

    const minor13=computeMinor(m[1][0],m[1][1],m[2][0],m[2][1]);
    console.log(`Step 3 — Minor M13 = ${minor13}`);

    const c11=m[0][0]*minor11;
    const c12=-m[0][1]*minor12;
    const c13=m[0][2]*minor13;

    console.log();
    console.log(`Cofactor C11 = ${c11}`);
    console.log(`Cofactor C12 = ${c12}`);
    console.log(`Cofactor C13 = ${c13}`);

    const det=c11+c12+c13;

    console.log();
    console.log(`det(M) = ${c11} + (${c12}) + ${c13}`);
    console.log(line);
    console.log(`✓ DETERMINANT = ${det}`);

    if(det===0){
        console.log("⚠ The matrix is SINGULAR — it has no inverse.");
    }

    console.log(line);
}

solveDeterminant(matrix);