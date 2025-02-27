# Object-Oriented Programming and Dynamic Lists in Java

## Section 1: Introduction

This project is a simple product management system in Java that uses the `ArrayList` class to dynamically store items, the `Scanner` class to capture user input, and an interactive menu structure to add, list, and remove products.

It implements a functional system to manage a dynamic product list, similar to inventory or e-commerce systems. Constructors are used to initialize objects, while getters and setters allow access and modification of class attributes.

- **Implementation of `isFizzBuzz`**: A classic logic problem that checks if a number is divisible by 3, 5.
- **Using the `do-while` loop**: Ensures that the block of code runs at least once.
- **Using `switch-case` expressions**: `switch-case` (formatted as `case 1 -> ...`) simplifies code structure.
- **Working with `ArrayList`**: A dynamic list that allows flexible storage of elements.
- **Using the `Scanner` class**: Captures user input from the console.

## Section 2: Resources

- **Using `if-else` statements**: Essential for flow control in decision-making.
- **Using the `for` loop**: Iterates over a list of elements efficiently.
- **Creating and managing objects**:
  ```java
  Product product = new Product(nameProduct);
  products.add(product);
  ```
- **Handling exceptions with `try-catch`**: Captures number conversion errors (`NumberFormatException`).
- **Ensuring type safety with `equals(Object o)`**: Uses `instanceof` to check if an object is of type `Product` before casting.
- **Using `@Override` for method redefinition**:
  - `toString()` returns the product name.
  - `equals()` ensures correct product comparison.
  - `hashCode()` maintains consistency with `equals()` to ensure that equal objects have the same hash code.
- **Preventing infinite loops with `checkDynMenu()`**: Handles invalid input safely.
