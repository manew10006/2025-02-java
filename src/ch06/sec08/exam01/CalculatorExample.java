package ch06.sec08.exam01;

public class CalculatorExample {
    //여기가 전역변수 자리

    public static void main(String[] args) {
        //메인메소드 지역변수 자리

        Calculator calc = new Calculator();
        int result = calc.plus(1,2);

        System.out.println("result: " + result);
        System.out.println("result2: " + calc.plus(10,20));
        System.out.println("끝");

        System.out.println("전원을 끕니다.");

        // void 타입은 단독으로 쓴다.
        calc.powerOn();
        calc.powerOff();


    }
}
