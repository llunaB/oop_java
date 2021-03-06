# 추상 클래스 응용 - 템플릿 메서드 패턴

## 템플릿 메서드

- 추상메서드나 구현된 메스드를 활용하여 코드의 흐름을 정의하는 메서드
- `final` 로 선언하여 하위 클래스에서 재정의 할 수 없게 함
- 프레임워크에서 많이 사용되는 설계 패턴
- 추상클래스로 선언된 상위클래스에서
  - 템플릿 메서드를 활용하여 전체적인 흐름을 정의!
  - 하위 클래스에서 다르게 구현되어야 하는 부분을 추상 메서드로 선언하여 하위 클래스에서 구현!





## public final void run() {...}

```java
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
```



#

# final

- new 하지 않고 바로 가져다가 쓸 수 있다.



Define.java

```java
public class Define {

    public static final int MIN = 1;
    public static final int MAX = 99999;
    public static final String CODE = "ABCD";

}
```



UsingDefine.java

```java
public class UsingDefine {

    public static void main(String[] args) {

        System.out.println(Define.MIN);
        System.out.println(Define.MAX);
        System.out.println(Define.CODE);
    }
}
```

