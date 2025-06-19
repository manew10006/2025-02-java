package ch07.sec07.poly2;

//
public class Tv extends Product{
    //Tv는 Product를 상속받는다
    //Tv의 가격은 100만원입니다 (무조건)
    //Tv객체의 주소값을 println에 찍으면 "Tv"가 출력되어야 한다.


    //추상 클래스는 직접 객체 생성은 못 하지만, 필드 초기화용 생성자는 자식에게 꼭 필요하다.
    public Tv(){
        super(100);

    }

    @Override
    public String toString(){
       return "Tv";
    }


}
