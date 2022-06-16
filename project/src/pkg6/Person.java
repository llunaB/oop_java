package pkg6;

public class Person {

    String name;
    int age;

    public Person() {
        // 여기에 적으면 컴파일에러 발생
        this("jessie", 13); // 같은 매개변수 타입 가진 생성자 호출
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getInfo() {
        System.out.println(name +","+ age);
    }
}
