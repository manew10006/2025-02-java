package ch05.sec09;

public class Confirmation08 {
    public static void main(String[] args) {
        int[][] arr = {
                {95,86},
                {83,92,96},
                {78,83,93,87,88}  };

        // 중첩for문 사용, 전체 합

        int sum = 0;
        int cnt = 0;

        for(int i = 0; i < arr.length ; i++){
                cnt += arr[i].length;
            for(int k = 0; k< arr[i].length ; k++){
                sum += arr[i][k];

            }
        }


        System.out.println(cnt);

        System.out.println("sum: " + sum);
        System.out.print("abg: " + (sum/cnt));



    }
}
