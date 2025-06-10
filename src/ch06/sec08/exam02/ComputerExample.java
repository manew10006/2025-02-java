package ch06.sec08.exam02;

public class ComputerExample {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        int result = computer1.sum(1, 2, 3);
        System.out.println(result);
        int result2 = computer1.sum(1, 2, 3, 4);
        System.out.println(result2);
        int result3 = computer1.sum(1, 2, 3, 4, 5);
        System.out.println(result3);

        int result4 = computer1.sum(new int[] {1, 2, 3, 4, 5});
        System.out.println(result4);

    }

}
