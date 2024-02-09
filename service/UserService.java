package homework.group.service;

import homework.group.entity.Student;
import homework.group.entity.Teacher;
import homework.group.entity.User;

import java.util.ArrayList;
import java.util.List;


public class UserService implements DataService{
    private final List<User> users = new ArrayList<>();
    private Integer lastIdxSt = 0, lastIdxTr = 0;
    @Override
    public void create(User user) {
        if(user instanceof Teacher) {
            ((Teacher) user).setId(lastIdxTr);
            lastIdxTr++;
        } else if(user instanceof Student) {
            ((Student) user).setId(lastIdxSt);
            lastIdxSt++;
        }
        users.add(user);
    }

    @Override
    public User read(Integer id, String search) {
        for(User user: users){
            if(search.contains("teacher")){
                if(user instanceof Teacher && ((Teacher) user).getId().equals(id)){
                    return user;
                }
            } else if(search.contains("student")) {
                if(user instanceof Student && ((Student) user).getId().equals(id)) {
                    return user;
                }
            } else break;
        }
        return null;
    }

    public List<Integer> getStudentsId(){
        List<Integer> students = new ArrayList<>();

        for (User user: users){
            if(user instanceof Student){
                students.add(((Student) user).getId());
            }
        }

        return students;
    }

    public Integer getTeacherId(){
        Integer id = null;

        for (User user: users){
            if(user instanceof Teacher){
                id = ((Teacher) user).getId();
            }
        }

        return id;
    }
}
