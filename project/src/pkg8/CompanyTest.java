package pkg8;

public class CompanyTest {
    public static void main(String[] args) {
//        Company company = new Company(); x
        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();

        //동일 인스턴스
        System.out.println(company1); //pkg8.Company@5a39699c
        System.out.println(company2); //pkg8.Company@5a39699c
    }
}
