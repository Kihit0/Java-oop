package obstacle;

public class Treadmill extends BaseObstacle {
    public Treadmill(int distance){
        super(distance);
    }

    @Override
    public int getItem() {
        return super.value;
    }

}
