package ArrTest;

public class BookTest {
    public static void main(String[] args) {
        Book[] lib = new Book[5]; //null로 초기화
        Book[] copyLib = new Book[5]; //null로 초기화
        Book[] deepCopyLib = new Book[5]; //null로 초기화

        for(int i=0; i<lib.length; i++) {
            System.out.println(lib[i]);
        }

        lib[0] = new Book("토지1", "김");
        lib[1] = new Book("토지2", "김");
        lib[2] = new Book("토지3", "김");
        lib[3] = new Book("토지4", "김");
        lib[4] = new Book("토지5", "김");

        //얕은 복사 - 주소 동일 : 한 배열 정보 바꾸면 다른 배열도 바뀜
        System.arraycopy(lib, 0, copyLib, 0, 5);

        //깊은 복사
        deepCopyLib[0] = new Book();
        deepCopyLib[1] = new Book();
        deepCopyLib[2] = new Book();
        deepCopyLib[3] = new Book();
        deepCopyLib[4] = new Book();

        for(int i=0; i<lib.length; i++) {
            deepCopyLib[i].setTitle(lib[i].getTitle());
            deepCopyLib[i].setAuthor(lib[i].getAuthor());
        }

        //수정
        lib[0].setTitle("제목수정");
        lib[0].setAuthor("작가수정");

        System.out.println("================");

        for(Book book:lib) {
            book.showInfo();
        }

        System.out.println("================");

        for(Book cbook:copyLib) {
            cbook.showInfo();
        }

        System.out.println("================");

        for(Book dcbook:deepCopyLib) {
            dcbook.showInfo();
        }
    }
}
