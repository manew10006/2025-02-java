package ch07.sec07.poly2;

public class Poly2Example {
    public static void main(String[] args) {

        // buyer 객체화
        Buyer buyer = new Buyer();

        //Tv tv = new Tv();
        //tv를 한대만 뽑고 그 한대를 공유한 셈 객체지향적 사고로는
        //각각의 객체주소가 생겨야하는게 맞다


        buyer.buy(new Tv());
        buyer.buy(new Tv());
        buyer.buy(new Tv());
        buyer.buy(new Tv());
        buyer.buy(new Tv());
        buyer.buy(new Computer());
        buyer.buy(new Computer());
        buyer.buy(new Computer());
        buyer.buy(new Computer());
        buyer.buy(new Tv());
        buyer.buy(new Tv());
        buyer.buy(new Tv());

        System.out.println("잔액:" + buyer.getMoney());
        System.out.println("보너스:" + buyer.getBonusPoint());


    }
}
