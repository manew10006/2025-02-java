package ch02.sec01.method;

public class VariableUseMethodExample {
    public static void main(String[] args) {
        printTime(10,20); // 10:20
        printTime(2,9); // 02:09

        printTime(2,9,2); // 02:09:25
    }

    public static void printTime(int hour, int min){
        //System.out.printf("%02d : %02d \n", hour,min);

        System.out.println((hour > 9 ? hour : "0"+ hour) + " : " +(min > 9 ? min : "0"+min));

    }

    public static void printTime(int hour, int min, int sec){
        //System.out.printf("%02d : %02d \n", hour,min);

        System.out.println((hour > 9 ? hour : "0"+ hour) + " : " +(min > 9 ? min : "0"+min)+ " : " +(sec > 9 ? sec : "0"+ sec));

    }
}
