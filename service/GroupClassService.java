package homework.group.service;

import homework.group.entity.Student;
import homework.group.entity.Teacher;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupClassService {

    private final Map<Integer, List<Integer>> groups = new HashMap<>();

    public void add(Integer teacher, List<Integer> students){
        groups.put(teacher, students);
    }

    public  Map<Integer, List<Integer>> getGroups(){
        return  this.groups;
    }
}
