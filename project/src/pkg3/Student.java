package pkg3;

public class Student {

    int id;
    String name;

    Subject korea;
    Subject math;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;

        // 참조형 자료형은 생성해야
        korea = new Subject();
        math = new Subject();
    }

    public void setKorSubject(String name, int score) {
        korea.name = name;
        korea.score = score;
    }

    public void setMathSubject(String name, int score) {
        math.name = name;
        math.score = score;
    }

    public int scoreSum() {
        int scoreSum = korea.score + math.score;
        return scoreSum;
    }
}
