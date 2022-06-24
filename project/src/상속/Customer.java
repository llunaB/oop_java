package 상속;

// 할인 없음, 보너스 포인트 1% 적립
public class Customer {

    // 하위클래스에서 접근 가능하도록 private -> protected
    protected int customerId;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    // 생성자 - 모든 고객이 동일한 경우
//    public Customer() {
//        customerGrade = "SILVER";
//        bonusRatio = 0.01;
//    }


    public Customer(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
        customerGrade = "SILVER";
        bonusRatio = 0.01;
        System.out.println("Customer 생성자");

    }

    // 물건 구매시 보너스 포인트 적립
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }

    // 고객정보 반환
    public String showCustomerInfo() {
        return customerName + "님의 등급은 "
                + customerGrade + "이며, 보너스 포인트는 "
                + bonusPoint + "입니다.";
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }
}
