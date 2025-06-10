package ch06.sec08.exam03;

public class CarExample {
    public static void main(String[] args) {
        Car car1 = new Car();
        // car1.gas = 10;   private가 있기때문에 컴파일에러!

        car1.setGas(10);
        car1.setOil(15);

        int car1Gas = car1.getGas( );
        System.out.println("car1Gas: " + car1Gas);


        System.out.println("---------------------");



        Car car2 = new Car(30, 40); //gas = 30, oil = 40;
        System.out.println(car2.getGas());
        System.out.println(car2.getOil());


    }
}
