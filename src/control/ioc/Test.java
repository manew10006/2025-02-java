package control.ioc;

import control.Tv;

public class Test {
    public static void main(String[] args) {

        TvFactory tvFactory = TvFactory.getInstance();

        // TvFactory tvFactory1 = new TvFactory(); // 쓰기가 안되도록 막아야함
        Tv tv = tvFactory.factory(args[2], args[3]);
        tv.sound();
        
        //이 방법이 Spring 의 핵심이다

    }
    }
