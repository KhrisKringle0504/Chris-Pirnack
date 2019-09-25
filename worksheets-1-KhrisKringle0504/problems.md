# Problems and Problem Solving

## 44-242: Data Structures

## Name:Chris Pirnack

Instructions: Provide answers where indicated below

1. Define Algorithm

A step by step calculation to solve a problem

2. What is the difference between a checked and an unchecked exception?

An unchecked exception has no rules, whereas a checked has to be advertised in the class header

3. Are exceptions that extend `RuntimeException` checked or unchecked?

Checked are extend

4. When writing a custom exception, how many constructors do you need to write?

You need 2 constructors

5. Fill in the code below to make the `RowIndexOutOfBounds` class a checked exception.  Write the necessary constructor(s).

```java
class RowIndexOutOfBoundsException()
{
    super();
public IllegalGradeException(String m)
{
    super(m);
}
}
```