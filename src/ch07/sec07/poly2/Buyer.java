package ch07.sec07.poly2;

public class Buyer {
    //V 캡슐화
    //V 본인이 가지고 있는 소유금액을 저장할 수 있다 (money)
    //V 소유금액은 만원단위이며 일천만원을 기본적으로 가지고 있다.
    //V 제품 구매 시 보너스 점수를 저장할 수 있다. ( bonusPoint );
    //컴퓨터, Tv를 구매할 수 있다. buy 메소드
    //구매 시 제품 가격 만큼 소유금액은 차감된다.
    //구매 시 구매한제품 이름이 출력된다.
    //e.g. "Tv을/를 구입하셨습니다."
    //e.g. "Computer을/를 구입하셨습니다."
    //구매 시 구매 포인트가 적립된다
    //구매 시 소유금액이 부족하면 "잔액이 부족합니다." 내용이 출력되면서 구매하지 않는다.

    private int money= 1_000;
    private int bonusPoint = 0;



    public void buy(Product product){
        if(product.getPrice() > this.money){
            System.out.println("잔액이 부족합니다.");
            return;
        }
        this.money -= product.getPrice();
        this.bonusPoint += product.getBonusPoint();

        System.out.println(product + "을/를 구입하셨습니다.");
    }

    public int getMoney(){
        return money;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }
}
