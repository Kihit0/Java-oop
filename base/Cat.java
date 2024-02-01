package base;

public class Cat extends Base {
    
    public Cat(int longJump, int longRun) {
        super(longJump, longRun);
    }

    @Override
    public void run() {
        if(super.longRun > 200){
            System.out.printf("Кот не может пробежать такую %d дистанцию\n", super.longRun);
        } else {
            System.out.printf("Кот пробежал дистанцию на %d\n", super.longRun);
        }
    }

    @Override
    public void jump() {
        if(super.longJump > 2){
            System.out.printf("Кот не может прыгнуть на такую %d высоту\n", super.longJump);
        } else {
            System.out.printf("Кот запрыгнул на %d\n", super.longJump);
        }
    }
        
}
