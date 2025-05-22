package ch01.sec08;
// 클래스 full  Name : ch01.sec02.Hello

/*
  클래스 선언
  Hello : 클래스명
  public 클래스명은 파일명과 동일하다.
 */

/**
 이영역은 문서화 할 수 있다 (ex pdf 같은)
 */

public class Hello {
    /*
    main 메소드 선언
    main: 메소드명
    main 메소드는 프로그램의 시작점
    */
    public static void main(String[] args) {
        // " " 쌍따옴표 사이는 문자열로표현, 문자열안에서 주석기호 적용불가
        System.out.println("Hellow, /* 주석 안됨쓰 */ Java"); //println 메소드 호출
        
    }
}
