package ch06.sec08.exam03;

    /*
    접근제어자(Access Modifier)
    private - 같은 클래스안에서만 접근 가능
    default - private + 같은 패키지는 접근가능
    protected - default + 상속 관계는 접근 가능
    public - 무조건 접근 가능

    private 멤버 필드에 값 대입 방법 2가지
    - 생성자
    - setter 메소드
      : 무조건 void 타입이고 메소드명 앞에 set 을 붙인다

    private 멤버 필드에 값 읽기 방법 1가지
    - getter 메소드

     */
public class Car {
    private int gas;
    private int oil;

        public Car() {
        }

        public Car(int gas, int oil) {
        this.gas = gas;
        this.oil = oil;
    }

        public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public int getOil() {
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }

}
