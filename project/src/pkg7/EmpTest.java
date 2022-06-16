package pkg7;

public class EmpTest {
    public static void main(String[] args) {
        //두 개의 인스턴스가 하나의 메모리를 공유
        Emp emp = new Emp();
        emp.setEmpName("jon");
        System.out.println(emp.getEmpId()); //1001

        Emp emp2 = new Emp();
        emp.setEmpName("hong");
        System.out.println(emp2.getEmpId()); //1002

        System.out.println(Emp.getSerialNum()); //클래스 이름으로 참조
    }
}
