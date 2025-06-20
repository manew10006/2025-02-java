package control.ioc;

import control.*;

public class TvFactory {
    //싱글톤으로 만들기

    //스태틱메소드에서 객체의 멤버필드에 접근할 수 없다, 스태틱만 접근가능
    private static TvFactory tvFactory = null;

    private TvFactory (){  }

    public static TvFactory getInstance(){
        if(tvFactory == null){
            tvFactory = new TvFactory();
        }

        return tvFactory;
    }

    public Tv factory(String speakerName , String wooferName){
        // 삼성 tv 객체화하려면 스피커의 주소값 필요
        // 스피커가 객체화 하려면 우퍼의 주소값 필요

        Woofer woofer = switch (wooferName){
            case "marten" -> new MartenWoofer();
            case "genelect" -> new GenelectWoofer();
            default -> null;
        };

        Speaker speaker = switch (speakerName){
            case "jbl" -> new JBLSpeaker(woofer);
            case "harman" -> new HarmanSpeaker(woofer);
            default -> null;
        };

        return new LgTv(speaker);
    }
}
