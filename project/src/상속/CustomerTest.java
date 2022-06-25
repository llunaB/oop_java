package 상속;

import java.util.ArrayList;

public class CustomerTest {

    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<>();

        Customer customerLee = new Customer(10010, "이초콜릿");
        GoldCustomer customerChoi = new GoldCustomer(1030, "최인국");
        VipCustomer customerKim = new VipCustomer(10020, "김파인애플");

        customers.add(customerLee);
        customers.add(customerChoi);
        customers.add(customerKim);

        for(Customer customer:customers) {
            System.out.println(customer.showCustomerInfo());
        }

        int price = 10000;

        for(Customer customer:customers) {
            System.out.println(customer.getCustomerName() + "님이 " + customer.calcPrice(price) + "원을 지불하셨습니다.");
            System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는 " + customer.bonusPoint + "원 입니다.");
        }
    }
}
