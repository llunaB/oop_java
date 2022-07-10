# 인터페이스 interface

## 인터페이스란?

- **모든 메서드는 추상 메서드로 선언된다. (public abstract)**
- **모든 변수는 상수로 선언된다. (public static final) 지역변수x**

```java
interface 인터페이스 이름 {
  public static final float pi = 3.14F;
  public void makeSomething();
}
```



## 인터페이스의 정의와 구현

![calc](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter3/3-11/img/calc.png)

- 인터페이스 Calc 를 정의한다. (내부에 추상 메서드가 있다.)
- 클래스A가 인터페이스를 구현(implements)한다. (일부만 구현하면 추상클래스임.)
- 클래스B가 클래스A를 상속(extends)한다.



## 특징

- 클래스B는 인터페이스를 "타입상속" 받는다.
- 클래스는 여러 개의 타입을 내포할 수 있다. 
- 클래스는 여러 개의 인터페이스를 implement 할 수 있다. 구현부가 없어서 모호함이 없기 때문이다.



## 인터페이스 구현과 형 변환

- 인터페이스를 구현한 클래스는 인터페이스 형으로 선언한 변수로 형변환 할 수 있다.

```java
// Calc : interface
Calc calc = new CompleteCalc();
```

- 클래스 상속과 달리 구현 코드가 없으므로 여러 인터페이스를 구현할 수 있다.
- 형 변환되는 경우 인터페이스에 선언된 메서드만 사용 가능하다.



![type](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter3/3-11/img/type.png)