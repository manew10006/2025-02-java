package ch05.sec05;

public class IndexOfContainsExample {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍 나이쓰 프로그래밍 ";
        int idx = subject.indexOf("프로그래밍");  // 앞 프로그래밍 기준으로
        System.out.println("idx: " + idx);


        System.out.println(subject.indexOf("그"));
        System.out.println(subject.lastIndexOf("그")); // 우측(뒤쪽)에서 우선으로 문자열을 찾는다

        // 해당 문자열에 내가 찾는 문자열이 있는가??

        boolean result = subject.contains("나이쓰");
        System.out.println("result: " + result);
    }
}
