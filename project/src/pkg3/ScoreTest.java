package pkg3;

public class ScoreTest {
    public static void main(String[] args) {

        Student kim = new Student(1, "kim");
        kim.setKorSubject("국어", 80);
        kim.setMathSubject("수학", 90);

        Student lee = new Student(2, "lee");
        lee.setKorSubject("국어", 100);
        lee.setMathSubject("수학", 80);

        System.out.println(kim.scoreSum());
        System.out.println(lee.scoreSum());

    }
}
