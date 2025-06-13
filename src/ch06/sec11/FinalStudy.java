package ch06.sec11;

import java.io.PrintStream;

public class FinalStudy {
    public static void main(String[] args) {
        // final을 입력하면 상수가 된다.  이때 변수명은 대문자, 스네이크기법으로 작성

        final int NUM = 10;
        //num = 20;  에러!

        final int NUM_2;
        NUM_2 = 10;
        //NUM_2 = 20; 에러!

        // 이건 스태틱이면서 final인데 대문자가 아닌 예외..ㅎ; (오래전엔이런규칙이없었기에..)
        PrintStream ps = System.out;
        double pi =  Math.PI;

        //immutable 객체 (수정할 수 없는 객체)
        FinalObject fo1 = new FinalObject(10);
        FinalObject fo2 = new FinalObject(20);

        fo1.myAge();
        fo2.myAge();
    }
}
