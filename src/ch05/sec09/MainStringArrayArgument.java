package ch05.sec09;

import java.util.Arrays;

public class MainStringArrayArgument {
    public static void main(String[] args) {
        System.out.println(args.length);
        System.out.println(Arrays.toString(args));

        for(String argsArray : args){
            System.out.println(argsArray);
        }
    }
}
