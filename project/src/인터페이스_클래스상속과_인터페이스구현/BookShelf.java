package 인터페이스_클래스상속과_인터페이스구현;

public class BookShelf extends Shelf implements Queue{

    // extends 하기 때문에 Shelf 생성자 동작
    // interface method 를 override
    @Override
    public void enQueue(String title) {
        shelf.add(title);
    }

    @Override
    public String deQueue() {
        return shelf.remove(0);
    }

    @Override
    public int getSize() {
        return getCount();
    }
}
