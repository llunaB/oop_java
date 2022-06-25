package 템플릿메서드패턴;

public class AICar extends Car {

    @Override
    public void drive() {
        System.out.println("자동주행");
    }

    @Override
    public void stop() {
        System.out.println("자동정지");
    }

    @Override
    public void autoWash() {
        System.out.println("자동세차");
    }
}
