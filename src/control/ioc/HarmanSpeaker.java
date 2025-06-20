package control.ioc;

import control.GenelectWoofer;
import control.Speaker;
import control.Woofer;

public class HarmanSpeaker implements Speaker {
    private Woofer woofer;

    // 문제 : HarmanSpeaker가 객체화 된다면 GenelectWoofer를 사용할 수 있도록 해주세요
    public HarmanSpeaker(Woofer woofer){
     this.woofer = woofer;
    }



    @Override
    public void speakerSound() {
        System.out.println("하만스피커 : 소리가 맑아요");
        woofer.baseSound();;
    }
}
