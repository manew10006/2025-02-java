package ch06.sec07.exam02;

public class KoreanExample {
    public static void main(String[] args) {
        Korean korean = new Korean("대한민국","신사임당","901022-2754312");

        System.out.println(korean.nation);
        System.out.println(korean.name);
        System.out.println(korean.ssn);

        Korean korean2 = new Korean("홍길동","901123-1543123");

        System.out.println(korean2.nation);
        System.out.println(korean2.name);
        System.out.println(korean2.ssn);
    }
}
