package ch06.sec07.exam01;

import ch06.sec07.exam02.Korean;

public class CarExample {
    public static void main(String[] args) {


        Car car = new Car("소나타", true, 4);

        System.out.println("모델명 : " + car.model);
        System.out.println("시동여부 : " + car.start);
        System.out.println("현재속도 : " + car.speed);


        Car car2 = new Car();


    }
}
