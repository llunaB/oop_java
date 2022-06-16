package pkg1;

//package 내에서 pubic class는 최대 1개만
public class Student {

    public int studentNumber;
    public String studentName;
    public String address;

    public void showStudentInfo() {
        System.out.println(studentNumber + "학번의 이름은" + studentName + "이고"
        + "주소는" + address);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }
}
