# OOP

## 객체의 속성은 클래스의 member variable

## 객체의 역할은 클래스의 method

- 객체의 기능을 구현하기 위해 클래스 내부에 구현되는 함수



## class

- 클래스는 대문자로 시작
- `.java` 파일 하나에 클래스는 여러 개 있을 수 있지만 `public` 클래스는 하나이다.
- `public` 클래스와 `.java` 파일의 이름은 동일하다.



## function call & stack memory

- `main()` 함수가 사용하는 공간이 스택에 생성됨
- 함수가 호출되면 위의 스택 위에 추가로  **`스택` 메모리**가 생김
- 함수의 `지역 변수`가 사용함(멤버변수, 파라미터 등)
- 함수가 끝나면 해당 메모리는 **자동으로 반환**



## instance & heap memory

- 생성된 인스턴스는 `동적 메모리(heap memory)`에 할당됨
- Java에서는 `가비지 콜렉터`가 주기적으로 사용하지 않는 메모리를 수거함
- 하나의 클래스로 여러 인스턴스가 생성되며, 각각 다른 `메모리 주소`를 가짐

```java
Student studentA = new Student(); // package01.Student@2ed94a8b
Student studentB = new Student();	// package01.Student@38082d64
```

| Stack                                              | Heap                                                         |
| -------------------------------------------------- | ------------------------------------------------------------ |
| studentA => 지역변수, 참조변수(reference variable) | **2ed94a8b** => heap에 자리잡은 가상주소값(참조값 reference value) |
| studentB                                           | **38082d64**                                                 |

- 참조 변수 : 메모리에 생성된 인스턴스를 가리키는 변수
- 참조 값 : 생성된 인스턴스의 메모리 주소값