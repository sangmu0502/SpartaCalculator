package chapter2;
import java.util.ArrayList;

// 사칙연산을 수행 후, 결과값 반환 메서드 구현 & 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스 생성
public class Calculator {
    // 1. 사칙연산을 수행한 후, 결과값을 반환하는 메서드 구현
    // 2. 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스 생성
    // 양의 정수 2개(0포함)와 연산 기호를 매개변수로 받아 사칙연산 기능을 수행한 후,
    // 결과 값을 반환하는 메서드와 연산 결과를 저장하는 컬렉션 타입 필드를 가진 클래스 생성

    // 속성
    private long firstNum;
    private long secondNum;
    ArrayList<Long> resultList = new ArrayList<>();
    // 컬렉션에서 리스트의 크기를 어떻게 정할지?


    // 생성자
    // App에서 구현한 계산기에는 선언과 동시에 값을 넣기 힘든 구조인 것 같다.
//    Calculator (long firstNum, long secondNum) {
//        this.firstNum = firstNum;
//        this.secondNum = secondNum;
//    }

    // 기능
    // 더하기 기능
    public long sum(long firstNum, long secondNum) {
        long result = firstNum + secondNum;
        this.resultList.add(result);

        return result;
    }

    // 빼기 기능
    public long sub(long firstNum, long secondNum) {
        long result = firstNum - secondNum;
        this.resultList.add(result);

        return result;
    }

    // 곱하기 기능
    public long multiply(long firstNum, long secondNum) {
        long result = firstNum * secondNum;
        this.resultList.add(result);

        return result;
    }

    // 나누기 기능
    public long div(long firstNum, long secondNum) {
        long result = firstNum / secondNum;
        this.resultList.add(result);

        return result;
    }

    // getter 메서트
    public ArrayList<Long> getResultList() {
        return resultList;
    }

    // setter 메서드
    public void setResultList(ArrayList<Long> resultList) {
        this.resultList = resultList;
    }

    // resultResult에서 첫번째 값 삭제하는 메서드
    public void removeResult() {
        this.resultList.remove(0);
    }
}
