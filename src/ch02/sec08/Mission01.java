package ch02.sec08;

import java.sql.SQLOutput;

public class Mission01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 3;

        double result = (double)num1/num2;

        System.out.println("result: " + result); // 3.33333 어쩌고 나오게 처리
    }
}
