# reference type variable

## 참조 자료형

- 기본 자료형과 달리 클래스형으로 변수를 선언

- 기본 자료형은 사용하는 메모리 크기가 정해져 있지만 참조 자료형은 클래스에 따라 다름

- 참조 자료형을 사용할 때는 해당 변수에 대해 생성해야함(자동 초기화 x)

  단, String 클래스는 예외



## 왜 쓸까?

- 학생 클래스에 학생정보와 수강과목과 점수가 들어가야 된다고 하자. 이 때 과목(Subject) 클래스를 따로 분리해줘야 한다. 이때 Student 클래스에 과목을 넣으면 된다. 

```java
public class Student {

    int id;
    String name;

    Subject korea;
    Subject math;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;

        // 참조형 자료형은 생성해야
        korea = new Subject();
        math = new Subject();
    }
}
```

