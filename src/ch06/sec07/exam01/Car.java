package ch06.sec07.exam01;

public class Car {
    String model ;
    boolean start;
    int speed;


    // 기본생성자고 쓰고싶을 때 이렇게 추가하면 된다.
    //오버로딩(Overloading) 똑같은 이름의 메소드를 여러개 만들 수 있다.
    //단, 파라미터의 타입의 순서가 다르거나, 갯수가 달라야 한다. (매개변수명은 상관없음)
   public Car() {}

   public Car(String model, boolean start, int speed){
       this.model = model;
       this.start = start;
       this.speed = speed;
   }


}
