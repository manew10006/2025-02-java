package ch02.sec06;

public class StringMethodExample {
    public static void main(String[] args){
        String str1 = new String("안녕");
        String str2 = new String("안녕");


        //두 문자열은 동일하다.
        //두 문자열은 동등하다.
        //두 문자열은 동등하지 않다.
        printCompareString(str1, str2);

        
    }
    public static void printCompareString(String str1, String str2){
          if (str1 == str2){
            System.out.print("두 문자열은 동일하다");
        } else if (str1.equals(str2)) {
            System.out.printf("두 문자열은 동등하다");
            
        } else {
            System.out.print("두 문자열은 동등하지 않다");
        }
    }
}
