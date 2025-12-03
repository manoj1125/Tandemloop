# TandemLoop Coding Assessment Solutions (Java)

This repository contains the solutions for the Google Form coding assessment, implemented in the **Java** programming language.

## 💻 Programming Language

**Java** (The solutions are written using standard Java SE 8+ features.)

## 🎯 Problem Breakdown and File Structure

Each solution is contained in its own file, corresponding to the problem number.

| File Name | Description of Solution | Key Concepts Used |
| :--- | :--- | :--- |
| **Program1.java** | **Calculator Class:** A Java class named `Calculator` handles basic arithmetic operations (Add, Subtract, Multiply, Divide) using a `switch` statement based on the input string operation. Implements error handling for division by zero. | Class structure, Methods, `switch` statement, `double` data type. |
| **Program2.java** | **Odd Series Generator (Simple):** Generates the first 'a' odd positive integers (1, 3, 5, ...). The loop runs exactly 'a' times, printing the current odd number and then incrementing by 2. | `for` loop, basic iteration. |
| **Program3.java** | **Odd Series Generator (Conditional):** Generates the odd number series where the loop count depends on the input 'a': if 'a' is **odd**, the loop runs $a$ times; if 'a' is **even**, the loop runs $a-1$ times. The logic uses an `if-else` block to determine the loop count. | Conditional logic (`if-else`), Modulus operator (`%`), Local variable initialization guarantee. |
| **Program4.java** | **Divisibility Counter:** Calculates the total count of numbers in the input list that are multiples of any integer from 1 through 9. The results are stored in a `HashMap<Integer, Integer>` (Java's dictionary equivalent), mapping the divisor (key) to the total count (value). | `List`, `Map` (`HashMap`), Nested `for` loops, Modulus operator (`%`). |

## ▶️ Execution Notes

The main method in each file handles user input (where necessary) and calls the appropriate solution logic. To compile and run any file (e.g., `Program4.java`):

1.  Compile: `javac Program4.java`
2.  Run: `java Program4`
