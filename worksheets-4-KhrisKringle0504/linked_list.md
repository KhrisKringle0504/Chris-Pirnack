# LInkedLists

## 44-242: Data Structures

## Name:

Instructions: Provide answers where indicated below

1. Write pseudocode (or code) for the `remove(int idx)` method of the `LinkedList`; that is, how would you remove an element into an arbitrary position of the array, maintaining all other elements in the array?  For example, removing the element at index 2  from the LinkedList `[1, 3, 2, 4]` would result in `[1, 3, 4]`.  You may assume you have the following instance variables: `int size` and `Node head`.  Remember to update the size of the array, and to handle the case where the index to remove is greater than the maximum index in the array (throw some sort of exception)

``` java
public void remove(int idx):
    // answer here
```

2. Write pseudocode (or code) for the `get(int idx)` method of the LinkedList.  Remember to handle error cases.

```java
public Element get(int idx):
    // answer here
```

3. Based on your answers to 1 and 2, which is faster: `remove(int idx)` or `get(idx)`?  Which one requires more work?

4. Which operations is the `LinkedList` good at?  Please specify whether you are talking about a single or a doubly linked list.