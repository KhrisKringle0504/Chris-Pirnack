# Lab 3

## Arrays

## 10 points

This lab serves as practice wrapping arrays in a class.  
Mathematical vectors are a common part of modern Computer Science (graphics cards, for example, work with these extensively). 
You are to implement a few common operations for mathematical vectors of `int`egers.

### Milestones

You should do these milestones in order.  You must have at least one commit per milestone.

* Add required headers to `.java` files in the `src/` directory
* Complete `LengthMismatchException` (will pass one test)
* Complete non-default constructor in `VectorM`
* Complete `size`, `get`, and `set` in `VectorM`
* Complete `dot` in `VectorM` (will pass 3 tests)
* Complete `add` in `VectorM` (will pass 3 tests)

### Grading
For each category, evenly divide the number of points across the number of elements.  For example if there are 4 tests in the lab each test will be worth 1.25 points (5/4 points).

|Criteria|Total Points|
| --- | --- |
| Correctness (tests) | 5 |
| Presence of comment header(s) | 1 |
| At least one unique commit per milestone | 2 |
| Following a consistent and clean coding style | 2 |

### Functionality

#### `LengthMismatchException`

The `LengthMistmatchException` must be modified to be an _unchecked_ exception.  You must extend the appropriate class and write the two constructors discussed in class.

Note that no tests will run before you complete this portion of the lab

#### Non-default constructor

The non-default constructor in `VectorM` takes a size.  You will need to create a `new` array of ints with the specified size and store the reference in an instance variable (that you will need to create in the class).  You may do any other initialization you think you need in this constructor as well.

### `size`, `get`, and `set`

The `size` method should return the length of the array that is stored in the `VectorM`

The `get(int idx)` method should return the value at the index that is the parameter.  Don't worry about bounds checking the index; the `IndexOutOfBoundsException` that would be thrown in the event of an index that is too large or too small is sufficient.

The `set(int idx, int value)` method should set the array at the specified index to the specified value.

### The `dot` method

The dot product of two vectors is a single integer.  It is calculated by taking pairs of numbers with the same index in two vectors, multiplying them, and then adding all of the resulting products together.

For example, if I have the vectors `[2, 4, 5, 8]` and `[1, 3, 6, 0]`, the dot product would be `2*1 + 4*3 + 5*6 + 8*0=44`.

If the vectors do not have the same size, you should throw a `LengthMismatchException`

### The `add` method

The result of adding two vectors is another vector of the same size.  The value at index i of the resulting vector should be the sum of the two original vectors at index i.

For example, if I have the vectors `[2, 4, 5, 8]` and `[1, 3, 6, 0]`, the sum of these vectors would be `[2+1, 4+3, 5+6, 8+0] = [3, 7, 11, 8]`.

If the vectors do not have the same size, you should throw a `LengthMismatchException`
