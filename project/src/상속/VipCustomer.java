package 상속;

// 할인 10%, 보너스 포인트 5% 적립, 담당 전문 상담원 배정
public class VipCustomer extends Customer {

    private int agentID;
    double salesRatio;

//    public VipCustomer() {
//        super();
//
//        customerGrade = "VIP";
//        bonusRatio = 0.05;
//        salesRatio = 0.1;
//    }

    public VipCustomer(int customerId, String customerName) {

        super(customerId, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
        System.out.println("VIP Customer 생성자");

    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        price -= (int)(price * salesRatio);
        return price;
    }

    public int getAgentID() {
        return agentID;
    }
}
