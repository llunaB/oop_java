package ArrayListTest;

import ArrTest.Book;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList();
        library.add(new Book("제목1", "작가1"));
        library.add(new Book("제목2", "작가2"));
        library.add(new Book("제목3", "작가3"));

        for(int i=0; i<library.size(); i++) {
            library.get(i).showInfo();
        }

    }
}
