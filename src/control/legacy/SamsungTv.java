package control.legacy;

import control.Speaker;
import control.Tv;

public class SamsungTv implements Tv {
    private Speaker speaker;
    //삼성 Tv는 스피커를 사용할 수 있다.
    //스피커는 HarmanSpeaker를 사용한다

    public SamsungTv(){
        this.speaker = new HarmanSpeaker();
    }

    @Override
    public void sound(){
        System.out.println("SamsungTv의 소리는요.");
        this.speaker.speakerSound();
    }
}
