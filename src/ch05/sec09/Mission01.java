package ch05.sec09;

public class Mission01 {
    public static void main(String[] args) {

        /*
        args 다 더한값 출력
         */
        int sum = 0;
        for(int i = 0; i<args.length ; i++) {
            int intArgs = Integer.parseInt(args[i]);
            sum += intArgs;
        }
        System.out.print(sum);

        //향상된 for문
        for(String item : args){
            int val = Integer.parseInt(item);
            sum += val;
        }





    }
}
