package ch02.sec10;

public class primitiveAndStringConversionExample {
    public static void main(String[] args) {
        int value1 = Integer.parseInt("10");  // 문자열10을 정수형 10으로 바꿈
        System.out.println("value1: " + value1 + 1);

        double value2 = Double.parseDouble("3.14");
        System.out.println("value2:" + value2);

        boolean value3 = Boolean.parseBoolean("true");

        long value4 = Long.parseLong("100000");

        //String str1 = 10 + "";
        String str1 = String.valueOf(10); // 10을 문자열 10으로 변환





    }
}
