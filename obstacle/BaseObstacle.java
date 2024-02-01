package obstacle;

public abstract class BaseObstacle {
    protected int value;

    protected BaseObstacle(int value){
        this.value = value;
    }

    abstract public int getItem();
} 