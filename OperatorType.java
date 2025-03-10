package assign.calculator.level3;

public enum OperatorType {

    //입력받은 연산기호에 따라 num1,num2 연산
    //apply 추상 메서드를 오버라이드
    ADD('+'){
        @Override
        public int apply(int num1, int num2) {
            return num1 + num2;
        }
    },
    SUB('-'){
        @Override
        public int apply(int num1, int num2) {
            return num1 - num2;
        }
    },
    MUL('*'){
        @Override
        public int apply(int num1, int num2) {
            return num1 * num2;
        }
    },
    DIV('/'){
        @Override
        public int apply(int num1, int num2) {
            if (num2 == 0) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                return 0;
            } else {
                return num1 / num2;
            }
        }
    };

    //필드
    private final char cal;

    //생성자
    OperatorType(char cal) {
        this.cal = cal;
    }


    //추상메서드
    public abstract int apply(int num1, int num2);

    public static OperatorType operator(char cal) {
        for (OperatorType op : OperatorType.values()) {
            if (op.cal == cal) {
                return op;
            }
        }
        return null;
    }


}
