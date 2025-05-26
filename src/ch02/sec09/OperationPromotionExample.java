package ch02.sec09;

public class OperationPromotionExample {
    public static void main(String[] args) {
        byte result1 = 10+20;
        System.out.println("result1: " + result1);

        byte v1 = 10, v2 = 20;
        int result2 = v1 + v2; // 자동형변환
        System.out.println("result2: " + result2); // int타입

        byte v3 = 10;
        int v4 = 100;
        long v5 = 1000L;
        long result3 = v3 + v4 + v5;
        System.out.println("result2: " + result2); // long타입
        // v3 (byte) + v4(int)
        // v3 (int) + v4(int) >> 자동형변환 후 계산 : 110(int)
        // 110(int) + v5(long)
        // 110(long) + v5(long) >> 자동형변환 후 계산 : 1110(long)

        char v6 = 'A';
        char v7 = 1;
        int result4 = v6 + v7;
        System.out.println("result4: " + result4);
        System.out.println("result4: " + (char)result4);

        int v8 = 10;
        int result5 = v8 / 4;
        System.out.println("result5: " + result5); // int는 실수타입을 가질 수 없다

        int v9 = 10;
        double result6 = v9 / 4.0;
        System.out.println("result6: " + result6);


        int v10 = 1;
        int v11 = 2;
        double result7 = v10/v11;
        System.out.println("result7: " + result7);




    }
}
