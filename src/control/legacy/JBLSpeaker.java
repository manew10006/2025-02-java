package control.legacy;

import control.MartenWoofer;
import control.Speaker;
import control.Woofer;

public class JBLSpeaker implements Speaker {
    //규격을 맞춘다
    private Woofer woofer;

    public JBLSpeaker(){
        this.woofer = new MartenWoofer();
    }

    @Override
    public void speakerSound() {
        System.out.println("JBLSpeaker: 소리가 찔끔");
        this.woofer.baseSound();
    }
}
