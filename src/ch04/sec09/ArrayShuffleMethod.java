package ch04.sec09;

import java.util.Arrays;

public class ArrayShuffleMethod {
    public static void main(String[] args) {
        int[] arr = makeArrayFromTo(5,8); // [5,6,7]
        int[] arr2 = makeArrayFromTo(15,20); // [15,16,17,18,19] 끝 자리가 안나오게
        int[] arr3 = makeArrayFromTo(20,15); // [15,16,17,18,19] 끝 자리가 안나오게

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        shuffleArray(arr);
        shuffleArray(arr2);  //배열이 섞여있으면된다

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

    }

    public static void shuffleArray(int[] arr){

        for(int i = 0; i < arr.length; i++){
        int randomNum = (int)(Math.random()*arr.length);
            int temp = arr[i];
            arr[i] = arr[randomNum];
            arr[randomNum] = temp;
        }

    }


    public static int[] makeArrayFromTo(int from , int to){

        int minFrom = Math.min(from,to);
        int maxTo = Math.max(from,to);
        int[] arr = new int[Math.abs(maxTo-minFrom)];

        for(int i = 0; i < arr.length ; i++){
            arr[i] = minFrom++;
        }
        return arr;
    }


}
