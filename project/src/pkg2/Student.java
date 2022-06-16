package pkg2;

public class Student {

    // 멤버변수는 자동으로 초기화된다. int 는 0으로, String 은 null로
    public int stuNum;
    public String stuName;
    public int grade;

    // default constructor
    public Student() {
    }

    // 생성자 -> 인스턴스 생성시 초기화
    public Student(int stuNum, String stuName, int grade) {
        this.stuNum = stuNum;  // 멤버변수 지정 = 매개변수
        this.stuName = stuName;
        this.grade = grade;
    }

    public String stuInfo() {

        int i; // 지역변수는 자동으로 초기화되지 않는다. i 출력시 컴파일 에러 발생.

        return stuName + "학생의 학번은" + stuNum + "이고" + grade + "학년입니다.";
    }
}
