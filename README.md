# 🛠️ Java Generics Practice

## 📝 Description

This repository includes practical Java exercises focused on mastering **Generics** in Java. The goal is to understand how to create flexible and reusable components that can handle different data types while maintaining type safety. The exercises encourage the use of clean code practices and command-line execution.

## 🚀 Objectives

* Learn to create generic classes and methods.
* Understand the use of generic type parameters.
* Explore the flexibility of generic methods with different types.
* Practice handling lists of variable arguments.
* Reinforce abstraction through Generics in Java.

## 📚 Exercise Overview

### 🔹 Level 1

#### Exercise 1 – NoGenericMethods

* **What it does:** Implements a class `NoGenericMethods` that stores three arguments of the same type, with methods to store and retrieve them. Includes a constructor to initialize the three arguments, allowing them to be passed in any order.
* **Learning focus:**

    * Implementing classes that manage multiple values of the same type.
    * Using constructors and method encapsulation.

#### Exercise 2 – GenericMethods

* **What it does:** Implements a class `GenericMethods` with a generic method that accepts three arguments of any type and prints them. Demonstrates flexibility by calling this method with different types such as a `Persona` object, a `String`, and a primitive type.
* **Learning focus:**

    * Creating generic methods.
    * Handling different types of arguments.
    * Understanding method flexibility with Generics.

### 🔹 Level 2

#### Exercise 1 – Mixed Generic Method

* **What it does:** Modifies the previous generic method so that one of the arguments is not generic.
* **Learning focus:**

    * Mixing generic and non-generic parameters in methods.
    * Advanced parameter handling in generic methods.

#### Exercise 2 – Variable Argument List

* **What it does:** Further modifies the method so that the arguments are a list of variable arguments (varargs).
* **Learning focus:**

    * Handling variable argument lists.
    * Applying Generics with varargs for maximum flexibility.

## ⚙️ Technologies Used

* Java 17
* Eclipse or IntelliJ IDEA
* GitHub

## 📋 Requirements

* Java JDK 17 or higher
* Git for version control
* IDE (Eclipse or IntelliJ)

## 🛠️ Installation

```bash
git clone https://github.com/Apani13/s1-06-generics.git
```

Open the project in IntelliJ IDEA or Eclipse and make sure Java 17+ is selected as the SDK.

## ▶️ Execution

All exercises are executable via **terminal**. Example structure:

```
/<project-root>
├── src/
│   └── level01/exercise1/...  (Java source files)
└── bin/                      (compiled class files)
```

### Compile

```bash
javac -d bin src/level01/exercise1/*.java
```

### Run

```bash
java -cp bin level01.exercise1.Main
```

Repeat the commands accordingly for other exercises.

## 🤝 Contributions

1. Fork the repository.
2. Create your branch: `git checkout -b feature/MyFeature`
3. Commit changes: `git commit -m "Add MyFeature"`
4. Push your branch: `git push origin feature/MyFeature`
5. Open a pull request.

## ✅ Author Notes

These Generics-focused exercises are essential for building flexible and reusable code components in Java. Mastering Generics is a key step toward professional-level Java development.

Happy coding! 🚀