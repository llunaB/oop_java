package pkg9;

public class Car {
    private static int carNum = 10000;

    private int carId;

    public Car() {
        carNum++;
        this.carId = carNum;
    }

    public int getCarNum() {
        return carId;
    }

}
