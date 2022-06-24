# 상속 inheritance

- 새로운 클래스를 이미 구현된 클래스를 상속받아서, 속성이나 기능을 확장하여 클래스를 구현함
- **하위 클래스는 상위클래스보다 더 구체적인 개념과 기능을 가진다. 확장의 의미.**
- 상위 클래스 - 하위 클래스
- super class - subclass
- parent class - child class



## class B extends A, A 단일상속(single inheritance)

- 자바는 `단일 상속`만 가능하다.



## protected 접근 제어자

- `상위 멤버변수`를 `하위클래스`에서 접근이 가능하려면 `private` 이 아닌 `protected` 여야 한다.



## method override, 메서드 오버라이드

- 수정이 필요한 메서드는 하위클래스에서 오버라이드 받아 사용한다.



## super(); 상위 클래스의 생성자를 호출

- 하위 클래스를 생성할 때 `상위 클래스 생성자`가 실행되고 이어서 `하위 클래스의 생성자`가 실행된다.
- 하위 클래스 생성자의 `super();` 는 상위 클래스의 생성자를 호출한다.
- 명시하지 않아도 컴파일러가 넣어준다.

```java
// 하위 클라스가 상위 클래스 인스턴스의 참조값을 가지게 된다.

public class VipCustomer extends Customer {

    private int agentID;
    double salesRatio;

    public VipCustomer() {
        super(); // 상위 클래스의 생성자 호출
        
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        price *= salesRatio;
        return price;
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo(); // 하위 클래스가 상위 클래스 인스턴스의 참조값을 가진다.
    }
}
```



## 기본생성자가 아닌 다른 생성자의 경우, 하위에서 명시적을 호출

```java
// 디폴트 생성자 없애고 매개변수가 있는 생성자 추가
public class Customer {
  ...
  public Customer(int cutomerId, String customerName) {
      this.customerId = cutomerId;
      this.customerName = cutomerName;

      customerGrade = "SILVER";
      bonusRatio = 0.01;
	}
}
```

```java
// super를 이용하여 상위 클래스의 생성자를 명시적으로 호출
public class VipCustomer extends Customer {
		...
    public VipCustomer(int customerId, String customerName) {

        super(customerId, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;

    }
}
```



## 상속에서 인스턴스 메모리의 상태

- 항상 상위 클래스의 인스턴스가 먼저 생성되고, 하위 클래스의 인스턴스가 생성된다.
  1. Customer() 생성자 호출 => Customer 클래스의 멤버 변수가 메모리에 생성됨
  2. VIPCustomer() 생성자 호출 => VIPCustomer 클래스의 멤버 변수가 메모리에 생성됨



## 형 변환(업캐스팅)

- 상위 클래스로 변수를 선언하고 하위 클래스의 생성자로 인스턴스를 생성
- 하위 클래스는 상위 클래스의 타입을 내포하고 있으므로 상위 클래스로의 묵시적 형 변환이 가능

```java
Customer vc = new VipCustomer(12345, "김여사");
// 업캐스팅하면 상위 클래스 메서드(+오버라이드한 경우 하위클래스 메서드)만 사용가능
```



## 형 변환과 메모리

- VipCustomer() 생성자에 의해 VipCustomer 클래스의 모든 멤버변수에 대한 메모리는 생성되었지만, 변수의 타입이 Customer 이므로 실제 접근가능한 변수나 메서드는 `Customer` 의 변수와 메서드이다.



## 형 변환과 오버라이딩 메서드 호출(virtual method, 가상메서드의 원리)

- vc 변수의 타입은 Customer지만 인스턴스의 타입은 VipCustomer

> 자바에서는 항상 인스턴스의 메서드가 호출된다. (가상메서드의 원리)

자바의 모든 메서드는 가상 메서드이다. 

```java
Customer vc = new VipCustomer(12345, "김여사");

System.out.println(vc.calcPrice(1000)); // 900
// 오버라이드한 하위클래스 메서드가 적용된다.
```



#

# 메서드 재정의와 가상 메서드 원리

## 메서드의 호출과 실행

- 메서드, 즉 함수의 이름 == 주소값
- 메서드는 명령어의 set이고, 프로그램이 로드되면 `메서드 영역(코드 영역)`에 명령어 set이 위치한다.
- 매당 메서드가 호출되면 명령어 set이 있는 주소를 찾아 명령어가 실행된다.
- 이 때, 메서드에서 사용하는 **(지역)변수**들은 `스택 메모리` 에 위치하게 된다.
- 따라서 **서로 다른 인스턴스**라도 같은 메서드의 코드는 같으므로 **같은 메서드가 호출된다.**

- 인스턴스가 생성되면 **(인스턴스)변수**는 `힙 메모리`에 따로 생성되지만, **메서드 명령어 set은 처음 한 번만 로드된다.**



![mem](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter3/3-05/img/mem.png)



## 가상 메서드 원리

- 가방 메서드 테이블에서 해당 메서드에 대한 address를 가지고 있음
- 재정의된 메서드는 -> 재정의된 메서드의 주소를 가리킴
- 재정의 안된 메서드는 -> (상위 클래스) 메서드의 주소를 가리킴



![calcprice](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter3/3-05/img/calcprice.png)
