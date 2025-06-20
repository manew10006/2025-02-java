package control.ioc;

import control.Speaker;
import control.Tv;
import control.legacy.HarmanSpeaker;

public class  LgTv implements Tv  {
    // Tv가 스피커를 선택할 권한이 없는 상황. DI 의존 주소

    private Speaker speaker;
    //LG Tv는 스피커를 사용할 수 있다.
    //스피커는 HarmanSpeaker를 사용한다.

    public LgTv(Speaker speaker){
        this.speaker = speaker;
    }

    @Override
    public void sound(){
        System.out.println("SamsungTv의 소리는요.");
        this.speaker.speakerSound();

    }
}
