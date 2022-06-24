package 상속;

public class CustomerTest {

    public static void main(String[] args) {
        Customer customerLee = new Customer(10010, "이초콜릿");
//        customerLee.setCustomerId(10010);
//        customerLee.setCustomerName("이초콜릿");
        customerLee.bonusPoint = 1000;
        int price = customerLee.calcPrice(1000);
        System.out.println("할인된 가격은 " + price + "원 입니다.");
        System.out.println(customerLee.showCustomerInfo());


        VipCustomer customerKim = new VipCustomer(10020, "김파인애플");
//        customerKim.setCustomerId(10020);
//        customerKim.setCustomerName("김파인애플");
        customerKim.bonusPoint = 1000;
        int vipPrice = customerKim.calcPrice(1000);
        System.out.println("할인된 가격은 " + vipPrice + "원 입니다.");
        System.out.println(customerKim.showCustomerInfo());

        Customer vc = new VipCustomer(12345, "김여사");
        // 업캐스팅하면 상위 클래스 메서드(+오버라이드한 경우 하위클래스 메서드)만 사용가능
        System.out.println(vc.calcPrice(1000));


    }
}
