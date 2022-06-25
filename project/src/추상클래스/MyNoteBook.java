package 추상클래스;

public class MyNoteBook extends NoteBook {

    // NoteBook 추상클래스에서 구현하지 않은 메서드를 구현
    @Override
    public void typing() {
        System.out.println("MyNoteBook Typing");
    }

}
