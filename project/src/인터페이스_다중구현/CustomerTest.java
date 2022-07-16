package 인터페이스_다중구현;

public class CustomerTest {

    public static void main(String[] args) {

        Customer customer = new Customer();

        customer.buy();
        customer.sell();
        customer.sayHello();
        customer.order();

        Buy buyer = customer; // 형변환
        buyer.buy();

        Sell seller = customer; // 형변환
        seller.sell();
    }
}
