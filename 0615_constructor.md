# constructor

## 기본 생성자 default constructor

- 매개변수와 구현부가 없다.
- 생성자가 없을 때 자동으로 만들어진다.

```java
public class Student(){
    //default constructor
    public Student() {
    }
}
```



## 생성자 오버로딩 constructor overloading

- 클래스에 생성자를 따로 구현하면 기본 생성자는 제공되지 않는다.
- 생성자를 호출하는 client 코드에서 여러 생성자 중 필요에 따라 호출해서 사용한다.

```java
public class Student() {
  
    //멤버변수는 자동으로 초기화된다. int 는 0으로, String 은 null로
    public int stuNum;
    public String stuName;
    public int grade;
  
    //생성자 -> 인스턴스 생성시 초기화
    public Student(int stuNum, String stuName, int grade) {
        this.stuNum = stuNum;  //멤버변수 지정 = 매개변수
        this.stuName = stuName;
        this.grade = grade;
    }
}
```

