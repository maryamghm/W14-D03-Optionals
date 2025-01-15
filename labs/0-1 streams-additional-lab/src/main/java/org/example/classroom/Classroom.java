package org.example.classroom;

import lombok.Data;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Data
public class Classroom {

    private Teacher teacher;
    private List<Student> students;

    public Classroom(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }

    public List<Student> findStudentsBelowAge(int age) {
        return students.stream()
                .filter(student -> student.getAge() < age)
                .toList();
    }

    public List<Student> getHighAchievers(double minGrade) {
        return students.stream()
                .filter(student -> student.getGrade() >= minGrade)
                .toList();
    }

    public List<Student> getHalfTeacherAgeStudents() {
        return students.stream()
                .filter(student -> student.getAge() <= (teacher.getAge()/2))
                .toList();
    }

    public double calculateAverageGrade() {
        return students.stream()
                .mapToDouble(Student::getGrade)
                .average().getAsDouble();
    }

    public String getStudentNames() {
        return students.stream()
                .map(Student::getName)
                .collect(Collectors.joining(", "));
    }

    public Map<Character, List<Student>> getGradesMap() {
        return students.stream()
                .collect(Collectors.groupingBy(student -> {
                    if (student.getGrade() >= 90) { return 'A'; }
                    if (student.getGrade() >= 80) { return 'B'; }
                    if (student.getGrade() >= 70) { return 'C'; }
                    return 'D';
                }));

    }

    public List<Student> sortStudentsByAge() {
        return students.stream()
                .sorted(Comparator.comparingDouble(Student::getAge)).toList();

    }

    public List<Student> sortStudentsByGrade() {
        return students.stream()
                .sorted(Comparator.comparingDouble(Student::getGrade).reversed())
                .toList();
    }

    public List<Student> findTopPerformers(int count) {
        return students.stream()
                .sorted(Comparator.comparingDouble(Student::getGrade).reversed())
                .limit(count)
                .toList();
    }

    public List<Student> findLowestPerformers(int count) {
        return students.stream()
                .sorted(Comparator.comparingDouble(Student::getGrade))
                .limit(count)
                .toList();
    }

    public Map<String, List<Student>> studentsByCity() {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getCity));
    }

    public List<Student> getInPersonTutoringStudents() {
        return students.stream()
                .filter(student -> student.getCity().equals(teacher.getCity())).toList();
    }

    public Map<String, Student> getUniqueStudentsByCity() {
        Map<String, List<Student>> studentCityMap = studentsByCity();
        return studentCityMap.entrySet().stream().map(entry ->
                Map.entry(entry.getKey(), entry.getValue().stream().min(Comparator.comparing(Student::getName)).get())
        ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    public Map<String, List<Student>> groupStudentsByAgeRange() {
        return students.stream().collect(Collectors.groupingBy(student -> {
            if (student.getAge() <30 && student.getAge() >= 20) { return "20-29"; }
            if (student.getAge() <40 && student.getAge() >= 30) { return "30–39"; }
            if (student.getAge() <50 && student.getAge() >= 40) { return "40–49"; }
            if (student.getAge() <60 && student.getAge() >= 50) { return "50–59"; }
            return "under 20";
        }));
    }

    public List<Student> searchStudents(String name, int age, double grade) {
        return students.stream()
                .filter(student ->
                        student.getName().equals(name)
                                && student.getAge() == age
                                && student.getGrade() == grade)
                .toList();
    }

}