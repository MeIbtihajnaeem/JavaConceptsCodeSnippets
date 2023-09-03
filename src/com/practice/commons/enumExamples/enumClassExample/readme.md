# README.md - Enum Example Explanation

This Java code example showcases the usage of enums and demonstrates how to iterate through enum values to perform specific actions based on the enum values. Below, we explain what's happening in the provided code without including the code itself:

## MainClass

`MainClass` is the main class that contains the `main` method, which serves as the entry point of the program.

- Inside the `main` method, a for-each loop is used to iterate through all the values of the `Status` enum.

- Within the loop, a switch statement is used to evaluate the current `status` value and perform specific actions based on the enum value.

  - If the `status` is `FAILED`, it prints "Status is FAILED" and the associated error code.
  
  - If the `status` is `SUCCESS`, it prints "Status is SUCCESS" and the associated error code.
  
  - If the `status` is `PENDING`, it prints "Status is PENDING" and the associated error code.
  
  - If the `status` is `INITIAL`, it prints "Status is INITIAL" and the associated error code.
  
  - If none of the above cases match, it prints "Unknown Status" and the associated error code.

## Status Enum

The `Status` enum is defined with four possible enum values: `FAILED`, `SUCCESS`, `PENDING`, and `INITIAL`. Each enum value can be associated with an error code.

- `FAILED(504)`, `SUCCESS(200)`, and `PENDING(201)` have integer error codes associated with them.
- `INITIAL` does not have a specified error code and uses a default value of 000.

- The `Status` enum has a constructor that can accept an error code when an enum value is defined. This constructor allows setting a custom error code for specific enum values.

- The `getErrorCode()` method allows retrieving the error code associated with each enum value.

In summary, this code demonstrates how to use enums in Java to represent a set of related constants (status values) and how to associate additional data (error codes) with specific enum values. It also illustrates how to iterate through enum values and perform actions based on the selected enum value using a switch statement.