# Lab 1

## The Debugger

## 10 points

This lab serves to introduce you to the debugger.  Use the steps laid out in the Debugging slides to answer the questions at the end of this document (in this document).

### Milestones

For each milestone you must have at least one commit that corresponds to the task.

* Add the required headers to the source files (`Rando.java`) (2 points)
* Modifying the lab appropriately to solve the last question (and passing the test) (2 points)
* Answering the below questions in this document (4 points)

The remaining points will be earned by following a consistent style, and other guidelines set forth in the Project Guidelines page on the course website.

### Tasks and questions

Run the main method by selecting the green triangle button (Run Project).  

Question 1: What is the output (what is printed to the screen by the `println`)?

```text
The 10th random number is 6
```

Put a breakpoint in the `random` method at the line that reads `Rn = ;`.  Run the debugger as outlined in the course slides.  Use the Step Over and Continue buttons as recommended in the slides to trace through the execution of the method.

Question 2:  As you run the program, what _different/unique_ values of `Rn` do you get?

```text
It goes in the order of 7,6,1,0
```

Run the tests for this project.  You should notice that the test fails.

Task: Try different values of `a`, `b`, and `m` to get your random number generator method to produce at least 6 values.  Hint: think about how the mod operation works; larger values of m may be to your benefit.  When you have accomplished this task, your test will pass.

Question 3: What are the possible values of Rn you see when you trace through your code (when running `Rando`, not `RandoTest`)?

```text
7,42,1092 there are a lot more veriations of numbers now that the number is higher
```
