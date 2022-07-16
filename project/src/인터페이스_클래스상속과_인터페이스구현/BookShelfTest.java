package 인터페이스_클래스상속과_인터페이스구현;

public class BookShelfTest {

    public static void main(String[] args) {

        // Shelf 클래스를 상속 받고(자료구조) Queue를 구현(메서드)
        // Queue 타입
        Queue bookQueue = new BookShelf();

        // Queue 인터페이스에 정의된 메서드를 구현
        bookQueue.enQueue("book1");
        bookQueue.enQueue("book2");
        bookQueue.enQueue("book3");

        System.out.println(bookQueue.getSize());

        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
    }
}
