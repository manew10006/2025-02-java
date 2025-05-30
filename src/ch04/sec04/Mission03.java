package ch04.sec04;

public class Mission03 {
    public static void main(String[] args) {
        int star = (int)(Math.random()*6.0)+3;
        System.out.print(star);

        /* 6이 나왔다면
        ******
        ******
        ******
        ******
        ******
        ******
        ******
         */


            System.out.println();

        for(int i = 0; i < star; i++) {
            for(int K = 0; K < star; K++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
