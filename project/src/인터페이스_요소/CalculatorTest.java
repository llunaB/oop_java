package 인터페이스_요소;

import 인터페이스.CompleteCalc;

public class CalculatorTest {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 2;

        CompleteCalc calc = new CompleteCalc();
        System.out.println(calc.add(num1, num2));
        System.out.println(calc.times(num1, num2));
        //calc.showInfo(); => Calc 였다면 불가
        calc.description(); // >>?
        calc.showInfo();

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Calc.total(arr));
    }
}
