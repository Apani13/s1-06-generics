# 🛠️ Java Generics Practice

## 📝 Description

This repository includes practical Java exercises focused on mastering **Generics** in Java.  
The goal is to understand how to create flexible and reusable components that can handle different data types  
while maintaining type safety. The exercises encourage the use of clean code practices and command-line execution.



## 🚀 Objectives

* Learn to create generic classes and methods.
* Understand the use of generic type parameters.
* Explore the flexibility of generic methods with different types.
* Practice handling lists of variable arguments.
* Reinforce abstraction through Generics in Java.

## 📚 Exercise Overview

### 🔹 Level 1

#### Exercise 1 – NoGenericMethods

* **What it does:** Implements a class `NoGenericMethods` that stores three arguments of the same type, with
  methods to store and retrieve them. Includes a constructor to initialize the three arguments, allowing them
  to be passed in any order.
* **Learning focus:**
  * Implementing classes that manage multiple values of the same type.
  * Using constructors and method encapsulation.

#### Exercise 2 – GenericMethods

* **What it does:** Implements a class `GenericMethods` with a generic method that accepts three arguments of any
  type and prints them. Demonstrates flexibility by calling this method with different types such as a
  `Person` object, a `String`, and a primitive type.
* **Learning focus:**
  * Creating generic methods.
  * Handling different types of arguments.
  * Understanding method flexibility with Generics.

### 🔹 Level 2

#### Exercise 1 – Mixed Generic Method

* **What it does:** Modifies the previous generic method so that **one of the arguments is no longer generic.**
* **Learning focus:**
  * Mixing generic and non-generic parameters in methods.
  * Advanced parameter handling in generic methods.

#### Exercise 2 – Variable Argument List

* **What it does:** Further modifies the method so that the arguments are supplied through a
  *variable‑arguments list* (`T... args`).
* **Learning focus:**
  * Handling variable argument lists.
  * Applying Generics with varargs for maximum flexibility.

## ⚙️ Technologies Used

* Java 17
* Maven 3.9 (you can still compile with raw `javac` if you prefer)
* Eclipse / IntelliJ IDEA
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

## 📂 Project structure  <!-- <<< NEW section -->

```text
src/main/java
  └─ level01
  │   └─ exercise1and2
  │      ├─ model           (Person.java)
  │      └─ util            (NoGenericMethods / GenericMethods)
  └─ level02
      ├─ exercise1
      │   ├─ controller     (AppController)   <-- NEW
      │   ├─ util           (GenericMethods)
      │   └─ Main.java
      └─ exercise2
          ├─ controller     (AppController)   <-- NEW
          ├─ util           (GenericMethods)
          └─ Main.java

src/test/java                <-- NEW
  ├─ level01/…  NoGenericMethodsTest
  └─ level02/…  GenericMethodsTest
```

*Controllers* were introduced in **Level 2** to cleanly separate presentation logic from the core utilities.  
Unit tests (JUnit 5) provide a minimal safety net.

## ▶️ Execution

All exercises are executable via the **terminal** or through **Maven**.

### ⚡ Quick run with Maven <!-- <<< NEW -->

```bash
mvn clean test                                       # compile + run unit tests

# Level‑1 demo
mvn -q exec:java -Dexec.mainClass="level01.exercise1and2.Main"

# Level‑2 exercises
mvn -q exec:java -Dexec.mainClass="level02.exercise1.Main"
mvn -q exec:java -Dexec.mainClass="level02.exercise2.Main"
```

### Manual compile & run (plain JDK) <!-- <<< CHANGED: replaces previous bin example -->

```bash
# Compile everything into folder out/
find src/main/java -name "*.java" | xargs javac -d out

# Level‑1 demo
java -cp out level01.exercise1and2.Main

# Level‑2 demos
java -cp out level02.exercise1.Main
java -cp out level02.exercise2.Main
```

*(The old `bin` folder example has been replaced with this `out` folder workflow to keep naming consistent.)* <!-- <<< NOTE -->

## 🧪 Running only the tests  <!-- <<< NEW -->

```bash
mvn -q test    # runs JUnit 5 tests
```

## 🤝 Contributions

1. Fork the repository.  
2. Create your branch: `git checkout -b feature/MyFeature`  
3. Commit changes: `git commit -m "Add MyFeature"`  
4. Push your branch: `git push origin feature/MyFeature`  
5. Open a pull request.

## ✅ Author Notes

These Generics‑focused exercises are essential for building flexible and reusable code components in Java.  
Mastering Generics is a key step toward professional‑level Java development.

*All paths in the code are relative (`File.separator`) and `@SafeVarargs` is used to silence the generic‑varargs warning introduced in Level 2 — Exercise 2.* <!-- <<< NEW -->

Happy coding! 🚀
