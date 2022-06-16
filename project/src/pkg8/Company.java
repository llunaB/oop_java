package pkg8;

public class Company {

    //클래스 내부에 유일한 private 인스턴스 생성
    private static Company instance = new Company();

    //생성자 private으로 선언하여 제한
    private Company() {}

    //외부에서 유일한 instance를 참조할 수 있는 public method 제공
    public static Company getInstance() {
        if(instance == null) {
            instance = new Company();
        }
        return instance;
    }
}
