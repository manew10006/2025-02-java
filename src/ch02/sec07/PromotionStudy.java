package ch02.sec07;

public class PromotionStudy {

    /*
     자동 타입 변환(promotion): (숫자형: 정수, 실수) 작은 타입이 큰 타입으로 대입될 때 발생

     byte < short, char < int < long < float < double

     (모든 타입 + String) 이 되면 모든 타입이 String으로 파싱됨.
   */

    public static void main(String[] args) {
        byte byteVal = 10;
        int intVal = byteVal;
        System.out.printf("intVal: %d\n", intVal);

        char charVal = '가';
        int intVal2 = charVal;
        System.out.printf("intVal2: %d\n", intVal2);
        System.out.printf("%c\n", 44032); // 44032 정수를 문자로 표시하라 > '가'


        int intVal3 = 50;
        float floatval = intVal3;
        System.out.printf("floatval: %f\n", floatval);

        long longVal2 = 9_223_372_036_854_775_807L;
        float floatVal = longVal2;
        System.out.printf("longVal2 (as float): %f\n", floatVal);

        float floatVal2 = 100.4f;
        double doubleVal = floatVal2;
        System.out.printf("doubleVal: %f\n", doubleVal);


    }}


