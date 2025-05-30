package ch05.sec05;

import javax.swing.*;
import java.util.Scanner;

public class Mission01 {
    public static void main(String[] args) {
        /*
        주민번호를 입력하시오 (xxxxxx-xxxxxxx) >

        (만약) 주민등록번호길이가 다르면 "잘 못 입력하셨습니다."
        (길이가 맞다면 8번째자리의 값으로 "여성", "남성" 출력해주세요.
        (8번째 자리가 1~4가 아니라면) "잘 못 입력하셨습니다."

         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("주민등록번호를 입력하시오 (xxxxxx-xxxxxxx) : ");
        String ssn = scanner.next();
        char gender = ssn.charAt(7);
        int intgender = Character.getNumericValue(gender);

        if(ssn.length() != 14 || intgender > 5 ||  intgender == 0){
            System.out.print("잘못입력하셨습니다.");
        }else{
            System.out.println( intgender % 2 == 0 ? "gender: F" : "gender: M");
        }

    }
}
