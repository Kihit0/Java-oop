import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import base.Base;
import base.Cat;
import base.People;
import base.Robot;
import obstacle.BaseObstacle;
import obstacle.Treadmill;
import obstacle.Wall;

public class Main {
    private static List<Base> participants = new ArrayList<>();
    private static List<BaseObstacle> treadmill = new ArrayList<>();
    private static List<BaseObstacle> wall = new ArrayList<>();

    private static void fillObstacle() {
        treadmill.addAll(Arrays.asList(
                new Treadmill(5),
                new Treadmill(40),
                new Treadmill(1000)));

        wall.addAll(Arrays.asList(
                new Wall(1),
                new Wall(3),
                new Wall(30)));
    }

    public static void main(String[] args) {
        fillObstacle();

        for (int i = 0; i < treadmill.size(); i++) {
            participants.addAll(Arrays.asList(
                    new People(treadmill.get(i).getItem(), wall.get(i).getItem()),
                    new Robot(treadmill.get(i).getItem(), wall.get(i).getItem()),
                    new Cat(treadmill.get(i).getItem(), wall.get(i).getItem())));
        }


        for (Base base : participants) {
            base.run();
            base.jump();
        }

    }
}