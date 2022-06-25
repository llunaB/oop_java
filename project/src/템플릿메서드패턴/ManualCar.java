package 템플릿메서드패턴;

public class ManualCar extends Car {

    @Override
    public void drive() {
        System.out.println("수동 주행");
    }

    @Override
    public void stop() {
        System.out.println("수동 정지");
    }
}
