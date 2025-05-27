package ch03;

public class Confirmation03 {
    public static void main(String[] args) {
        int pencils = 534;
        int students = 30;

        //학생 한 명이 가지는 연필 수
        int pencilsPerStudent = pencils / students;
        System.out.println(pencilsPerStudent);

        int pencilsLeft = pencils % students;
        System.out.println(pencilsLeft);

        
        // 산술연산자를 이용한 300나오게만들기
        int value = 356;
        System.out.println(value/100*100);
        System.out.println(value - value % 100);  // - + 보다 */가 리소스를 더 많이 잡아먹는다, 특히 나누기..
    }
}
