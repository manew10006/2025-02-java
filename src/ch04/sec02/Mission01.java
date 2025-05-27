package ch04.sec02;

import java.util.Scanner;

public class Mission01 {
    public static void main(String[] args) {
        /*
        커맨드(터미널)창으로 값을 입력받을것

        점수를 입력해주세요> 점수입력 후 엔터
        점수가 60점 이상이면 > "합격입니다!" 출력
        이하면 > "불합격입니다." 출력

         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력해주세요 : ");
         int grade = scanner.nextInt();
        //String str = scanner.next();
        //int score = Integer.parseInt(str);

        System.out.println(grade >= 60 ? "합격입니다!" : "불합격입니다.");



    }
}
