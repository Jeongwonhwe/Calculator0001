import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculator calculator01 = new Calculator();
        Scanner sc = new Scanner(System.in);
        int number1;
        int number2;
        char operator;

        String exit = "";
        while (!exit.equals("exit")) {
            try {
                System.out.println("첫 번째 숫자 입력");
                number1 = sc.nextInt();
                System.out.println("두 번쨰 숫자 입력");
                number2 = sc.nextInt();

                System.out.println("연산 기호 입력");
                operator = sc.next().charAt(0);

                double result = calculator01.calculate(number1, number2, operator);
                System.out.println(result);
                System.out.println("종료를 원하면 exit / 계속하려면 아무 글자 입력");
                sc.nextLine();
                exit = sc.nextLine();

            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("다시 입력해주세요");
                continue;

            }

            calculator01.deleteList();
            List<Double> resultList = calculator01.getResult();

            for (Double result : resultList) {
                System.out.println(result);
            }
            System.out.println("=====delete중=====");
            calculator01.deleteList();
            System.out.println("=====delete중=====");
            List<Double> resultList2 = calculator01.getResult();

            for (Double result : resultList2) {
                System.out.println(result);
            }
        }
    }
}
