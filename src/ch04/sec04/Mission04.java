package ch04.sec04;

public class Mission04 {
    public static void main(String[] args) {
        int dan = (int)(Math.random() * 11.0)+2;

        //구구단출력

        for(int i = 1 ; i <= 9 ; i++){
                System.out.printf("%d X %d = %d \n", dan,i,i*dan);
        }
    }
}
