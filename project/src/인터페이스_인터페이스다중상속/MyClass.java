package 인터페이스_인터페이스다중상속;

public class MyClass implements MyInterface{

    // 3개 메서드를 모두 구현해야만 함

    @Override
    public void myMethod() {
        System.out.println("myMethod()");
    }

    @Override
    public void x() {
        System.out.println("x()");
    }

    @Override
    public void y() {
        System.out.println("y()");
    }
}
