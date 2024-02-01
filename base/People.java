package base;

public class People extends Base{
    
    public People(int longJump, int longRun) {
        super(longJump, longRun);
    }

    @Override
    public void run() {
        if(super.longRun > 4000){
            System.out.printf("Человек не может пробежать такую %d дистанцию\n", super.longRun);
        } else {
            System.out.printf("Человек пробежал дистанцию на %d\n", super.longRun);
        }
    }

    @Override
    public void jump() {
        if(super.longJump > 2){
            System.out.printf("Человек не может прыгнуть на такую %d высоту\n", super.longJump);
        } else {
            System.out.printf("Человек запрыгнул на %d\n", super.longJump);
        }
    }

}