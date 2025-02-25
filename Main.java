package assign.calcurator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            //숫자 입력 받기
            System.out.print("첫번째 숫자 : ");
            int num1 = sc.nextInt();
            System.out.print("두번째 숫자 : ");
            int num2 = sc.nextInt();
            if(num1<0||num2<0){
                System.out.println("양의 정수 혹은 0을 입력해주세요.");
                continue;
            }
            //사칙연산 기호 입력 받기
            System.out.print("사칙연산 기호 입력(+,-,*,/) : ");
            char cal = sc.next().charAt(0);
            int result = 0;

            //입력한 값에 따라 사칙연산 출력
            switch (cal) {
                case '+' -> {
                    result = num1 + num2;
                    System.out.println("결과 : " + result);
                    break;
                }
                case '-' -> {
                    result = num1 - num2;
                    System.out.println("결과 : " + result);
                    break;
                }
                case '*' -> {
                    result = num1 * num2;
                    System.out.println("결과 : " + result);
                    break;
                }
                case '/' -> {
                    if(num2==0){
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        break;
                    }
                    result = num1 / num2;
                    System.out.println("결과 : " + result + " / 나머지 : " + (num1 % num2));
                    break;
                }
                default -> {
                    System.out.println("잘못된 입력입니다.");
                    break;
                }
            }
            //exit 입력시 프로그램 종료
            System.out.print("계속하시겠습니까? (exit 입력시 종료)");
            if (sc.next().equals("exit")) {
                break;
            }

        }
    }
}
