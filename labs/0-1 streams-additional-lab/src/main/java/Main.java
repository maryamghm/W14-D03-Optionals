import org.example.classroom.Classroom;
import org.example.classroom.Student;
import org.example.classroom.Teacher;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr. Lee", 40, "New York");

        List<Student> students = Arrays.asList(
                new Student("Alice", 18, 92.5, "New York"),
                new Student("Bob", 22, 84.3, "Los Angeles"),
                new Student("Charlie", 21, 67.8, "Chicago"),
                new Student("Diana", 19, 75.4, "New York"),
                new Student("Eve", 23, 89.9, "Boston"),
                new Student("Frank", 20, 71.2, "Chicago"),
                new Student("Grace", 21, 88.0, "New York"),
                new Student("Hannah", 22, 65.3, "Los Angeles"),
                new Student("Ian", 19, 74.2, "Boston"),
                new Student("Jack", 20, 90.1, "San Francisco"),
                new Student("Kara", 23, 77.5, "New York"),
                new Student("Liam", 18, 82.7, "Los Angeles"),
                new Student("Mia", 20, 85.9, "Chicago"),
                new Student("Noah", 21, 92.4, "New York"),
                new Student("Olivia", 19, 70.8, "Boston"),
                new Student("Paul", 22, 63.9, "San Francisco"),
                new Student("Quinn", 20, 78.6, "Chicago"),
                new Student("Ruby", 23, 81.0, "New York"),
                new Student("Sophia", 18, 89.2, "Boston"),
                new Student("Tom", 22, 68.5, "Los Angeles")
        );

       Classroom classroom = new Classroom(teacher, students);

        task1(classroom);
        task2(classroom);
        task3(classroom);
        task4(classroom);
        task5(classroom);

    }

    private static void task1(Classroom classroom) {
        System.out.println("Task1: Filtering Methods");
        System.out.println("\nList of Students younger than 20:");
        classroom.findStudentsBelowAge(20).forEach(System.out::println);

        System.out.println("\nList of Students with a grade equal or greater than 70:");
        classroom.getHighAchievers(70).forEach(System.out::println);

        System.out.println("\nList of Students whose age is half or less than the teacher's age:");
        classroom.getHalfTeacherAgeStudents().forEach(System.out::println);

    }

    private static void task2(Classroom classroom) {
        System.out.println("\nTask2: Transformation and Aggregation Methods");
        System.out.printf("\nAverage grade of the classroom is: %.2f\n", classroom.calculateAverageGrade());

        System.out.println("\nAll student names:");
        System.out.println(classroom.getStudentNames());

        Map<Character, List<Student>> gradeStudentMap = classroom.getGradesMap();
        System.out.println("\nList of Students with grade level A (90 and above):");
        gradeStudentMap.get('A').forEach(System.out::println);
        System.out.println("\nList of Students with grade level B (80–89):");
        gradeStudentMap.get('B').forEach(System.out::println);
        System.out.println("\nList of Students with grade level C (70–79):");
        gradeStudentMap.get('C').forEach(System.out::println);
        System.out.println("\nList of Students with grade level D (Below 70):");
        gradeStudentMap.get('D').forEach(System.out::println);
    }

    private static void task3(Classroom classroom) {
        System.out.println("\nTask3: Sorting Methods");
        System.out.println("\nList of Students sorted by age in ascending order:");
        classroom.sortStudentsByAge().forEach(System.out::println);

        System.out.println("\nList of Students sorted by grade in descending order:");
        classroom.sortStudentsByGrade().forEach(System.out::println);
    }

    private static void task4(Classroom classroom) {
        System.out.println("\nTask4: Sorting Methods");

        System.out.println("\nList of top 3 Students:");
        classroom.findTopPerformers(3).forEach(System.out::println);

        System.out.println("\nList of low 3 Students:");
        classroom.findLowestPerformers(3).forEach(System.out::println);

        System.out.println("\nList of Students grouped by their cities:");
        classroom.studentsByCity().forEach((city, students) -> {
            System.out.println(city + ":");
            students.forEach(System.out::println);
        });
    }

    private static void task5(Classroom classroom) {
        System.out.println("\nTask5: Bonus Tasks");

        System.out.println("\nList of Students living in the same city as the teacher:");
        classroom.getInPersonTutoringStudents().forEach(System.out::println);

        System.out.println("\nList of Students grouped by their cities, each city contains only one Student:");
        classroom.getUniqueStudentsByCity().forEach((city, student) -> {
           System.out.println(city + ":");
           System.out.println(student);
       });

        System.out.println("\nList of Students grouping by age ranges:");
        classroom.groupStudentsByAgeRange().forEach((range, students) -> {
            System.out.println(range + ":");
            students.forEach(System.out::println);
        });

        System.out.println("\nSearching Students: name: \"Mia\", age: \"20\" and grade: \"85.9\":");
        classroom.searchStudents("Mia", 20, 85.9).forEach(System.out::println);
    }
}
