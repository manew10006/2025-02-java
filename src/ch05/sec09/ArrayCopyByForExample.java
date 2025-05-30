package ch05.sec09;

import java.util.Arrays;

public class ArrayCopyByForExample {
    public static void main(String[] args) {
        //
        int[] oldIntArray = new int[5];


        // 1, 2, 3 대입해주세요
        for (int i = 0; i < oldIntArray.length; i++){
            oldIntArray[i] = i + 1;
        }

        for (int i = 0; i < oldIntArray.length; i++){
            System.out.printf("oldIntArray[%d]: %d \n", i, oldIntArray[i]);
        }


        int[] newIntArray = new int[oldIntArray.length];

        for (int i = 0; i < oldIntArray.length; i++){
            newIntArray[i] = oldIntArray[i];
        }


        System.out.println(Arrays.toString(oldIntArray));  // 1, 2, 3
        System.out.println(Arrays.toString(newIntArray));  // 1, 2, 3


        oldIntArray[0] = 10;
        System.out.println(Arrays.toString(oldIntArray));  // 10, 2, 3
        System.out.println(Arrays.toString(newIntArray));  // 1, 2, 3



    }
}
