package ch06.sec08.exam04;

import java.awt.*;

public class CalculatorExample {
    public static void main(String[] args) {
        // 한 변의 길이가 40인 정사각형의 넓이를 구하시오
        Calculator areaRec = new Calculator();
        System.out.println("정사각넓이: " + areaRec.areaRectangle(40));
        
        // 직사각 넓이
        System.out.println("직사각넓이: " + areaRec.areaRectangle(40,50));


    }
}
