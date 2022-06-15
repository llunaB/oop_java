# 기본 자료형

# 문자열 char

## 문자도 정수로 표현

- 어떤 문자를 컴퓨터 내부에서 표현하기 위해 특정 정수 값을 정의
- A 는 65

```
A -> 인코딩 -> 65
65 -> 디코딩 -> A
```



## 자바는 UNICODE 사용

```java
char ch1 = 'A';
System.out.println(ch1); // A
System.out.println((int)ch1); // 65

int num1 = 65;
System.out.println(num1);	// 65
System.out.println((char)num1);	// A
```



# 논리형 boolean

- true, false
- 1바이트



# 지역 변수를 자료형 없이 사용 (Java 10~)

- Local variable type inference
- 추론 가능한 변수는 자료형을 선언하지 않음
- 지역 변수만 사용 가능

```java
var a = 10;
var b = 10.0;
var c = "test";
```

