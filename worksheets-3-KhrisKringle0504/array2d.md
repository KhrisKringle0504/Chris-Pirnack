# 2D Array

## 44-242: Data Structures

## Name:Chris Pirnack

Instructions: Provide answers where indicated below

1. Write a single line of code that creates a two dimensional array of `int`s named `mat`, and allocates space for 4 rows and 5 columns:

```java
mat = new int [4][5];
```

2. Given the following matrix (assume row, column notation)

```text
    1 3 5 7
A = 2 4 6 8
    8 4 2 1
```

What is the value of:

* `A[2][3]` 1
* `A[1][2]` 6
* `A[2][1]` 4

3. Write a method called `rowSum` that takes a matrix of integers as an argument and returns an array containing the sum of each row.  Show the output of your method on the following matrix

```text
    1 3 5 7
A = 2 4 6 8
    8 4 2 1
```

Code:

```java
public static int rowSum(int [][] mat){
    finarr = new int[4];
    for(int i = 0;i < 5;i++){
        finarr[i] = mat[i][] + mat[i+1][];
    }
    return finarr;
}
```

Output: