# LAB# 04 EXERCISES

## QUESTION# 1
A bank requires a system to manage customer accounts. Each account has an **account number**, **customer name**, and **balance**.

- Use a **constructor** to initialize the account details.
- Use a **parameterized constructor** to initialize specific account details when needed.
- Use a **destructor** to display a message when an account object is deleted.

---

### Sample Output:
---

## QUESTION# 2
A university wants to maintain records of its students, including their student ID, name, and GPA. When a student enrolls, a system should automatically generate a default profile if no details are provided. However, if the student submits their information, it should be recorded accordingly. When a student graduates or withdraws, their profile should be removed from the system, and a confirmation message should be displayed.

---

### Sample Output:
---

## QUESTION# 3
An e-commerce platform requires a system to manage a shopping cart. Each product in the cart must have a name, price, and quantity. When a customer adds an item to the cart, it should be stored either with default values or with the details provided by the customer. Once a customer removes a product from the cart or checks out, the system should ensure that the product record is cleared, and a message should confirm its removal.

### Sample Output:
---

## QUESTION# 4
A company requires a payroll system to efficiently manage its employees' salary details. Each employee has an identification number, a name, a basic salary, and a tax deduction percentage. When a new employee record is created, the system should assign default values if no details are provided, whereas specific information should be stored when given. Additionally, each employee may receive a performance-based bonus, which should be allocated dynamically. The system should compute the net salary by subtracting the tax deduction from the basic salary and adding the assigned bonus amount. When an employee record is deleted, the allocated memory for the bonus should be released, and a confirmation message should be displayed, ensuring efficient memory management.

### Sample Output:
---

## QUESTION# 5
A smart home automation system is responsible for managing multiple connected devices such as lights, air conditioners, and fans. Each device has a unique identifier, a specific type, power consumption in watts, and an operational status indicating whether it is switched on or off. The system should allow devices to be added either with default values or with custom specifications. A central function should calculate the total power consumption by summing up the power usage of all active devices. As devices are removed from the system, their respective records should be deleted, and a message should confirm their removal, ensuring efficient resource management within the system.

### Sample Output:
---

## QUESTION# 6
At Systems Limited, the software development team is working on a role-based access control system. The system has a base class, Employee, which stores general employee details such as name, ID, and department. A subclass, Manager, extends Employee and adds a teamSize attribute. When a new manager is created, the system must first initialize the general employee details before setting the manager-specific attributes.  
To achieve this, the developers implement constructor chaining using super(). The Manager constructor calls the Employee constructor to ensure all attributes are properly initialized before assigning teamSize. This approach ensures code reusability and avoids redundancy in initializing inherited attributes.  
Implement a Java program demonstrating a superclass constructor (Employee) and a subclass (Manager) that utilizes constructor chaining to initialize inherited and new attributes.

### Sample Output:
---

## QUESTION# 7
Folio, a software house specializing in AI-driven solutions, is developing a project management tool. The tool includes a Project class to manage different projects with attributes like projectName, deadline, and budget. Since different teams require flexibility in project creation, Folio’s developers decide to use constructor overloading.  
The Project class has three constructors:  
A default constructor for creating a project with generic settings.  
A constructor that accepts projectName and deadline for teams focusing on deadlines.  
A constructor that includes all attributes (projectName, deadline, budget) for teams managing financial constraints. This flexibility allows different teams to initialize projects based on their specific needs, making the system more adaptable.  
Write a Java program implementing **constructor overloading** in a Project class, allowing project creation with different levels of detail.

### Sample Output:
---

## QUESTION# 8
Systems Limited is developing a **hierarchical employee management system** that efficiently manages memory and enforces role-based access. The system has an Employee superclass with an overloaded constructor to initialize different types of employees. The Manager subclass extends Employee and uses **constructor chaining** to ensure proper initialization. Additionally, **garbage collection** is utilized to free memory when an object is no longer needed.  
The system also implements a **destructor-like approach** using finalize() to log when an employee object is removed. Since Java does not have explicit destructors, this method helps in debugging memory management issues.

### Task:
- Implement a Java program with an Employee superclass and a Manager subclass.
- Use **constructor overloading** in Employee to initialize employees differently.
- Use **super()** in Manager for **constructor chaining**.
- Override finalize() to display a message when an object is garbage collected.
- Create and delete multiple employee objects to observe garbage collection in action.

### Sample Output:
---

## QUESTION# 9
Folio, an AI-driven software company, is developing an automated project allocation system that dynamically assigns developers to projects. The system includes a Project superclass with an overloaded constructor for different project requirements. The AIProject subclass extends Project, ensuring seamless initialization via constructor chaining.  
Since memory efficiency is crucial, the system integrates garbage collection to remove completed projects from memory. The finalize() method is used to log a message before an object is destroyed. This helps track system performance and optimize resource allocation.

### Task:
1. Develop a Java program with a Project superclass and an AIProject subclass.
2. Implement constructor overloading in Project for flexible project creation.
3. Use super() in AIProject to call the appropriate Project constructor.
4. Override finalize() to print a log message when a project is garbage collected.
5. Create multiple projects and manually trigger garbage collection using System.gc() to observe object destruction.

### Sample Output:
---

## QUESTION# 10
Constructor Chaining & Overloading

### Task
1. Write the expected output before executing the code.
2. Explain how constructor chaining is working in this code.
3. Differentiate constructor chaining and overloading using this example.
4. Modify the program by adding an extra constructor in Appliance that takes two parameters and observe the changes in execution.

---

## QUESTION# 11
Constructor Chaining & Overloading

### Task
1. Write the expected output before executing the code.
2. Explain how constructor chaining is working in this code.
3. Differentiate constructor chaining and overloading using this example.
4. Modify the program by adding an extra constructor in Tournament that takes two parameters (host country and number of teams) and observe the changes in execution.

---

## QUESTION# 12
Sarah is developing a Java application for a bookstore. She wants to create a Book class that allows multiple ways to store a book. Some books have all details available (title, author, and price), while others might only have the title and author, with a default price. In some cases, when a new book is launched only the title is known, and the author should be set as "Unknown" with a default price of 0.

### Task:
1. Implement the Book class to handle these different books storage.
2. Create objects for the following books:
    - "Java Programming" by "James Gosling" priced at 500.
    - "Python Basics" by "Guido van Rossum" with a default price.
    - "Mystery Novel" with an unknown author and default price.
3. Print the details of each book.

## Other Questions:
1. How does constructor overloading help in this scenario?
2. What would happen if Java did not support constructor overloading in this case?