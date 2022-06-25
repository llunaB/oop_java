package 상속;

// 할인 10%, 포인트 2% 적립
public class GoldCustomer extends Customer {

    double salesRatio;

    public GoldCustomer(int customerId, String customerName) {
        super(customerId, customerName);
        customerGrade = "Gold";
        bonusRatio = 0.02;
        salesRatio = 0.1;
        System.out.println("Gold Customer 생성자");
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        price -= (int)(price * salesRatio);
        return price;
    }
}

