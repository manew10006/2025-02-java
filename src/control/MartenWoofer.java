package control;

public class MartenWoofer implements Woofer {

    //임플리먼츠화
    @Override
    public void baseSound() {
        System.out.println("마틴 Woofer : 웅-웅-웅~");
    }
}
