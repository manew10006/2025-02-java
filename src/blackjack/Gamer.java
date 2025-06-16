package blackjack;

import java.util.ArrayList;
import java.util.List;

public class Gamer {
    private List<Card> cards = new ArrayList<>();  // 사용하기좋은 배열

    public void receiveCard(Card card){
        //추가로 카드를 받는다

        // 뽑은 카드를 소유한다
        cards.add(card);
    }

    public List<Card> openCards(){
        return this.cards;
    }

    public void showCards(){
        for(int i = 0; i < cards.size(); i++){
            //size()는 자동적으로 배열의 길이가 늘어나거나 줄어든다
            Card card = cards.get(i);
            System.out.println(card);
        }
    }

}
