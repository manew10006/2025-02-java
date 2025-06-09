package ch02.sec08;

public class CastingMethodExample {
    public static void main(String[] args) {
        double r1 = division(10,3);

        System.out.print("r1: " + r1);
        System.out.print("r2: "+division(100,32));

    }

    public static double division(int a , int b){
        return (double)a/b;
    }
}
