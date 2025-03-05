package assign.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {


    private int result = 0;
    private final List<Integer> resultList = new ArrayList<>();

    public List<Integer> getResultList() {
        return new ArrayList<>(resultList);
    }

    //결과출력 메서드
    private void printResult() {
        System.out.println("결과 : " + result);
    }

    //사칙연산 메서드
    private void sum(int num1, int num2) {
        result = num1 + num2;
    }

    private void sub(int num1, int num2) {
        result = num1 - num2;
    }

    private void mul(int num1, int num2) {
        result = num1 * num2;
    }

    private void div(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
        } else {
            result = num1 / num2;
        }
    }

    public void calculate(int num1, int num2, char cal) {
        switch (cal) {
            case '+' -> sum(num1, num2);

            case '-' -> sub(num1, num2);

            case '*' -> mul(num1, num2);

            case '/' -> div(num1, num2);

            default -> System.out.println("잘못된 입력입니다.");
        }
        resultList.add(result);
        printResult();
    }


    //입력받은 check 값에 따라 결과 리스트 삭제&초기화
    public void deleteResultList(int check){
        switch (check) {
            case 1 -> removeResult();
            case 2 -> clearResult();
            default -> System.out.println("잘못된 숫자를 입력했습니다.");
            }
        }

    //가장 먼저 추가된 결과 삭제
    public void removeResult() {
            if (resultList.isEmpty()) {
                System.out.println("저장된 결과가 없습니다.");
            } else {
                resultList.remove(0);
                System.out.println("결과 리스트 : "+resultList);
            }
    }

    //결과 리스트 전부 삭제
    public void clearResult() {
        if(resultList.isEmpty()){
            System.out.println("이미 결과 리스트가 비어있습니다.");
        }else {
            resultList.clear();
            System.out.println("결과 리스트가 초기화 되었습니다.");
        }

    }
}