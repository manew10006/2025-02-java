package blackjack;

public class BlackJack {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        //cd.printAllCards();


//        Object obj = cd;
//        obj = 1;
//
//        System.out.println(cd);
//        System.out.println(cd.toString());
//
//        String str = "안녕";
//        System.out.println(str);
//        System.out.println(str.toString());


        Card c = cd.getCard();
        System.out.println(c);
        System.out.println(cd.getCard());

        System.out.println("--------------------");
        cd.printAllCards();

        System.out.println("--------------게이머 카드------------");
        Gamer gamer = new Gamer();
        gamer.receiveCard(c);
        gamer.receiveCard(cd.getCard());
        gamer.receiveCard(cd.getCard());
        gamer.showCards();

        // A:1, 2~10: 각 숫자 점수, JQK: 각10점
        int score = Rule.getScore(gamer.openCards());
        System.out.println("score: " + score);

        System.out.println("--------------딜러 카드-------------");
        Dealer dealer = new Dealer();
        dealer.receiveCard(cd.getCard());
        dealer.receiveCard(cd.getCard());
        dealer.showCards();

        System.out.println("needMoreCard : " + dealer.needMoreCard());


        if(dealer.needMoreCard()){
            dealer.receiveCard(cd.getCard());
        }
        dealer.showCards();

        int score2 = Rule.getScore(dealer.openCards());
        System.out.println("score: " + score2);

        Rule.getWinner(dealer,gamer);



    }
}
