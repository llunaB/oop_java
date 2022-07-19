package practice;

public abstract class PlayerLevel {

    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMessage();

    // template method
    public final void go(int count) {
        run();
        for (int i=0; i<count; i++) {
            jump();
        }
        turn();
    }
}
