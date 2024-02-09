package homework.group.entity;

import lombok.*;

@Getter
@Setter
public class Teacher extends User{
    private Integer id;

    public Teacher(String birthday, String fullname, Integer id) {
        super(birthday, fullname);
        this.id = id;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", birthday='" + birthday + '\'' +
                ", fullname='" + fullname + '\'' +
                '}';
    }
}
