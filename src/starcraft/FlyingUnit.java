package starcraft;

//공중유닛
public abstract class FlyingUnit extends Unit{

    // 추상메소드는 강제성이 있다 하위클래스에서 반드시 오버라이딩을 해야한다.
    @Override
    public void move(int x, int y) {
        System.out.println("공중으로 이동한다");
        super.move(x,y);

    }



}
