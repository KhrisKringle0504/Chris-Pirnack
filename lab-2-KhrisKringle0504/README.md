# Lab 2

## Inheritance and Polymorphism

## 10 points

This lab is designed to get you working with simple Inheritance and Polymorphism. 
One thing to keep in mind is that because of the way these classes are intertwined and the purpose of this lab you will be unable to run any tests until you have completed the functionality of this lab.  You will run the tests for the entire project after completing the milestones.

### Milestones

* Add required file headers 
* Complete `Targetable` interface 
* Complete `PlayerCharacter` class 
* Complete `Cleric` class 
* Complete `Fighter` class 
* Complete `Mage` class

### Grading
For each category, evenly divide the number of points across the number of elements.  For example if there are 4 tests in the lab each test will be worth 1.25 points (5/4 points).

|Criteria|Total Points|
| --- | --- |
| Correctness (tests) | 5 |
| Presence of comment header(s) | 1 |
| At least one unique commit per milestone | 2 |
| Following a consistent and clean coding style | 2 |

### Task Description

#### Complete `Targetable` interface

The `Targetable` interface must contain the following methods (recall that methods in interfaces are public and abstract by default!)

* `void hurt(int hp)`
* `void heal(int hp)`

Add these method signatures to the `Targetable.java` file in the project.

#### Complete `PlayerCharacter` class

The `PlayerCharacter` class has the following requirements:

* It must be `abstract`
* It must `implement` the `Targetable` interface
* It must contain two abstract methods:
  * `public abstract String shout()`
  * `public abstract int damage()`
* It must implement the `hurt` method from the `Targetable` interface
  * This method should subtract the amount of `hp` from the current HP of the player character.  if the current HP drops below zero, it should be set to zero (minimum HP is zero)
* It must implement the `heal` method from the `Targetable` interface
  * This method should add the amount of `hp` to the current hp of the player character.  if the current hp exceeds the maximum HP of the character, it should be set to the maximum HP.
* It must contain a method named `getHP()` that returns the current HP of the character

#### Complete `Cleric` class

The `Cleric` class has the following requirements:

* It must `extend` the `PlayerCharacter` class
* It must implement the constructor present in the `PlayerCharacter` class (call the super constructor!)
* Its shout must return `"I heal thee!"`
* It should do 0 damage

#### Complete `Mage` class

The `Mage` class has the following requirements:

* It must `extend` the `PlayerCharacter` class
* It must implement the constructor present in the `PlayerCharacter` class
* Its shout must return `"FWOOSH"`
* It should do 11 damage

#### Complete `Fighter` class

The `Fighter` class has the following requirements:

* It must `extend` the `PlayerCharacter` class
* It must implement the constructor present in the `PlayerCharacter` class
* Its shout must return `"AAAARGH!"`
* It should do a randomized amount of damage

_Fighter damage_: A fighter should do damage determined by choosing two random numbers between 1 and 6 inclusive (accomplished with `dice.nextInt(6)+1`), and returning the sum of those two random numbers and 5 (you will be basically be adding `dice.nextInt(6)+1`, `dice.nextInt(6)+1`, and `5`).  A random number generator named `dice` has been created in the class for you.