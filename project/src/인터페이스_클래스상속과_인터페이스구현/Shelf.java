package 인터페이스_클래스상속과_인터페이스구현;

import java.util.ArrayList;

public class Shelf {

    protected ArrayList<String> shelf;

    public Shelf() {
        shelf = new ArrayList<>(); // 생성시 멤버변수 초기화
    }

    public ArrayList<String> getShelf(){
        return shelf;
    }

    public int getCount(){
        return shelf.size();
    }

}
