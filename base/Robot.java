package base;

public class Robot extends Base {

    public Robot(int longJump, int longRun) {
        super(longJump, longRun);
    }

    @Override
    public void run() {
        if(super.longRun > 100){
            System.out.printf("Робот не может пробежать такую %d дистанцию\n", super.longRun);
        } else {
            System.out.printf("Робот пробежал дистанцию на %d\n", super.longRun);
        }
    }

    @Override
    public void jump() {
        if(super.longJump > 1){
            System.out.printf("Робот не может прыгнуть на такую %d высоту\n", super.longJump);
        } else {
            System.out.printf("Робот запрыгнул на %d\n", super.longJump);
        }
    }
    
}
