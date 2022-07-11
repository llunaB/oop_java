# 인터페이스 interface

## 인터페이스가 하는 일 

- 클래스나 프로그램이 제공하는 기능을 명시적으로 선언, 명세 (specification)
- 클라이언트 프로그램은 인터페이스에 선언된 메서드 명세만 보고 이를 구현한 클래스를 사용할 수 있다.



## 예시: JDBC 인터페이스

- Connection 자바 객체 (인터페이스)
- Connection 은 누가 구현하나? Oracle, MySQL 등 third part가 구현해서 jar file을 제공한다.
- 쓰는 쪽에서는 인터페이스를 구현한 모듈을 사용하기만 하면 된다.
