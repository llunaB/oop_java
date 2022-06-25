# 추상클래스 abstract class

## 추상클래스란?

- 메서드의 선언만 있는 추상 메서드(abstract method)를 포함하는 클래스
- abstact 예약어를 사용
- 추상 클래스는 new 할 수 없음 (인스턴스화 할 수 없음)



## 왜 쓸까?

- 추상 클래스는 곧 상속을 위한 클래스!
- 구현하지 않고 전적으로 하위 클래스에 메서드 구현에 대한 책임을 위임한다.

```java
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

```



## 재정의 해야만 하는 추상메서드, 선택인 일반 메서드

- Desktop.class

```java
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

```





## 덜 구현하면?

- NoteBook.java (추상클래스)

```java
// 구현해야 하는 메서드 중 1개만 구현하고, 나머지는 구현 안하고
// NoteBook 을 추상클래스로 다시 만든다.
public abstract class NoteBook extends Computer{

    @Override
    public void display() {
        System.out.println("Notebook Display");
    }
}

```

- MyNoteBook.java (일반클래스)

```java
public class MyNoteBook extends NoteBook {

    // NoteBook 추상클래스에서 구현하지 않은 메서드를 구현
    @Override
    public void typing() {
        System.out.println("MyNoteBook Typing");
    }

}
```



## 메서드를 다 구현했는데도 추상클래스로 선언하는 경우?

- 상속만을 위해 쓰는 클래스
- Instance 화가 필요 없는 경우
- Desktop.java (추상클래스)

```java
public abstract class Desktop extends Computer {

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
```



