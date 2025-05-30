package ch04.sec09;

import java.util.Arrays;

public class ArrayShuffleExample {
    public static void main(String[] args) {
        int[] arr = new int[10];


        for(int i = 0; i < arr.length; i++){
            arr[i] = i+1;
        }

        System.out.println(Arrays.toString(arr));


        /*
         0~9랜덤값 구한다.
        예를 들어 7이 나왔다면 0번방과 7번방을 스와핑한다
        8이 나왔다면 1번방과 스와핑한다.
        ...
        이 과정을 9번 반복한다

         */


        for(int i = 0; i < arr.length; i++){
        int randomNum = (int)(Math.random()*10.0);
        int temp = 0;
            temp = arr[i];
            arr[i] = arr[randomNum];
            arr[randomNum] = temp;
        }

        System.out.println(Arrays.toString(arr));

    }
}
