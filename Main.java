package homework.calculator;


import java.util.*;
import java.util.regex.Pattern;

public class Main {
    private static Scanner scanner = new Scanner(System.in);


    private static List<Number> getArray(){
        System.out.print("Введите числа через запятую: ");

        String numbers = scanner.next();
        List<Number> number = new ArrayList<>();


        for (String str: numbers.split(",")){
            number.add(Double.parseDouble(str));
        }

        return number;
    }

    private static Number getNumber(){
        System.out.print("Введите число: ");

        String number = scanner.next();

        if(number.contains(".")) return  Double.parseDouble(number);
        else return Integer.parseInt(number);
    }
    private static void init(){
        int choice;
        Calculator calculator = new Calculator();

        while (true) {
            /* Choice */
            System.out.println("Выберите из:");
            System.out.println("1 - Сложение чисел");
            System.out.println("2 - Умножение чисел");
            System.out.println("3 - Деление чисел");
            System.out.println("4 - Перевод в бинарное число");
            System.out.println("5 - Перевод из бинарное число");
            System.out.println("0 - Закончить выбор");

            System.out.print("Enter: ");
            choice = scanner.nextInt();
            System.out.println();

            if (choice == 0)
                break;

            switch (choice) {
                case 1:
                    System.out.printf("Сумма чисел: %s\n", calculator.sum(getArray()));
                    break;
                case 2:
                    System.out.printf("Умножение чисел: %s\n", calculator.multiplication(getArray()));
                    break;
                case 3:
                    System.out.printf("Деление чисел: %s\n", calculator.division(getArray()));
                    break;
                case 4:
                    System.out.printf("Перевод числа: %s\n", calculator.translateToBinary(getNumber()));
                    break;
                case 5:
                    System.out.print("Введите число: ");
                    String binary = scanner.next("[0-1]*");
                    System.out.printf("Перевод числа: %s\n", calculator.translateToBinary(binary));
                    break;
                default:
                    break;
            }

        }
    }


    public static void main(String[] args) {
        init();
    }
}
