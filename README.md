# Object-oriented Programming - Inheritance

## Learning Objectives
- Explain that inheritance cascades methods from a superclass
- Explain how superclass methods can be overridden in a subclass
- Use composition as an alternative to inheritance

## Set up instructions
- Fork this repository and clone the forked version to your machine
- Open the root directory of the project in IntelliJ

## Introduction

We can think of inheritance as one class literally inheriting behaviour from another class, just as a human child might inherit certain behaviour from their parent. We call the parent a *superclass* and the child a *subclass*. It can be useful when we want multiple classes to do a particular thing. Consider the example below:

```java
class Car {
    int topSpeed;
    
    public Car(int topSpeed) {
        this.topSpeed = topSpeed;
    }
    
    public String move() {
        return "Moving at " + this.topSpeed;
    }
}

class Bike {
    int topSpeed;

    public Car(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String move() {
        return "Moving at " + this.topSpeed;
    }
}

class Plane {
    int topSpeed;

    public Car(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String move() {
        return "Moving at " + this.topSpeed;
    }
}
```

There is a lot of repetition here. In previous exercises we used dependency injection to solve a similar problem, which is usually the better technique and is referred to as *composition*, but we can also solve the problem using inheritance:

```java
class Vehicle {
    int topSpeed;
    
    public Vehicle(int topSpeed) {
        this.topSpeed = topSpeed;
    }
    
    public String move() {
        return "Moving at " + this.topSpeed;
    }
}

class Car extends Vehicle {
    
}

class Bike extends Vehicle {
    
}
```

In the above example, we created a superclass named `Vehicle` and two subclasses that inherit the `topSpeed` state and the `move()` method. We would be able to use them as normal; `car.move()`, `bike.move()`.

Important to note is that we can still access the methods of the superclass from within the child class using the word `super`, for example if we need to supply additional information to a child constructor:

```java
class Car extends Vehicle {
    String transmissionType;
    
    public Car(String transmissionType, int topSpeed) {
        super(topSpeed);
        this.transmissionType = transmissionType;
    }
}
```

When you provide a different constructor in your child, you'll have to call `super(...params)` to run the constructor of the superclass, passing in the appropriate values. This just allows you to add more parameters to the child, should you need them.

We can also replace methods in the superclass by *overriding* them, and we do this by marking a method as an `@Override`:

```java
class Vehicle {
    int topSpeed;
    
    public Vehicle(int topSpeed) {
        this.topSpeed = topSpeed;
    }
    
    public String move() {
        return "Moving at " + this.topSpeed;
    }
}

class Plane extends Vehicle {
    @Override public String move() {
        return "Taking off... " + super.move();
    }
}
```

## Exercise 1



## Test Output

![](./assets/run-a-test.PNG)

When you run a test, it's either going to pass or fail. When it fails, you'll be presented with a big red stream of text. This is called a stack trace and, though intimidating, does contain some useful information.

One of the core skills of a developer is debugging stack traces like this. The stack trace details in which classes & files the failure happened, and gives you a line number at the end. Most of the lines in the stack trace are irrelevant most of the time, you want to try and identify the files that you're actually working with.

In the sample screenshot below, we've tried to complete the first step of the exercise but provided an invalid value. Then we run the test associated with it and we see a big red stack trace, a test failure.

At the top, we see `expected: <32> but was: <33>`. This means the test expected the value to be 32, but the value the student provided was 33. We can see this in the code snippets at the top of the screenshot.

In the stack trace itself, we see this line: `at app//com.booleanuk.core.ArticleTest.shouldBeAged32(ExerciseTest.java:20)`. This is helpful! This tells us the exact line in the ExerciseTest.java file (line 20) where the failure happened, as well as the method name (shouldBeAged32), helping us to identify where the issue began. This is the kind of thing you need to look for; a relevant file name, method name, class name and line number to give you a good starting point for debugging.

![](./assets/test-failure.PNG)
