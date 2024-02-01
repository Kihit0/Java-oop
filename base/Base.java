package base;

public abstract class Base{
    protected int longRun;
    protected int longJump;

    public Base(int longJump, int longRun){
        this.longJump = longJump;
        this.longRun = longRun;
    }
    public abstract void run();
    public abstract void jump();
}