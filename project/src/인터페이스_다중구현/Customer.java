package 인터페이스_다중구현;

public class Customer implements Buy, Sell{

    // default method 중복 -> 둘 중 하나를 재정의 해야
    @Override
    public void order() {
//        Buy.super.order(); // buy 것을 재정의
        System.out.println("order 재정의");
    }
    @Override
    public void buy() {
        System.out.println("customer buy");
    }

    @Override
    public void sell() {
        System.out.println("customer sell");

    }

    public void sayHello() {
        System.out.println("Hello, I am Customer.");
    }
}
