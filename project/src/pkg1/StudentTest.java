package pkg1;

public class StudentTest {
    public static void main(String[] args) {
        Student st = new Student();
        st.studentNumber = 123;
        st.setStudentName("jisoo");
        st.showStudentInfo();
        System.out.println(st);

        Student st2 = new Student();
        st2.studentNumber = 456;
        st2.studentName = "minji";
        st2.showStudentInfo();
        System.out.println(st2);

    }
}
