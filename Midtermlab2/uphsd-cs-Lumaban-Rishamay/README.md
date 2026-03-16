# 3×3 Matrix Determinant Solver

## Student Information

**Name:** LUMABAN RISHAMAY FE R.
**Course:** Computer Science
**Assignment:** 3×3 Matrix Determinant Solver
**Language Used:** Java and JavaScript (Node.js)

---

# Assigned Matrix

The matrix assigned to this student is:

| 3 | 6 | 2 |
| - | - | - |
| 5 | 1 | 4 |
| 2 | 3 | 5 |

---

# Determinant Formula Used

The determinant is computed using **cofactor expansion along the first row**:

det(M) =
M[0][0](M[1][1]·M[2][2] − M[1][2]·M[2][1])
− M[0][1](M[1][0]·M[2][2] − M[1][2]·M[2][0])

* M[0][2](M[1][0]·M[2][1] − M[1][1]·M[2][0])

---

# How to Run the Programs

## Java Version

1. Open a terminal or command prompt.
2. Compile the program:

```
javac DeterminantSolver.java
```

3. Run the program:

```
java DeterminantSolver
```

---

## JavaScript Version (Node.js)

1. Make sure **Node.js** is installed.
2. Run the program using:

```
node determinant_solver.js
```

---

# Sample Output

```
===================================================
  3x3 MATRIX DETERMINANT SOLVER
  Student: LUMABAN RISHAMAY FE R.
===================================================

Assigned Matrix:

 | 3  6  2 |
 | 5  1  4 |
 | 2  3  5 |

Expanding along Row 1:

Minor M11 = -7
Minor M12 = 17
Minor M13 = 13

Cofactor C11 = -21
Cofactor C12 = -102
Cofactor C13 = 26

===================================================
DETERMINANT = -97
===================================================
```

---

# Final Result

The determinant of the matrix is:

**det(M) = -97**

Since the determinant is **not equal to zero**, the matrix **is not singular and has an inverse**.
