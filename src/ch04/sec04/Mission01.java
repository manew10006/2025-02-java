package ch04.sec04;

public class Mission01 {
    public static void main(String[] args) {
        //20~30까지 모두 더한 결과값을 출력해주세요.
        //fon문 사용

        /*
        int sum = 0;

        for(int i = 0 ; i <= 10; i++){
        int num = 20;
            num = num + i;
            sum = sum + num;

            System.out.println(sum);
        }

        */

        int num = 0;
        int sum = 0;
        for(int i = 20 ; i <= 30; i++){
            sum = sum + i;

            System.out.println(sum);
        }


    }
}
