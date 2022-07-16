package 인터페이스_요소;

public interface Calc {

    double PI = 3.14;
    int ERROR = -99999999;

    int add(int num1, int num2);
    int subtract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    // default method
    default void description() {
        System.out.println("정수의 사칙연산을 제공합니다.");
        myMethod(); // private method 호출
    }

    // static method
    static int total(int[] arr) {

        int total = 0;
        for(int num:arr) {
            total += num;
        }
        myStaticMethod(); // static method 내에서 static method 호출
        return total;
    }

    // private method - 재정의 불가, 인터페이스 내에서만 사용
    private void myMethod() {
        System.out.println("myMethod private");
    }

    // private static method - 재정의 불가, 인스턴스 생성 없이 사용가능
    private static void myStaticMethod() {
        System.out.println("myStaticMethod");
    }
}
