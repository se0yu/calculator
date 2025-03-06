package assign.calculator.level3;


import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator {

    //필드
    private int result;
    private final List<Integer> resultList = new ArrayList<>();

    public List<Integer> getResultList() {
        return new ArrayList<>(resultList);
    }



    //결과 출력 메서드
    private void printResult() {
        System.out.println("결과 : " + result);
    }


    public void calculate(int num1, int num2, char cal){
        result = 0;
        OperatorType operatorType = OperatorType.operator(cal);
        result = operatorType.apply(num1,num2);
        resultList.add(result);
        printResult();
    }

    //입력받은 check 값에 따라 결과 리스트 삭제&초기화
    public void deleteResultList(int check){
        switch (check) {
            case 1 -> removeResult();
            case 2 -> clearResult();
            default -> System.out.println("잘못된 입력입니다. 다시 입력 해 주세요.");
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
            System.out.println("이미 결과 리스트가 비어 있습니다.");
        }else {
            resultList.clear();
            System.out.println("결과 리스트가 초기화 되었습니다.");
        }
    }

}
