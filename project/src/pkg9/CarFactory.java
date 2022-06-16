package pkg9;

public class CarFactory {

    //singleton
    private static CarFactory carFactory = new CarFactory();

    private CarFactory() {}

    public static CarFactory getInstance() {
        if(carFactory==null) {
            return new CarFactory();
        }
        return carFactory;
    }

    public Car createCar() {
        return new Car();
    }

}
