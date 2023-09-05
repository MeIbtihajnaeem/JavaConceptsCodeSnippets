# Exception Handling in Java

This repository contains Java code examples illustrating various aspects of exception handling in Java. Below, you'll find a brief overview of each code example and the concepts they cover.

## Custom Exception Handling (`CustomExceptionMain.java`)

This code example demonstrates how to create a custom exception class (`CustomException`) that extends the `Exception` class. It showcases how to use custom exceptions in your code and how to handle them using `try-catch` blocks.

## Multiple Exception Handling (`MultiExceptionMainClass.java`)

In this code example, multiple exceptions are handled using separate `catch` blocks. It demonstrates how to handle specific exceptions such as `ArithmeticException` and `ArrayIndexOutOfBoundsException` and provide customized error messages.

## Throwing Exceptions (`ThrowMainClass.java`)

Here, we explore how to throw exceptions explicitly using the `throw` keyword. The code throws an `ArithmeticException` under certain conditions and catches it using a `try-catch` block.

## `throws` Keyword (`ThrowsMainClass.java`)

This example introduces the `throws` keyword, which is used in method declarations to indicate that a method may throw a particular type of exception. It also illustrates how to handle exceptions thrown by a method using `try-catch`.

## Try With Resources (`TryWithResources.java`)

The code demonstrates the usage of the "try-with-resources" statement introduced in Java to simplify resource management, such as handling `BufferedReader`. Resources declared within the parentheses of the `try` block are automatically closed at the end of the block.

## Additional Information

We use the `finally` block with `try` to close resources, ensuring they are always released, whether an exception occurs or not. An alternate approach is "try-with-resources," where resources are initialized in the parameters of the `try` block.
