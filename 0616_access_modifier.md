# access modifier and information hiding

접근 제어 지시자와 정보은닉



## 접근 제어 지시자 access modifier

- 클래스 외부에서 클래스의 멤버 변수, 메서드, 생성자를 사용할 수 있는지 여부를 지정하는 키워드
- `private` : 같은 클래스 내부에서만 접근 가능 (외부 클래스, 상속 관계 클래스 접근불가)
- `default` : 같은 패키지 내부에서만 접근 가능 (상속 관계라도 패키지 다르면 접근불가)
- `protected` : 같은 패키지나 상속관계 클래스에서만 접근가능
- `public` : 클래스 외부 어디서나 접근가능



## 정보를 은닉하거나 보호해야 하는 경우

- `private` 로 제어한 멤버 변수를 `public` 메서드로 제어한다.

```java
public class Birthday {
    private int day;
    private int month;
    private int year;

    private boolean isValid; //default = false, set은 없다.
		
		//생략
    //set 메서드에서 데이터 제어
    public void setMonth(int month) {
        if(month < 1 || month > 12) {
            isValid = false;
        }
        else {
            isValid = true;
            this.month = month;
        }
    }

    public void showDate() {
        if(isValid) {
            System.out.println(year+"년"+month+"월"+day+"일");
        }
        else {
            System.out.println("invalid");
        }
    }
}

```

```java
public class BirthdayTest {
    public static void main(String[] args) {
        Birthday birthday = new Birthday();
        birthday.setDay(5);
        birthday.setMonth(11);
        birthday.setYear(1993);
        birthday.showDate();
    }
}
```

