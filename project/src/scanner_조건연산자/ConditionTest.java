package scanner_조건연산자;

import java.util.Scanner;

public class ConditionTest {

    public static void main(String[] args) {

        int max;

        Scanner scanner = new Scanner(System.in);
        System.out.println("입력 1:");
        int num1 = scanner.nextInt();
        System.out.println("입력 2:");
        int num2 = scanner.nextInt();

        max = (num1 > num2) ? num1 : num2;
        max = Math.max(num1, num2);
        System.out.println(max);

    }
}
