package ch05.sec04.method;

import ch02.sec11.ScoreMethodExample;

public class Mission03Method {
    public static void main(String[] args) {
        int star = ScoreMethodExample.getRandomValue(3,7);
        System.out.println("star: "+star);


        // 5였다면 *****(개행) 출력
        printSingleLine(star);
        printSingleLine(10);
        printSingleLine(20);

        System.out.println();

        /* 5였다면
        *****
        *****
        *****
        *****
        *****
        */
        printMultiLine(6);

        System.out.println();

        printTriangleLine(10);


    }

    public static void printTriangleLine(int cnt){

        for(int i = 1; i <= cnt ; i++) {
             printSingleLine(i);
            }
        }

    public static void printMultiLine(int num){
        for(int i = 0; i<num ; i++){
        printSingleLine(num);}
    }

    public static void printSingleLine(int num){

        for(int i = 0; i < num ; i++) {
            System.out.print("*");
        }
        System.out.println();

    }
}
