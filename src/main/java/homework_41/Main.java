package homework_41;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main() {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Jon", 16, 3.5));
        students.add(new Student("Naomi", 15, 4.8));
        students.add(new Student("Oigen", 26, 3.2));
        students.add(new Student("Yana", 22, 5.0));
        students.add(new Student("Vadym", 27, 5.0));
        students.add(new Student("Shon", 17, 3.8));


        List<Student> lowGradeStudents = students.stream()
                .filter(s -> s.getGrade() < 4.0)
                .collect(Collectors.toList());

        System.out.println("Оцінка < 4.0: " + lowGradeStudents);


        Student bestStudent = students.stream()
                .max(Comparator.comparingDouble(Student::getGrade))
                .get();

        System.out.println("Найвища оцінка: " + bestStudent);


        long countOlderThan20 = students.stream()
                .filter(s -> s.getAge() > 20)
                .count();

        System.out.println("Старші за 20: " + countOlderThan20);


        List<String> sortedNames = students.stream()
                .sorted((a, b) -> Double.compare(b.getGrade(), a.getGrade()))
                .map(Student::getName)
                .collect(Collectors.toList());

        System.out.println("Імена за спаданням оцінки: " + sortedNames);


        boolean hasPerfectGrade = students.stream()
                .anyMatch(s -> s.getGrade() == 5.0);

        System.out.println("Є оцінка 5.0? " + hasPerfectGrade);


        List<String> goodStudents = students.stream()
                .filter(s -> s.getGrade() > 4.0)
                .map(Student::getName)
                .collect(Collectors.toList());

        System.out.println("Оцінка > 4.0: " + goodStudents);
    }
}