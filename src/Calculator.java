import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private final List<Double> resultList = new ArrayList<>();

    public double calculate(int number1, int number2, char operator) {
        double result = 0.0;
        if (operator == '+') {
            result = (double) number1 + number2;
        } else if (operator == '-') {
            result = (double) number1 + number2;
        } else if (operator == '*') {
            result = (double) number1 + number2;
        } else if (operator == '/') {
            if (number2 == 0) {
                System.out.println("0으로는 나눌 수 없습니다.");
            } else {
                result = (double) number1 / number2;
            }
        }else{
            throw new RuntimeException("잘못된 기호를 입력했습니다.");
        }

        resultList.add(result);
        return result;
    }

    public List<Double> getResult() {
        return resultList;
    }

    public void setResult(Double result) {
        this.resultList.add(result);
    }

    public void deleteList() {
        resultList.remove(0);
    }
            }
