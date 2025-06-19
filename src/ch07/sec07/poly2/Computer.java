package ch07.sec07.poly2;

public class Computer extends Product {
    // Computer는 Product를 상속받는다
    // Computer의 가격은 무조건 200만원입니다.
    // Computer객체의 주소값을 println에 찍으면 "Computer"가 출력되어야한다

    public Computer(){
        super(200);
    }

    @Override
    public String toString(){
        return "Computer";
    }
}
