# JDK, JRE, Maven, Gradle, Jar, War

### JDK, JRE

![JRE와 JDK](https://blog.kakaocdn.net/dn/r2DDK/btruQk9O856/OYjuIRTtKY1hOdTMYw2e7k/img.png)

- JDK : Java Development Kit  - 프로그램을 실행하는 자바 플랫폼 구성 요소
- JRE : Java Runtime Environment - 프로그램 코드 실행을 위한 도구 패키지



즉, JRE보다 JDK가 더 넓은 개념이며 JDK에는 JRE가 필요하다.

JDK에는 자바 컴파일러가 포함되어 있다. 



### 자바 컴파일러

자바 컴파일러는 원시 텍스트 `.java` 파일을 가져와 실행가능한` .class`파일로 렌더링한다.



### 구성요소

> 

> /bin 디렉토리 주요 소프트웨어

- javac : 자바 컴파일러로 자바 소스를 바이트 코드로 변환

```
"C:\Program Files\Java\jdk-10.0.1\bin\javac.exe" Intro.java
```

- java : 자바 프로그램 실행기 → 자바 가상 기계를 작동시켜 자바 프로그램 실행
- javadoc : 자바 소스로부터 HTML 형식의 API 도큐먼트 생성
- jar : 자바 클래스 파일을 압축한 자바 아카이브 파일(.jar) 생성, 관리

```
C:\Users\mtyson\Documents>"c:\Program Files\Java\jdk-10.0.1\bin\jar.exe" --create --file intro.jar Intro.class
```

![JDK, JRE 내부구성](https://blog.kakaocdn.net/dn/dYZ5zo/btruAiSxZGI/u1gxIOHNtkVV9KtNVl3knk/img.png)



### JDK를 시작하기

- Java 버전을 선택한다. (Java8)
- Java 패키지를 선택한다. (Java EE) EE는 HTTP요청 처리를 지원하는 Java Sublet이 포함되어 있다.



### 변경방식

```
.java => JDK로 컴파일 => .class => jar => .jar
```





### Jar

.jar 파일이란? 패키지화된 java 클래스 세트. 
