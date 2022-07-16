package 인터페이스_요소;

public class CalculatorTest {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 2;

        CompleteCalc completeCalc = new CompleteCalc();
        System.out.println(completeCalc.add(num1, num2));
        System.out.println(completeCalc.divide(num1, num2));
        completeCalc.showInfo();
        completeCalc.description();

        // 인스턴스 생성과 관계없는 static method
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Calc.total(arr));
    }
}
