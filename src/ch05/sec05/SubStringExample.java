package ch05.sec05;

public class SubStringExample {
    public static void main(String[] args) {
        String str = "ABCDEFGHIJKLMN";
        String str2 = str.substring(8);  //8번째 이후로 잘라내서 생성
        String str3 = str.substring(5,8);  //시작index, 끝index
        String str4 = str.substring(0,2);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

    }
}
