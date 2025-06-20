package control.ioc;

import control.MartenWoofer;
import control.Speaker;
import control.Woofer;

public class JBLSpeaker implements Speaker {
    //규격을 맞춘다
    private Woofer woofer;

    public JBLSpeaker(Woofer woofer){

        this.woofer = woofer;
    }

    @Override
    public void speakerSound() {
        System.out.println("JBLSpeaker: 소리가 찔끔");
        this.woofer.baseSound();
    }
}
