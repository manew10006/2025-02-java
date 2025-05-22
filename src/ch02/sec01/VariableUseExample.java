package ch02.sec01;

public class VariableUseExample {
    public static void main(String[] args) {
        int hour = 3;
        int min = 5;

        // hour, min 변수를 활요하여 아래처럼 출력해주세요.

        // 3시간 5분
        // 총 185분

        System.out.println(hour+"시간 "+min+"분 \n총 "+ (hour*60+min)+"분");
    }
}
