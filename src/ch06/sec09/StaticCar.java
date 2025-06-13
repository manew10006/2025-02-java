package ch06.sec09;

public class StaticCar {
    public static String model;
    public static int speed;
    
    
    // static은 객체생성과 관련이없으므로 생성자에 붙이지않는다
    public StaticCar(String m) {
        model = m;
    }

    // speed 멤버필드 setter 메소드
    public static void setSpeed(int s){
        speed = s;
    }

    public static void run( ){
        System.out.printf("%s가 달립니다. 시속 %dkm/h\n", model,speed);
    }

}
