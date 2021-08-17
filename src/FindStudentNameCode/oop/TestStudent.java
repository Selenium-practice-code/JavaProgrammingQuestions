package FindStudentNameCode.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestStudent {

    public static void main(String[] args) {

        Student s1 = new Student("Suraj", 1, 85, 18);
        Student s2 = new Student("Mansi", 2, 95, 20);
        Student s3 = new Student("Sanjay", 3, 75, 15);
        Student s4 = new Student("Amit", 4, 89, 19);
        Student s5 = new Student("Rahul", 5, 97, 17);

        // add all the Student object in to Array List
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);

        System.out.println("Total Students: " + studentList.size());

        for (Student s : studentList) {

            System.out.println("List of the Students : " + s);
        }

        studentList.stream().forEach(student -> System.out.println(student));

        // Name where marks >90
        studentList.stream().filter(student -> student.getMarks() > 90)
                .forEach(student -> System.out.println(student.getName() + ":" + student.getMarks()));

        // Student name who got highest marks
        int hm = studentList.stream().map(student -> student.getMarks()).max(Integer::compare).get();
        System.out.println("hight marks : " + hm);

        studentList.stream().filter(student -> student.getMarks() == hm).forEach(student -> System.out.println(student));
    }
}
