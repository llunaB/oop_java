package 인터페이스_요소;

// CompleteCalc 는 구현상속 아닌 "타입상속"
// 클래스는 여러개의 타입을 내포할 수 있다.
public class CompleteCalc extends Calculator {

    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if (num2 == 0)
            return ERROR;
        return num1 / num2;
    }

    public void showInfo() {
        System.out.println("모두 구현하였습니다.");
    }

    @Override
    public void description() {
        System.out.println("인터페이스의 defualt method 재정의");
    }
}
