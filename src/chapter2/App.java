package chapter2;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Calculator 인스턴스화. calculator는 Heap 영역에 저장될듯.
        Calculator calculator = new Calculator();

        long result = 0;
        long firstNumber;
        long secondNumber;

        String exit = "";
        do {
            System.out.print("첫번째 양의 정수를 입력하세요 : ");
            firstNumber = scanner.nextLong();

            System.out.print("두번째 양의 정수를 입력하세요 : ");
            secondNumber = scanner.nextLong();

            System.out.print("사칙연산 기호를 입력하세요 : ");
            char operation = scanner.next().charAt(0);

            // Calculator 클래스에서 만든 기능들 사용
            switch (operation) {
                case '+':
                    result = calculator.sum(firstNumber, secondNumber);
                    break;
                case '-':
                    result = calculator.sub(firstNumber, secondNumber);
                    break;
                case '*':
                    result = calculator.multiply(firstNumber, secondNumber);
                    break;
                case '/':
                    if (secondNumber == 0) {
                        System.out.println("나눗셈에서 분모에 0이 올 수 없습니다.");
                    } else {
                        result = calculator.div(firstNumber, secondNumber);
                    }
                    break;
                default:
                    System.out.println("올바른 사칙연산 기호가 아닙니다.");
                    break;
            }
            System.out.println("결과값 : " + result);
            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료)");
            String userInput = scanner.next();

            if (userInput.equals("exit")) {
                exit = "exit";
            }

        } while (!"exit".equals(exit));

        ArrayList<Long> resultList = calculator.getResultList();
        System.out.println("resultList = " + resultList);
        calculator.removeResult();
        System.out.println("resultList = " + resultList);
    }
}
