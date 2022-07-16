package 인터페이스_요소;

// Calculator 는 Calc 를 구현상속
public abstract class Calculator implements Calc {

    // 메서드 중 2개만 구현하였으므로 추상 클래스로 만든다.
    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int subtract(int num1, int num2) {
        return num1 -  num2;
    }

}
