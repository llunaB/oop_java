package 추상클래스;

// 구현해야 하는 메서드 중 1개만 구현하고, 나머지는 구현 안하고
// NoteBook 을 추상클래스로 다시 만든다.
public abstract class NoteBook extends Computer{

    @Override
    public void display() {
        System.out.println("Notebook Display");
    }
}
