package 인터페이스_인터페이스다중상속;

public class MyClassTest {

    public static void main(String[] args) {

        MyClass myClass = new MyClass();
        myClass.x();
        myClass.y();
        myClass.myMethod();

        X xClass = myClass;
        xClass.x();

        Y yClass = myClass;
        yClass.y();

    }
}
