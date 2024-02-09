package homework.group.service;


import homework.group.entity.User;

public interface DataService {
        void create(User user);
        User read(Integer id, String search);
}
