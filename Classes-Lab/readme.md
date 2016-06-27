---
title: Creating Classes
type: lab
duration: "1:30"
creator:
    name: Alan Caceres
    city: NYC

---

# ![](https://ga-dash.s3.amazonaws.com/production/assets/logo-9f88ae6c9c3871690e33280fcf557f33.png) Creating Classes

## Introduction

> ***Note:*** _This can be a pair programming activity or done independently._

In this lab you will be using your knowledge of classes to create two classes that will be used in the main method. To calculate

#### Starter code

There is no starter code.
Create a new project in IntelliJ for this lab

## Exercise

#### Requirements

##### StopLight Class

- Create a StopLight class with the following global variable: lightColor
- Create a constructor that sets the lightColor to a value of your choice.
- Create the following methods that accept no input:
`isRed`, `isYellow`, `isGreen`.
- Implement the methods to return true when the lightColor matches the color of the method. i.e; isRed() should return true if lightColor is red.
- Create a method `setLightColor`, that accepts a parameter to change the lightColor variable. Make sure to handle when the wrong input is given to the method.

##### Car Class
- Create a Car class with the following global variables: color, brand, topSpeed
- Create a constructor that assigns values to the color, brand, and topSpeed variables.
- Implement `go`, `slow`, and `stop` methods that print something out. (You can print whatever is appropriate for the methods)
- Create individual getter methods that print out the color, brand, and topSpeed of the car.
- Create individual setter methods that set the color, brand, and topSpeed of the car.

##### Main Java Class
- Instantiate a `StopLight` object in the Main.java class using the constructor you created in the `StopLight` class.
- Instantiate a `Car` object in the *Main.java* class using the constructor you created in the `Car` class.
- In the Main.java class, create a loop(while, do while, for loop; your choice) that runs 30 times.
- Inside the loop; change the lightColor of the `StopLight` object in the correct sequence and have the `Car` object react accordingly to the `StopLight` lightColor using the `Car` object's methods for each iteration. (Each time you loop back, change the lightColor)

**Bonus:**
- Have 20 cars react to the stop light.
- Randomly have a car run the red light.

#### Deliverable

Pull request from forked Project on GitHub that contains your implementation of the `StopLight` class, the `Car` class, and the main program that uses the classes you created.

## Additional Resources
- Oracle: [Defining a class](https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html)
- Oracle: [Instantiating a class](https://docs.oracle.com/javase/tutorial/java/javaOO/objects.html)
