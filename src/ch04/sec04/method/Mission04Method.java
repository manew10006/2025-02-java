package ch04.sec04.method;

public class Mission04Method {
    public static void main(String[] args) {
        //gugudan(4);

        gugudan(5,9);

    }

    public static void gugudan(int danstart, int danend){
        for (int i = danstart ; i <= danend ; i++){   gugudan(i);   }
    }

    public static void gugudan(int dan){
        for (int i = 1 ; i <= 9 ; i++){    System.out.printf("%d X %d = %d\n", dan , i , dan*i);    }
}}
