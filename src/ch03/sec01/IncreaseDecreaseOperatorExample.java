package ch03.sec01;

public class IncreaseDecreaseOperatorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        x++;
        ++x;
        System.out.println("x = "+ x);
        System.out.println("-----------------");

        y--;
        --y;
        System.out.println("y = "+ y);

        z = x++;
        System.out.println("z = "+z); //++이 뒤에 있으면 읽고나서 연산한다
        System.out.println("x = "+x);


        z = ++x;
        System.out.println("2. z = "+z); //++이 앞에 있으면 연산 후 읽는다
        System.out.println("2. x = "+x);


        z = ++x + y++;
        System.out.println("3. z = " + z);
        System.out.println("3. x = " + x);
        System.out.println("3. y = " + y);

    }
}
