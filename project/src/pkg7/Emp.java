package pkg7;

public class Emp {

    //static 변수
    private static int serialNum = 1000;

    private int empId;
    private String empName;
    private String depart;

    public Emp() {
        serialNum++;
        this.empId = serialNum;
    }

    //static 메서드 - 인스턴스 없어도 클래스.메서드로 사용가능
    public static int getSerialNum() {
        int i = 0; //static 메서드 함수의 지역변수라 사용가능
        //empName = "Lee"; //static 메서드에서 일반 멤버변수 사용불가, empName이 없을수도 있다.
        return serialNum;
    }

    public int getEmpId() {
        serialNum = 1000; //일반 메서드에서 static 사용 가능(이미 메모리에 있음)
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }
}
