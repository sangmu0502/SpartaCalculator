package chapter1;

import java.util.Scanner;

// 필수 구현 (클래스 없이 자바의 기본 문법만을 사용하여 구현한 계산기)
public class Main {
    public static void main(String[] args) {
        // 1. 양의 정수(0 포함)을 입력받기
        // a. 양의 정수를 입력받으려면 Scanner객체를 생성해야한다.
        // b. 양의 정수이기 때문에 int 혹은 long 자료형을 사용해서 입력을 받는다.
        // c. 양의 정수 2개를 전달 받아야 하기 때문에 스캐너를 2개 생성해야한다.
        Scanner scanner = new Scanner(System.in);

//        System.out.print("첫번째 양의 정수를 입력하세요 : ");
//        long firstNumber = scanner.nextLong();
//
//        System.out.print("두번째 양의 정수를 입력하세요 : ");
//        long secondNumber = scanner.nextLong();
//
//        // 2. 사칙연산(+, -, X, %)를 입력받기
//        System.out.print("사칙연산 기호를 입력하세요 : ");
//        char operation = scanner.next().charAt(0);
//        System.out.println("operation = " + operation);

        // 3. 위에서 입력받은 양의 정수 2개와 사칙연산 기호를 사용하여 연산을 진행한 후 결과값을 출력하기
        // a. 결과값을 저장할 정수형 변수 result 선언.
        // b. switch-case 문으로 +, -, /, *에 해당하는 부분들 각각 제어하고, 나눗셈의 부모는 예외처리 해준다.

        // 반복문 안에 firstNumber, secondNumber가 들어가면 변수가 계속 생성되기때문에 올바른 구조는 아니다.
        long result = 0;
        long firstNumber = 0;
        long secondNumber = 0;

        // 4. 반복문으로 계산기에 exit입력이 오기 전까지는 작동하게.
        String exit = "";
        do {
            System.out.print("첫번째 양의 정수를 입력하세요 : ");
            firstNumber = scanner.nextLong();

            System.out.print("두번째 양의 정수를 입력하세요 : ");
            secondNumber = scanner.nextLong();

            // 2. 사칙연산(+, -, X, %)를 입력받기
            System.out.print("사칙연산 기호를 입력하세요 : ");
            char operation = scanner.next().charAt(0);

            switch (operation) {
                case '+':
                    result = firstNumber + secondNumber;
                    break;
                case '-':
                    result = firstNumber - secondNumber;
                    break;
                case '*':
                    result = firstNumber * secondNumber;
                    break;
                case '/':
                    if (secondNumber == 0) {
                        System.out.println("나눗셈에서 분모에 0이 올 수 없습니다.");
                    } else {
                        result = firstNumber / secondNumber;
                    }
                    break;
                default:
                    System.out.println("올바른 사칙연산 기호가 아닙니다.");
                    break;
            }
            System.out.println("결과값 : " + result);
            
            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료)");
            // 문제 1. 여기서 exit에 입력을 받지않고 왜 넘어갈까?
            // next 와 nextLine 차이에 대해서 구글링 해보기
            String userInput = scanner.next();
            // 깊은복사, 얕은복사 ( ==으로 했을 때는 안되고 equals는 왜 되는지)
            // 개발자 디버깅 (문제 발생했을 때 해결)
            if (userInput.equals("exit")) {
                exit = "exit";
            }
//            System.out.println("userInput : " + userInput.length());
//            System.out.println("exit = " + exit);
            
        } while (!"exit".equals(exit));

    }
}
