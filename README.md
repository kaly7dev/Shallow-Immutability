# Shallow Immutability in Java

This repository demonstrates the concept of **shallow immutability** in Java through simple examples and code snippets. It also includes a comparison with **deep immutability** and showcases best practices for achieving robust and thread-safe designs.

## Overview

Immutability is a fundamental principle in software design, especially in Java, for creating stable and predictable code. This project:

1. Explains what shallow immutability is.
2. Provides examples of shallow immutability and its implications.
3. Demonstrates how to achieve deep immutability.

## Project Structure

```
shallow-immutability-java/
|
|-- src/
|   |-- ShallowImmutableExample.java  # Example of shallow immutability
|   |-- DeepImmutableExample.java     # Example of deep immutability
|   |-- Main.java                     # Main file to test and run examples
|
|-- README.md                         # Project documentation
|
|-- LICENSE                           # License information (MIT)
```

## Getting Started

Follow the steps below to run the examples and explore the concepts:

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Any Java IDE (e.g., IntelliJ IDEA, Eclipse) or a simple text editor
- Command-line tools (optional for compilation and execution)

### Installation

1. Clone this repository:

   ```bash
   git clone https://github.com/kaly7dev/Shallow-Immutability.git
   ```

2. Navigate to the project directory:

   ```bash
   cd shallow-immutability
   ```

3. Open the project in your favorite IDE.

### Running the Code

1. Compile the files:

   ```bash
   javac src/*.java
   ```

2. Run the main file:

   ```bash
   java src.Main
   ```

3. Observe the outputs for both shallow and deep immutability examples.

### Example Output

#### Shallow Immutability:

```
Before modification: [Item1, Item2]
After modification: [Item1, Item2, Item3]
```

#### Deep Immutability:

```
Before modification: [Item1, Item2]
After external modification attempt: [Item1, Item2]
```

## Key Concepts

### Shallow Immutability
- The object’s fields are final and cannot be reassigned.
- However, mutable objects referenced by these fields can still be changed externally.

### Deep Immutability
- Ensures that the entire object graph is immutable.
- Achieved through defensive copying and immutable views.

## Code Highlights

### Shallow Immutable Example:
```java
public final class ShallowImmutableExample {
    private final List<String> items;

    public ShallowImmutableExample(List<String> items) {
        this.items = items; // Reference to the mutable object is stored
    }

    public List<String> getItems() {
        return items; // Exposing the mutable object directly
    }
}
```

### Deep Immutable Example:
```java
public final class DeepImmutableExample {
    private final List<String> items;

    public DeepImmutableExample(List<String> items) {
        this.items = new ArrayList<>(items); // Defensive copy of the list
    }

    public List<String> getItems() {
        return Collections.unmodifiableList(items); // Immutable view of the list
    }
}
```
---

Happy coding! 🎉
