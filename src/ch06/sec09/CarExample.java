package ch06.sec09;

public class CarExample {
    public static void main(String[] args) {
        //포르쉐, 벤츠 차 2대 객체 생성

        Car car1 = new Car("포르쉐");
        Car car2 = new Car("벤츠");

        car1.run();
        car2.run();

    }
}
