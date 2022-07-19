package practice;

public class Player {

    public PlayerLevel level;

    public Player() {
        // Player 생성시 Level 지역변수 초기화
        // 추상클래스를 상속받은 BeginnerLevel 클래스로 초기화
        level = new BeginnerLevel();
        System.out.println("Player 가 생성되었습니다.");
        level.showLevelMessage();
    }

    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
        level.showLevelMessage();
    }

    public void play(int cnt) {
        System.out.println("게임을 시작합니다.");
        // go() 를 호출
        level.go(cnt);
    }
}
