package control;

public class GenelectWoofer implements Woofer{

    @Override
    public void baseSound() {
        System.out.println("제네렉 Woofer : 웅!!웅!!웅!!");
    }
}
