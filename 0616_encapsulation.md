# encapsulation

## 정보 은닉을 위한 캡슐화

- 필요한 정보만 클라이언트에 오픈
- 대부분의 멤버변수와 메서드를 감추고(pricate), 외부에 통합된 인터페이스만 제공하여 일관된 기능을 구현
- 각각의 메서드나 멤버 변수에 접근함으로써 발생하는 오류 최소화

```java
public class MakeReport {

    StringBuffer buffer = new StringBuffer();

    private String line = "======================================\n";
    private String title = "이름\t 주소 \t\t 전화번호 \n";
  
    private void makeHeader() {
        buffer.append(line);
        buffer.append(title);
        buffer.append(line);
    }
    private void generateBody() {
        buffer.append("John \t");
        buffer.append("Seoul Korea \t");
        buffer.append("010-1234-7838\n");
    }
    private void makeFooter() {
        buffer.append(line);
    }
  
    // encapsulation : 순서유지, 정보은닉
    public String getReport() {
        makeHeader();
        generateBody();
        makeFooter();
        return buffer.toString();
    }
}

```

```java
public class MakeReportTest {
    public static void main(String[] args) {
        MakeReport builder = new MakeReport();
        String report = builder.getReport();
        System.out.println(report);
    }
}
```

