# GitHub Profile - Readme.md

## Notes

This package contains a collection of Java interfaces and classes that demonstrate various interface implementations. These interfaces and classes are part of a package that showcases how Java interfaces can be extended and implemented.Key point to understand here is an interface extends interface but a class implements one or more interface.Another key factor is a class can implements many interfaces but can only extend one class.

## Interfaces

### Interface A

- `methodOfInterfaceA()`: This method is part of Interface A and should be implemented by classes that implement this interface.
- `anotherMethodOfInterfaceA()`: Another method defined in Interface A that should also be implemented by implementing classes.

### Interface B (extends A)

- `methodOfInterfaceB()`: This method is part of Interface B, which extends Interface A. Classes implementing Interface B must provide an implementation for this method.

### Interface Y

- `methodOfInterfaceY()`: This method is part of Interface Y and should be implemented by classes that implement this interface.

## Classes

### ClassForA

- Implements Interface A.
- Provides implementations for `methodOfInterfaceA()` and `anotherMethodOfInterfaceA()`.
- These both methods are from Interface A

### ClassForAandB

- Implements both Interface A and Interface B.
- Provides implementations for `methodOfInterfaceA()`, `anotherMethodOfInterfaceA()`, and `methodOfInterfaceB()`.
- Two methods are from Interface A and one from B since we implements B.If did not implement A the result will be same since B is extending A and getting these methods from A 


### ClassForAY

- Implements both Interface A and Interface Y.
- Provides implementations for `methodOfInterfaceA()`, `anotherMethodOfInterfaceA()`, and `methodOfInterfaceY()`.
- Two methods are from Interface A and one from Y since we implements Y.If did not implement A the result will not be same since Y does not extend A

### ClassForB

- Implements Interface B.
- Provides implementations for `methodOfInterfaceA()`, `anotherMethodOfInterfaceA()`, and `methodOfInterfaceB()`.
- Two methods are from Interface A and one from B since we implements B.Now we have not implemented A the result is same since B is extending A and getting these methods from A 

### ClassForBY

- Implements both Interface B and Interface Y.
- Provides implementations for `methodOfInterfaceA()`, `anotherMethodOfInterfaceA()`, `methodOfInterfaceB()`, and `methodOfInterfaceY()`.
- Two methods are from Interface A and one from B and one from Y since we implements B and Y.Now we have not implemented A the result is same since B is extending A and getting these methods from A.One more method is added since we are implementing B with Y

### ClassForY

- Implements Interface Y.
- Provides an implementation for `methodOfInterfaceY()`.
- This method is from Interface Y


## Conclusion

In summary, this package demonstrates the flexibility of Java interfaces in defining and implementing methods. It showcases how interfaces can be extended and implemented in various combinations to create versatile class hierarchies. Feel free to explore the code and gain a deeper understanding of interface-based programming in Java