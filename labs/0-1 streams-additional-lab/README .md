# **Lab: Practicing Lambdas and Streams with a Classroom Application**

---

## **Objective**  
In this lab, you will practice **lambdas** and **streams** by implementing various methods to filter, transform, and manipulate a list of students based on specific attributes. By completing this lab, you'll strengthen your understanding of **functional programming** in Java.

---

## **The Scenario**  
You are tasked with developing a Java application that manages a classroom of students. Each student has the following attributes:  
- `name` (String)  
- `age` (int)  
- `grade` (double)  
- `city` (String)

Additionally, each classroom has a teacher with these attributes:  
- `name` (String)  
- `age` (int)  
- `city` (String)

You will implement various methods to filter and process the students based on the teacher's details and their attributes.

---

## **Getting Started**
1. **Set up the project**: Create a `Student` and `Teacher` class.  
   - **Student attributes**: `name`, `age`, `grade`, `city`.  
   - **Teacher attributes**: `name`, `age`, `city`.  
2. **Create a list of students**: Populate a list of `Student` objects with at least 20 entries (you can use a helper method for this).  
3. **Write a `Classroom` class**: This class will contain the teacher, the list of students, and the methods to process the students.

---

## **Tasks**

### **1. Filtering Methods**
1. **findStudentsBelowAge(int age)**  
   - Return all students whose age is below the given parameter.  

2. **getHighAchievers(double minGrade)**  
   - Return all students with grades greater than or equal to the provided grade.  

3. **getHalfTeacherAgeStudents()**  
   - Return students whose age is half or less than the teacher's age.

---

### **2. Transformation and Aggregation Methods**
4. **calculateAverageGrade()**  
   - Calculate and return the average grade of all students in the class.  

5. **getStudentNames()**  
   - Return a single string of all student names, separated by commas (e.g., `"Alice, Bob, Charlie"`).

6. **getGradesMap()**  
   - Return a `Map<Character, List<Student>>` where grades are grouped into:  
     - A: 90 and above  
     - B: 80–89  
     - C: 70–79  
     - D: Below 70  

---

### **3. Sorting Methods**
7. **sortStudentsByAge()**  
   - Return a list of students sorted by age in ascending order.  

8. **sortStudentsByGrade()**  
   - Return a list of students sorted by grade in descending order.  

---

### **4. Advanced Queries**
9. **findTopPerformers(int count)**  
   - Return the top `count` students based on grades.  

10. **findLowestPerformers(int count)**  
    - Return the lowest `count` students based on grades.  

11. **studentsByCity()**  
    - Return a `Map<String, List<Student>>`, where the key is the city, and the value is a list of students in that city.  

---

### **5. Bonus Tasks**
12. **getInPersonTutoringStudents()**  
    - Return all students in the same city as the teacher.  

13. **getUniqueStudentsByCity()**  
    - Return a `Map<String, Student>` containing only one student per city. If multiple students are from the same city, pick the one whose name comes first alphabetically.  

14. **groupStudentsByAgeRange()**  
    - Return a `Map<String, List<Student>>` grouping students into these age ranges:  
      - 20–29  
      - 30–39  
      - 40–49  
      - 50–59  

15. **searchStudents(String name, int age, double grade)**  
    - Return all students matching the provided name, age, and grade.  

---

## **Submission Requirements**
1. Submit your code files (`Student.java`, `Teacher.java`, `Classroom.java`) and test cases.  
2. Each method must:
   - Use **streams** and **lambdas** effectively.  
   - Avoid manual loops wherever possible.  

3. Document your code with comments explaining your approach.  

---

## **Example Data**
### Students
| Name     | Age | Grade | City       |
|----------|-----|-------|------------|
| Alice    | 18  | 92.5  | New York   |
| Bob      | 22  | 84.3  | Los Angeles|
| Charlie  | 21  | 67.8  | Chicago    |
| Diana    | 19  | 75.4  | New York   |
| Eve      | 23  | 89.9  | Boston     |

### Teacher
| Name   | Age | City       |
|--------|-----|------------|
| Mr. Lee| 40  | New York   |

---

## **Grading Rubric**
- **Functionality**: Methods work as described and pass test cases (50%).  
- **Stream Usage**: Demonstrates proper use of streams and lambdas (30%).  
- **Code Readability**: Code is clean, commented, and readable (10%).  
- **Bonus Tasks**: Completed bonus tasks (10%).  

---

This lab will encourage you to think critically and write concise, stream-oriented solutions. Good luck!
