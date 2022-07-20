package practice;

public class MainBoardPlay {

    public static void main(String[] args) {

        Player player = new Player();
        player.play(1);

        // AdvancedLevel 클래스의 인스턴스 생성
        AdvancedLevel aLevel = new AdvancedLevel();
        player.upgradeLevel(aLevel);
        player.play(2);

        // SuperLevel 클래스의 인스턴스 생성
        SuperLevel sLevel = new SuperLevel();
        player.upgradeLevel(sLevel);
        player.play(3);

    }
}
