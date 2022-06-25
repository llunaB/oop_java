package 추상클래스;

public class Desktop extends Computer {

    // 구현 필수
    @Override
    public void display() {
        System.out.println("Desktop Display");
    }

    @Override
    public void typing() {
        System.out.println("Desktop Display");
    }

    // 구현 선택
    @Override
    public void turnOn() {
        super.turnOn();
    }

    @Override
    public void turnOff() {
        super.turnOff();
    }
}
