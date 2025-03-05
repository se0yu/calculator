package assign.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        while (true) {
            //숫자 입력 받기
            System.out.print("첫번째 숫자 : ");
            int num1 = sc.nextInt();
            System.out.print("두번째 숫자 : ");
            int num2= sc.nextInt();
            if (num1 < 0 || num2 < 0) {
                System.out.println("양의 정수 혹은 0을 입력해주세요.");
                continue;
            }
            //사칙연산 기호 입력 받기
            System.out.print("사칙연산 기호 입력(+,-,*,/) : ");
            char cal = sc.next().charAt(0);

            //입력한 값에 따라 사칙연산 출력
            //calculate 함수 호출(연산 할 숫자와 사칙연산 기호)
            calculator.calculate(num1,num2,cal);

            //결과 삭제
            System.out.print("저장된 결과를 삭제 하시겠습니까?(delete 입력시 가장 오래된 결과 삭제,clear 입력시 전부 삭제)");
            calculator.deleteResult(sc.next());

            //exit 입력시 프로그램 종료.
            System.out.print("계속하시겠습니까? (exit 입력시 종료)");
            if (sc.next().equals("exit")) {
                break;
            }
        }
    }
}
