# Runnable vs. Thread in Java

This README.md file provides an overview of the code examples and concepts related to the usage of `Runnable` and `Thread` in Java. The provided code demonstrates how to address issues related to class inheritance when using threads and discusses the use of lambda expressions with `Runnable`.

## Table of Contents

- [Introduction](#introduction)
- [Code Examples](#code-examples)
- [Runnable Interface](#runnable-interface)
- [Lambda Expressions with Runnable](#lambda-expressions-with-runnable)
- [Conclusion](#conclusion)

---

## Introduction

When working with multithreading in Java, we often need to create and manage threads. Two common approaches to achieve this are by extending the `Thread` class or implementing the `Runnable` interface. However, issues can arise when we need to extend other classes while using threads. This README explores the concept of thread inheritance issues and provides solutions using `Runnable` and lambda expressions.

### Thread Inheritance Issue

In Java, you can extend the `Thread` class to create a custom thread. However, what if you need to extend another class (e.g., Class A) and also use Class A as a thread? This situation can lead to a conflict, as Java supports single inheritance only. To address this, we can implement the `Runnable` interface in Class A, as the `Thread` class itself implements `Runnable`. This way, we can use polymorphism to resolve the issue.

---

## Code Examples

In the provided code, we have two Java classes: `A` and `B`. Both classes extend another class `D` and implement the `Runnable` interface. They each override the `run` method to execute different tasks concurrently. The `MainClass` demonstrates how to create and start threads using instances of `A` and `B`.

### FunctionalInterfaceWithRunnableMain

This additional code file demonstrates the usage of lambda expressions with the `Runnable` interface. It creates two `Runnable` instances and uses them to create and start threads. This approach provides a more concise and expressive way to work with threads.

---

## Runnable Interface

To address the thread inheritance issue, we implement the `Runnable` interface in Class A. This allows Class A to act as a runnable object that can be passed to a thread's constructor. By doing this, we separate the thread's behavior from the class hierarchy, making it more flexible and avoiding conflicts in inheritance.

---

## Lambda Expressions with Runnable

Java 8 introduced lambda expressions, which provide a concise way to define functional interfaces like `Runnable`. In the `FunctionalInterfaceWithRunnableMain` class, we demonstrate how to use lambda expressions to create `Runnable` instances and pass them to threads. This approach simplifies the code and improves readability.

---

## Conclusion

This README has introduced the concept of thread inheritance issues and provided solutions using the `Runnable` interface and lambda expressions. By implementing `Runnable` and using lambdas, you can create more flexible and maintainable multithreaded Java applications.