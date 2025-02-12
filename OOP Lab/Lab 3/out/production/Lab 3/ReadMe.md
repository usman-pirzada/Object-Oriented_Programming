## Lab 03 Exercises

---

### **Question 1: Stadium Management**
The ICC Champions Trophy 2025 is scheduled to be held in Pakistan, and the management team wants to keep track of different stadiums where matches will be played. Design a `Stadium` class with attributes `name`, `city`, `capacity`, and `matchesScheduled`. Implement methods `scheduleMatch()` to add a match to the stadium and `displayDetails()` to show stadium information. Create objects for at least two stadiums in Pakistan (e.g., National Stadium Karachi, Gaddafi Stadium Lahore) and schedule matches for them.

---

### **Question 2: Session Management**
FAST University is organizing **Developer Day 2025**, a flagship event that brings together students, developers, and industry professionals. The university wants a system to manage different **technical sessions** happening throughout the event.  
Design a `Session` class with attributes `sessionTitle`, `speakerName`, `duration`, and `roomNumber`. Implement methods `scheduleSession()` to assign a speaker and room and `displaySessionDetails()` to show session information. Create objects for different sessions (e.g., "**AI in Modern Applications**", "**Cybersecurity Trends**") and schedule them with speakers.

---

### **Question 3: Company Interviews**
FAST University is organizing **Procom-25**, a flagship event where **software houses** are coming to hire final-year students. The university needs a system to manage company participation and student interviews.  
Design a `Company` class with attributes `companyName`, `industryType`, `jobRole`, and `requiredSkills`. Implement methods `scheduleInterview(Student student)` to assign an interview slot to a student and `displayCompanyDetails()` to show company information.  
Create objects for the following companies:
- "**Systems Limited**", hiring **Software Engineers**, requiring skills in **Java**, **Python**, and **SQL**.
- "**Folio3**", hiring **Data Analysts**, requiring skills in **Machine Learning**, **Python**, and **Power BI**.

Schedule interviews for students based on their skills and display company details.

---

### **Question 4: Course Enrollment System**
FAST University wants to develop a **Course Enrollment System** that allows students to register for courses and view their details.  
Design a `Course` class with private attributes `courseCode`, `courseName`, and `creditHours`. Implement **getter and setter methods** to access and modify these attributes while maintaining encapsulation.  
- The **setter methods** should validate that `courseCode` follows a standard format (e.g., "CS101") and that `creditHours` is between 1 and 4.
- The **getter methods** should allow students to view course details.

Create an object of the `Course` class, use the setter methods to assign values, and then retrieve and display the course details using getter methods.

---

### **Question 5: Inventory System**
A retail shopkeeper wishes to maintain an inventory system for the items available in his shop.  
1. **Class Definition**: Create a class named `Item` to represent each product in the store.  
2. **Attributes**:
   - **Public Member Variables**: `itemName`, `itemID` (these represent the name and unique identifier of the item).
   - **Private Member Variables**: `price`, `stock` (representing the price and quantity of the item available in stock).
3. **Access Methods**: Implement accessor (getter) and mutator (setter) methods for the private member variables (`price` and `stock`), ensuring encapsulation of sensitive data.
4. **Search and Display**: Enable users to search for an item by name or ID. Upon finding the item, the system should display its price. The price of the item should be set using the setter method for the price.
5. **Purchase Validation**: Allow the user to specify the quantity they wish to purchase. Use the setter function for updating stock and ensure that the user cannot purchase more items than what is available in stock. If the requested quantity exceeds the available stock, display an error message stating that the purchase cannot be completed due to insufficient stock.
6. **Billing**: Calculate and display the total bill for the purchased items based on the price and quantity, ensuring the bill reflects the updated stock after the transaction.

---

### **Question 6: Student Class**
Create a class named `Student` with the following public fields:  
1. **Attributes**:
   - `Age`: an integer representing the student's age.
   - `Name`: a string representing the student's name.
   - `Course`: a string representing the course the student is enrolled in.
2. **Main Method**:
   - In the `main` method, instantiate an object of the `Student` class.
   - Set the `Name` field to your full name, the `Age` field to your age, and the `Course` field to "OOP in JAVA".
3. **Output**:
   - Output a statement to the screen displaying the following message:
     ```
     My name is {Name}, I'm {Age} years old, and I am studying {Course}.
     ```
   - The values for `{Name}`, `{Age}`, and `{Course}` should be retrieved from the object's fields.

---

### **Question 7: Book Class**
Write a Java class `Book` with the following features:  
1. **Instance Variables**:
   - `title` for the title of the book (type `String`).
   - `author` for the author’s name (type `String`).
   - `price` for the book price (type `double`).
2. **Constructor**:
   - `public Book(String title, String author, double price)`: A constructor with parameters, it creates the `Book` object by setting the fields to the passed values.
3. **Instance Methods**:
   - `public void setTitle(String title)`: Used to set the title of the book.
   - `public void setAuthor(String author)`: Used to set the name of the author of the book.
   - `public void setPrice(double price)`: Used to set the price of the book.
   - `public String getTitle()`: This method returns the title of the book.
   - `public String getAuthor()`: This method returns the author’s name of the book.
   - `public String toString()`: This method prints out the book’s details to the screen.

Write a separate class `BookDemo` with a `main()` method that creates a `Book` titled “Java: A Beginner's Guide” with author `Herbert Schildt` and price `100.95`.

---

### **Question 8: Temperature Adjustment**
A weather monitoring system in Karachi records daily temperatures in an array. Due to a calibration issue, the recorded temperatures need to be adjusted by adding 2 degrees to each value. Your task is to implement a method that takes an array of temperatures, updates each value by adding 2, and displays both the original and modified temperatures. This adjustment ensures accurate weather reports for the week, helping meteorologists provide precise forecasts for Karachi’s climate.     
**Example Output**:
---

### **Question 9: Discount Calculator**
A retail store is running a special discount offer on selected items. The store has a list of product prices, and all products need a 10% discount applied. Your task is to write a Java program that stores the prices in an array, applies a 10% discount to each price, and then displays the original and discounted prices. This helps customers see the difference in pricing during the sale period.    
**Example Output**:
---

### **Question 10: Student Enrollment System**
FAST NUCES Karachi Campus maintains a record of students enrolled in a course. The system should allow students to register, update their details, or withdraw from the course. Your task is to:  
1. Implement a system where students can enroll by adding their names to the record.  
2. Provide an option to update a student’s name if there’s a correction.  
3. Enable removal of a student from the record if they withdraw.  
4. Display the current list of enrolled students.  

This system ensures efficient student record management and allows for easy modifications during the academic semester at FAST NUCES Karachi Campus.

---

### **Question 11: Gym Membership System**
A gym in Karachi keeps track of its active members and their details. Members can join, update their names, or cancel their memberships at any time. Your task is to:  
1. Allow new members to register by adding their names to the system.  
2. Provide an option to update an existing member’s name if needed.  
3. Implement a feature to remove a member who cancels their subscription.  
4. Display the current list of active members.  

This system helps the gym effectively manage its membership records while ensuring up-to-date information.

---