# Practice

## 추상 클래스와 템플릿 메서드

- 인스턴스 생성시 지역변수를 초기화
- 해당 지역변수는 추상클래스를 자료형임
- 해당 추상클래스를 extend 하는 하위 클래스들이 존재
- 하위 클래스들은 추상클래스에 정의해둔 메서드의 구현부를 각각 다르게 구현



## 인터페이스를 활용한 정책 프로그래밍

- 인터페이스 내부에 메서드를 선언
- 각 정책 클래스가 인터페이스를 implement
- 실행시 인터페이스 타입으로 지역변수 초기화하고, 해당 변수를 각 정책 클래스의 인스턴스로 만듦
- 이후 해당 변수의 메서드 실행시 구체적으로 구현한 메서드가 실행됨
