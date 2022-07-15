# 인터페이스 요소

왜...안되지? 



## 상수

- 보든 변수는 상수로 변환된다. public static final



## 추상메서드

- 모든 선언된 메서드는 추상 메서드이다. public abstract



## 디폴트 메서드(Java 8~)

- 구현을 가지는 메서드, 인터페이스를 구현하는 클래스들에서 공통으로 사용할 수 있는 기본 메서드
- default 키워드 사용

```java
default void description() {
        System.out.println("정수 계산기를 구현합니다.");
        myMethod();
}

```

- 구현하는 클래스에서 재정의 할 수 있음

```java
@Override
public void description() {
        System.out.println("CompleteCalc에서 재정의한 default 메서드");
        //super.description();
}

```

- 인터페이스를 구현한 클래스의 인스턴스가 생성되어야 사용 가능함



## 정적(static) 메서드(Java 8~)

- 인스턴스 생성과 관계없이 인터페이스 타입으로 사용할 수 있는 메서드

```java
static int total(int[] arr) {
        int total = 0;

        for(int i: arr) {
          total += i;
        }
        mystaticMethod();
        return total;
}

```



## private 메서드(Java 9~)

- 인터페이스를 구현한 클래스에서 사용하거나 재정의할 수 없음

- 인터페이스 내부에서만 사용하기 위해 구현하는 메서드
- default 메서드나 static 메서드에서 사용함

```java
private void myMethod() {
				System.out.println("private method");
}
	
private static void mystaticMethod() {
				System.out.println("private static method");
}

```

