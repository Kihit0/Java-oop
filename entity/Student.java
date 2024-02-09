package homework.group.entity;

import lombok.*;

@Getter
@Setter
public class Student extends User {
    private Integer id;

    public Student(String birthday, String fullname, Integer id) {
        super(birthday, fullname);
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", birthday='" + birthday + '\'' +
                ", fullname='" + fullname + '\'' +
                '}';
    }
}
