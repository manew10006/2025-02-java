package ch03.sec02;

public class ArithemticOperatorExample {
    public static void main(String[] args) {
        int v1 = 10, v2 = 4, v3 = 5;
        long v4 = 10L;

        int result1 = v1+v2;
        System.out.println("result: "+ result1);
        System.out.println("result2: "+ (v1+v2-v4));
        System.out.println("result3: "+ (v1/v2));
        System.out.println("result4: "+ (float)v1/v2);


        int result4 = v1 % v2;
        System.out.println("result4: " + result4);
    }
}
