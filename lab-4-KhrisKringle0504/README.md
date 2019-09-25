# List Data Structures

## 44-242

## 10 points

In this lab you will implement specific functionality for the `ArrayList` and `LinkedList` classes.

### Milestones

You should complete the milestones in the following order:

1. Add required header comments to `MyArrayList.java` and `MyLinkedList.java`
2. Write `ArrayList`'s `get`, `double_capacity`, and `add(int idx, Integer value)` methods (should pass 4 tests)
3. Write `ArrayList`'s `indexOf` method (should pass 1 additional tests)
4. Write `ArrayList`'s `remove` method (should pass 2 additional tests)
5. Write `LinkedList`'s `get`, and `add(int idx, Integer value)` methods (should pass 4 tests)
6. Write `LinkedList`'s `indexOf` method (should pass 1 additional tests)
7. Write `LinkedList`'s `remove` method (should pass 2 additional tests)

Remember that you must have at least one unique commit per milestone.  Remember that the message must make it clear that you are addressing the milestone

### Grading
For each category, evenly divide the number of points across the number of elements.  For example if there are 4 tests in the lab each test will be worth 1.25 points (5/4 points).

|Criteria|Total Points|
| --- | --- |
| Correctness (tests) | 5 |
| Presence of comment header(s) | 1 |
| At least one unique commit per milestone | 2 |
| Following a consistent and clean coding style | 2 |

### Functionality

The functionality for the above methods is like what we discussed in class (in pseudocode and pictures).  The functionality is summarized below:

- `doubleCapacity()`
  - This method should double the capacity of the MyArrayList. The data in the MyArrayList should not be modified.
  - We discussed this method in class
  - The `halveCapacity()` method is already implemented for you as
        an example.
- `add(int index, Integer value)`
  - Adds the value at the specified index. It should maintain the
        rest of the data in the List (as discussed in class).
  - If you attempt to add to an MyArrayList that is filled to
        maximum capacity, you must call the `doubleCapacity` method.
  - If the index is greater than the number of elements in the
        array, you must throw an `IndexOutOfBoundsException`.
- `remove(int index)`
  - Removes the value at the specified index. It should maintain the
        rest of the data in the List (as discussed in class).
  - If you attempt to remove data at an index that is `>=` the number of elements in the array, you must throw an `IndexOutOfBoundsException`.
  - If the number of elements in an `ArrayList` drops below one
        quarter of the maximum capacity (after the removal has occured), you must call the
        `halveCapacity()` method.
- `indexOf(Integer value)`
  - Returns the index of the first instance of `value` in the List.
    - if `value` is not in the List, it should return -1.
- `get(int index)`
  - Returns the value at the specified `index`.
  - If index is greater than or equal to the number of elements in
        the List, throw an `IndexOutOfBoundsException`.