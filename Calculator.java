package assign.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator{


    private int result = 0;
    private final List<Integer> resultList = new ArrayList<>();


    private void printResult() {
        System.out.println("결과 : " + resultList);
    }


    private int sum(int num1, int num2) {
        result = num1 + num2;
        return result;
    }

    private int sub(int num1, int num2) {
        result = num1 - num2;
        return result;
    }

    private int mul(int num1, int num2) {
        result = num1 * num2;
        return result;
    }

    private int div(int num1, int num2) {
        if (num2 != 0) {
            result = num1 / num2;
        } else {
            System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
        }
        return result;
    }

    public void calculate(int num1, int num2, char cal) {
        switch (cal) {
            case '+' -> {
                sum(num1,num2);
            }
            case '-' -> {
                sub(num1, num2);
            }
            case '*' -> {
                mul(num1, num2);
            }
            case '/' -> {
                div(num1, num2);
            }
            default -> {
                System.out.println("잘못된 입력입니다.");
                break;
            }
        }
        resultList.add(result);
        printResult();
    }

     void deleteResult(String check) {
        if(check.equals("delete")){
            if(!resultList.isEmpty()){
                resultList.remove(0);
                System.out.println(resultList);
            }else {
                System.out.println("저장된 결과가 없습니다.");
            }
        }

    }
}