package obstacle;

public class Wall extends BaseObstacle {

    public Wall(int height){
        super(height);
    }

    @Override
    public int getItem() {
       return super.value;
    }
}
