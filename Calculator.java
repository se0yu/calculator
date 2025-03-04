package assign.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private int result = 0;
    private final List<Integer> resultList = new ArrayList<>();


    private void printResult() {
        System.out.println("결과 : " + resultList);
    }



    public void calculate(int num1, int num2, char cal) {
        switch (cal) {
            case '+' -> {
                result = num1 + num2;
                resultList.add(result);
                break;
            }
            case '-' -> {
                result = num1 - num2;
                resultList.add(result);
                break;
            }
            case '*' -> {
                result = num1 * num2;
                resultList.add(result);
                break;
            }
            case '/' -> {
                if (num2 != 0) {
                    result = num1 / num2;
                    resultList.add(result);
                } else {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }
                break;
            }

            default -> {
                System.out.println("잘못된 입력입니다.");
                break;
            }
        } if(resultList.isEmpty()){
            System.out.println("저장된 값이 없습니다.");
        }else printResult();
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