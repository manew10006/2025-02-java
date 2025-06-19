package starcraft;

public abstract class Unit {
    
    //상속관계시 접근가능
    protected int x;  // 좌표 x
    protected int y;  // 좌표 y

    // 이동
    // 내용적는건 의미가 없지만 메소드가 있음을 알고싶다!!
    public void move(int x, int y){
        this.x = x;
        this.y = y;
    }



    public void stop() {
        System.out.println("현재 위치에 정지한다.");
    }

}
