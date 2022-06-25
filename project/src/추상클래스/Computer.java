package 추상클래스;

// 추상메서드를 포함하는 추상클래스
public abstract class Computer {

    // 선언부만 있는 추상메서드 : 기본으로 구현할게 없고, 전적으로 하위 클래스에 책임을 위임한다.
    // 컴퓨터는 켜고 끄는건 구현할 수 있는데, display, typing 은 몰라서 구현을 못한다.
    public abstract void display();
    public abstract void typing();

    public void turnOn() {
        System.out.println("컴퓨터를 켭니다.");
    }

    public void turnOff() {
        System.out.println("컴퓨터를 끕니다.");
    }
}
