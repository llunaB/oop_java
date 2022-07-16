package 인터페이스_다중구현;

public interface Buy {

    void buy();

    // default method
    default void order() {
        System.out.println("default : buy order");
    }
}
