# 인터페이스의 여러 가지 요소



## 상수

- 보든 변수는 상수로 변환된다. public static final



## 추상메서드

- 모든 선언된 메서드는 추상 메서드이다. public abstract



## default 메서드(Java 8~)

- 한 개의 인터페이스에 그걸 구현하는 클래스가 10개인데 기능이 동일하다면? 중복이 발생한다!

- 구현을 가지는 메서드, 인터페이스를 구현하는 클래스들에서 공통으로 사용할 수 있는 기본 메서드로 재정의도 가능하다.
- default 키워드 사용

```java
default void description() {
        System.out.println("정수 계산기를 구현합니다.");
        myMethod();
}

```

```java
@Override
public void description() {
        System.out.println("CompleteCalc에서 재정의한 default 메서드");
        //super.description();
}

```

- 인터페이스를 구현한 클래스의 인스턴스가 생성되어야 사용 가능함



## 정적(static) 메서드(Java 8~)

- 인스턴스 생성과 관계없이 `interface` 타입으로 직접 호출해서 사용할 수 있는 메서드

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

- 인터페이스를 구현한 클래스에서 사용하거나 **재정의할 수 없음**

- 인터페이스 내부에서만 사용하기 위해 구현하는 메서드
- 인터페이스 내부에서 default 메서드나 static 메서드를 구현할 때 사용함

```java
private void myMethod() {
				System.out.println("private method");
}
	
private static void mystaticMethod() {
				System.out.println("private static method");
}

```



### calc

```java
package 인터페이스_요소;

public interface Calc {

    double PI = 3.14;
    int ERROR = -99999999;

    int add(int num1, int num2);
    int subtract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    // default method
    default void description() {
        System.out.println("정수의 사칙연산을 제공합니다.");
        myMethod(); // private method 호출
    }

    // static method
    static int total(int[] arr) {

        int total = 0;
        for(int num:arr) {
            total += num;
        }
        myStaticMethod(); // static method 내에서 static method 호출
        return total;
    }

    // private method - 재정의 불가, 인터페이스 내에서만 사용
    private void myMethod() {
        System.out.println("myMethod private");
    }

    // private static method - 재정의 불가, 인스턴스 생성 없이 사용가능
    private static void myStaticMethod() {
        System.out.println("myStaticMethod");
    }
}

```

