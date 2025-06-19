package ch07.sec07.poly;

public class BullDog extends Dog{

    @Override
    public void crying(){
        System.out.println("월! 월! 🔥");
    }

    @Override
    public void jump(){
        System.out.print("불독이 ");
        super.jump();
    };

}
