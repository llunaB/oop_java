package 인터페이스_다중구현;

public interface Sell {

    void sell();

    // defaut method
    default void order() {
        System.out.println("default : sell order");
    }
}
