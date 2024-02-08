package homework.calculator;

import java.util.List;

public class Calculator {

    private String doubleToBinary(String n){
        StringBuilder str = new StringBuilder();

        for (String number: n.split("\\.") ) {
            str.append(Long.toBinaryString(Long.parseLong(number))).append(" ");
        }

        return  str.toString();
    }
    public double sum(List<? extends Number> numbers){
        return numbers.stream().mapToDouble(Number::doubleValue).sum();
    }

    public double multiplication(List<? extends Number> numbers){
        return numbers.stream().mapToDouble(Number::doubleValue).reduce((x, y) -> x * y).getAsDouble();
    }

    public double division(List<? extends Number> numbers){
        return  numbers.stream().mapToDouble(Number::doubleValue).reduce((x, y) -> x / y).getAsDouble();
    }

    public Object translateToBinary(Object n) {

        if(n instanceof Number){
            if(n instanceof Integer){
                return Integer.toBinaryString((int) n);
            } else {
                return Long.toBinaryString(Double.doubleToLongBits((double) n));
            }
        } else if(n instanceof  String){
            if(((String) n).contains(".")){
                return doubleToBinary((String) n);
            } else {
                return Integer.parseInt((String) n, 2);
            }
        }

        return -1;
    }
}
