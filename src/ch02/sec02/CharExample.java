package ch02.sec02;

public class CharExample {
    public static void main(String[] args) {
        char ch1 = 'A';

        System.out.printf("ch1: %c, %d\n", ch1, (int)ch1);
        System.out.printf("66: %c, %d\n", 66, 66);

        // 아스키코드 (각 문자열에 대응되는 숫자가 있다) : 하지만 각나라마다 할당되는 숫자가 다른데, 글자깨짐이 발생
        // 유니코드 - 전세계 모든 문자가 들어간 것  : 위의 문제점을 보완


        System.out.printf("가: %c, %d\n", 44032, 44032);
        System.out.printf("핣: %c, %d\n", '핣', (int)'핣');

        String str = "Hello";
        char[] strArr = str.toCharArray();
        System.out.println(strArr.length);
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        
        
        String str2 = ""; // 공백을 안써도 빈방이 생성된다
        char ch4 = ' ';  // char는 공백을 써야한다.


    }
}
