package 템플릿메서드패턴;

public abstract class Car {

    // 각 하위클래스가 알아서 구현하는 부분
    public abstract void drive();
    public abstract void stop();

    // 하위클래스에 공통 적용되는 부분
    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    // 하위클래스에서 필요시 구현하면 되는 hook 메서드 - 구현부 비워둔다.
    public void autoWash() {};

    // 템플릿 메서드 - 순서를 바꾸지 못하게, 하위클래스에 구현 못하게 final 선언
    public final void run() {
        startCar();
        drive();
        stop();
        turnOff();
        autoWash();
    }
}
