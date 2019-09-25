# 1D Arrays

## 44-242: Data Structures

## Name:Chris Pirnack

Instructions: Provide answers where indicated below

1. Write a single line of code that declares an array of integers (`int`) named `arr` and allocates space for 10 elements

```java
arr = new int[10];
```

2. Show the values stored in the array arr2 after the following code is executed:
```java
int arr2[] = new int[5];
for (int i=0; i<5; i++)
    arr2[i] = i * i + 2
arr2[2] = 4;
arr2[arr2[0]] = 5
```
Replace the v's in the table below
|index:|0|1|2|3|4|
|---|---|---|---|---|---|
|value:| 2 | 3 | 6 | 11 | 18 |

3. Consider the following method:
```java
public static void mystery (int[] list)
{
    for (int i=0; i<list.length-1; i++)
        list[i] = list[i] + list[i+1];
}
```
Indicate between the brackets the contents of the 
|input|Result|
|---|---|
|{8}            |ERROR|
|{7, 2}         |{9}|
|{1, 3, 5}      |{4,8}|
|{2, 4, 6, 8}   |{6,10,14}|
|{3, 1, 4, 1, 5}|{4,5,5,6}|
