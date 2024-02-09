package homework.group.controller;

import homework.group.entity.User;
import homework.group.service.GroupClassService;
import homework.group.service.UserService;
import homework.group.entity.Student;
import homework.group.entity.Teacher;
import homework.group.view.View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Controller {

    private final List<Student> students = new ArrayList<>();
    private final View view;
    private final GroupClassService groupClassService;
    private final UserService service;
    public Controller() {
        view = new View();
        groupClassService = new GroupClassService();
        service = new UserService();
    }

    private void fill(){
        Student student1 = new Student("01.01.1999", "Ivan Ivan Ivan", 1);
        Student student2 = new Student("01.01.1999", "Ivan Ivan Ivan", 1);
        Student student3 = new Student("01.01.1999", "Ivan Ivan Ivan", 1);
        Student student4 = new Student("01.01.1999", "Ivan Ivan Ivan", 1);
        Student student5 = new Student("01.01.1999", "Ivan Ivan Ivan", 1);

        students.addAll(Arrays.asList(student1, student2, student3, student4, student5));

        Teacher teacher1 = new Teacher("01.01.1988", "Ivan Ivan Vladimir", 1);
        service.create(teacher1);
    }

    public void init(){
        fill();

        for (Student student : students) {
            service.create(student);
        }

        List<Integer> studentsId = service.getStudentsId();
        Integer teacherId = service.getTeacherId();

        groupClassService.add(teacherId, studentsId);

        System.out.println(groupClassService.getGroups());
    }
}
