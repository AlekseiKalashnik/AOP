package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Alex K", 5, 4.0);
        Student st2 = new Student("Bogdan D", 5, 3.2);
        Student st3 = new Student("Anton K", 5, 4.8);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Начало работы метода getStudents");
        /*намеренно имитируем выброс исклюения*/
        System.out.println(students.get(3));
        System.out.println("Info from method getStudents: ");
        System.out.println(students);
        return students;
    }
}
