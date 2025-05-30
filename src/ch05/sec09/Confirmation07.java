package ch05.sec09;

public class Confirmation07 {
    public static void main(String[] args) {
        int[] array = {1,5,3,8,2};

        //for문을 활용하여 max값을 찾아 출력하시오.
        
        // max 초기값을 0으로하면 모든배열값이 음수일때 0만 나오는 문제가 생기니, 첫번째 배열값을 넣어준다
        int max = array[0];
        for (int newArray : array){
            if(max < newArray) {
                max = newArray;
            }
        }
        System.out.print(max);
    }
}
