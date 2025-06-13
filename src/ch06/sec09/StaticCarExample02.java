package ch06.sec09;

public class StaticCarExample02 {
    public static void main(String[] args) {
        StaticCar car1 = new StaticCar("벤츠");
        car1.setSpeed(100);
        car1.run();


        StaticCar car2 = new StaticCar("포르쉐");
        car2.setSpeed(200);
        car2.run();


        // static메소드는 static이 붙으면서 객체화가 되고, 그 객체가공유된다. (고로 위의 값이 변함)
        // 메인메소드 실행 시 함께 메모리에 기록된다
        // static메소드명.메소드명()  ex) Math.random();

        car1.run();
        StaticCar.run();
    }
}
