package 추상클래스;

public class ComputerTest {
    public static void main(String[] args) {
        Desktop desktop = new Desktop();
//        NoteBook noteBook = new NoteBook();
        MyNoteBook myNoteBook = new MyNoteBook();

        desktop.display();
        desktop.typing();

        myNoteBook.display();
        myNoteBook.typing();

//        Computer computer = new Computer() {}; 추상클래스는 인스턴스로 만들 수 없다.
    }
}
