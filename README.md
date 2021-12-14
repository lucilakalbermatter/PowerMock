# Java-Testing: PowerMock

## Overview

This submodule provides learners with an introduction to PowerMock in Java Testing.

### Objectives

By the end of this submodule, the learners should be able to:

- Understand how to use PowerMock for: 
  - Mocking static methods
  - Mocking private methods
  - Mocking final methods
  
## Materials and Resources

### Resources

- [PowerMock](https://powermock.github.io/)
- [Mock Testing using PowerMock](https://howtodoinjava.com/java/library/mock-testing-using-powermock-with-junit-and-mockito/)

### Exercises

The following section describes standalone exercises to give to students. For each exercise, follow the instructions below to share with your class:

1. Clone the repository locally
1. Re-upload it into your class' GitHub organization. **Make sure there is no solution branch in the uploaded repo**.
1. Share the link to the exercise repository with students.


# Write the PowerMock tests based on the given tasks. 

## Overview:
- In this exercise, you are going to write test cases using **PowerMock**.  
- For the given Utility.java class, there are already static, private, final methods defined  
- "GreetingService.java" is an external service interface which takes person name as input
  and returns greeting message based on the current time.
- "HelloService.java" is an external service interface which takes person name as input
    and returns hello message.
- We are going to Mock the Utility.class and writes tests cases using PowerMock.


Please add the appropriate PowerMock functions in order to complete the below tasks. 

## Task 1 - mock static method
Mock the Utility.class and set the expectation to **verifySayHelloStaticMethod()** method using:
    
    mockStatic() and when() 


## Task 2 - mock private method
Mock the Utility.class and set the expectation to **verifyGetGreetingMessagePrivateMethod()** method using:
    
    spy(), doReturn() and when() 


## Task 3 - mock final method
Mock the Utility.class and set the expectation to **verifyGetGreetingMessageFinalMethod()** method using:
    
    mock() and when() 

When all the tests are passing, you should have an output similar to the one below:

 ![PowerMock.png](PowerMock.png)
