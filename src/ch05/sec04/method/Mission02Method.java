package ch05.sec04.method;

import java.util.Arrays;

public class Mission02Method {
    public static void main(String[] args) {
        printNumberFromTo(2, 6); // [2,3,4,5,6]
        printNumberFromTo(12, 16); // [12,13,14,15,16]

    }


    public static void printNumberFromTo(int from, int to) {
        System.out.println(Arrays.toString(printNumberFromTo2(from, to)));
    }
    public static int[] printNumberFromTo2(int from, int to){
        int start = Math.min(from, to);
        int end = Math.max(from, to);

        int[] arr = new int[end-start+1];

        for(int i = 0; i < arr.length; i++){
             arr[i] = start+i;
        }
        return arr;
    }
}
