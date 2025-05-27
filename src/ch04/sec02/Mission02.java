package ch04.sec02;

import java.util.Scanner;

public class Mission02 {
    public static void main(String[] args) {
        /*
        (점수를 입력받는다.)
        점수를 입력해 주세요 > 99 (점수 입력 후 엔터)

        (100초과 혹은 0미만이면) " 잘못된 점수입니다"
        (90점이상) "A"
        (80점이상) "B"
        (70점이상) "C"
        (나머지) "D"
        출력되도록 해주세요

         */

        while(true) {
            System.out.print("점수를 입력해 주세요 : ");
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();

            try {
                int grade = Integer.parseInt(str);
                if (grade < 0 || grade > 100) {
                    System.out.println("잘못된 점수입니다");
                } else if (grade >= 90) {
                    System.out.println("A학점");   break;
                } else if (grade >= 80) {
                    System.out.println("B학점");  break;
                } else if (grade >= 70) {
                    System.out.println("C학점");  break;
                } else {
                    System.out.println("D학점");  break;
                }

            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력해주세요");
            }
        }

        }   }
