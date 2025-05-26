package ch02.sec12;

public class PrintfExample {
    public static void main(String[] args) {
        int value = 12300;
        System.out.printf("상품의 가격:%d원 \n", value);
        // %d = 정수형만 불러옴 (byte, short, int, long)

        System.out.printf("상품의 가격:%,d원 \n", value); //콘솔에 출력이 목적
        String result = String.format("상품의 가격: %,d원 \n", value); // 문자열을 만드는게 목적
        // 통화단위 표현


        System.out.printf("상품의 가격:%9d원 \n", value); // 숫자 앞 칸 띄우기
        System.out.printf("상품의 가격:%-9d원 \n", value); // 숫자 뒷 칸 띄우기
        System.out.printf("상품의 가격:%09d원 \n", value); // 자리 칸 만큼 0 채우기


        int year = 2025;
        int mon = 9;
        int day = 4;
        // 2025-09-04
        System.out.printf("%d-%02d-%02d",year,mon,day); // 숫자0은 대략 2칸정도 차지함

        int radius = 10;
        double area = 3.14159 * radius * radius ; // 반지름 10의 원의 넓이
        System.out.printf("반지름이 %d인 원의 넓이: %10.2f입니다. \n",radius,area);
        System.out.printf("반지름이 %d인 원의 넓이: %010.2f입니다. \n",radius,area);
        System.out.printf("반지름이 %d인 원의 넓이: %-10.2f입니다. \n",radius,area); //  .1f 은 소수점의 자리수

        String name = "홍길동";
        String job = "도적";
        System.out.printf("%6d | %-10s | %10s \n", 1, name , job);




    }
}
