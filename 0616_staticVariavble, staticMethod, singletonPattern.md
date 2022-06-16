# 여러 인스턴스에서 공통으로 사용하는 static 변수 

## 공통 변수가 필요한 경우

- 여러 인스턴스가 공유하는 기준값
  - 학생마다 새로운 학번
  - 회사원마다 새로운 사번



## static 언제 올라가나

- 언제 만들어지나? **처음 프로그램이 메모리에 로딩될 때 (프로세스가 될 때) 메모리를 할당**
- 프로그램이 종료되어 메모리에서 언로드될 때 종료된다.

- 코드영역(Instruction set 명령어 집합) + 데이터영역(상수, 리터럴, static 변수)
- 인스턴스 생성과 무관 => 클래스 이름으로 직접 참조

![mem](mem.png)

| 데이터 영역 | 스택메모리             | 힙메모리                                 |
| ----------- | ---------------------- | ---------------------------------------- |
| 1001        | studentA<br />studentB | studentA 인스턴스<br />studentB 인스턴스 |

```java
public class Emp {

    public static int serialNum = 1000;

    private int empId;
    private String empName;

    public Emp() {
        serialNum++;
        this.empId = serialNum;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
}
```

```java
public class EmpTest {
    public static void main(String[] args) {
        //두 개의 인스턴스가 하나의 메모리를 공유
        Emp emp = new Emp();
        emp.setEmpName("jon");
        System.out.println(emp.getEmpId()); //1001

        Emp emp2 = new Emp();
        emp.setEmpName("hong");
        System.out.println(emp2.getEmpId()); //1002

        System.out.println(Emp.serialNum); //클래스 이름으로 참조
    }
}
```



# static 메서드

## static 메서드에서는 인스턴스 변수 사용 불가

- 인스턴스 생성과 무관하게 클래스 이름으로 호출 가능
- 인스턴스 생성 전에 호출될 수 있어, static 메서드 내부에선 인스턴스 변수 사용 불가

```java
public class Emp {

    //static 변수(기준이 되는 중요한 변수!)
    private static int serialNum = 1000;
		
  	//멤버(instance) 변수
    private int empId;
    private String empName;
    private String depart;

    public Emp() {
        serialNum++;
        this.empId = serialNum;
    }

    //static 메서드 - 인스턴스 없어도 클래스.메서드로 사용가능
    public static int getSerialNum() {
        int i = 0; //static 메서드 함수의 지역변수라 사용가능
        //empName = "Lee"; //static 메서드에서 일반 멤버변수 사용불가, empName이 없을수도 있다.
        return serialNum;
    }
  
    public int getEmpId() {
        serialNum = 1000; //일반 메서드에서 static 사용 가능(이미 메모리에 있음)
        return empId;
    }
}
```



## 지역(local)변수, 멤버(instance)변수, 클래스(static)변수 

- static 변수는 메모리에 있는 동안 계속 그 영역을 차지 - 큰 배열 x
- 클래스 내부의 여러 메서드에서 사용하는 변수는 멤버 변수로 선언하는 것이 좋다
- 멤버 변수가 너무 많으면 인스턴스 생성시 쓸데없는 메모리가 할당됨

![variable](variable.png)



# static 응용 - 싱글톤 패턴(singleton pattern)

## 싱글톤 패턴?

- 프로그램에서 `인스턴스`가 `단 한 개`만 생성되어야 하는 경우 사용하는 디자인 패턴
- static 변수와 메서드를 활용하여 구현

```java
public class Company {
    
    //클래스 내부에 유일한 private 인스턴스 생성
    private static Company instance = new Company();
    
    //생성자 private으로 선언하여 제한
    private Company() {}
    
    //외부에서 유일한 instance를 참조할 수 있는 public method 제공
    public static Company getInstance() {
        if(instance == null) {
            instance = new Company();
        }
        return instance;
    }
}
```

```java
public class CompanyTest {
    public static void main(String[] args) {
//        Company company = new Company(); x
        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();

        //동일 인스턴스
        System.out.println(company1); //pkg8.Company@5a39699c
        System.out.println(company2); //pkg8.Company@5a39699c
    }
}
```

