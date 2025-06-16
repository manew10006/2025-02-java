package blackjack;

import java.util.List;

public class Rule {
    private final static int MAX_SCORE = 21;
    public static void getWinner(Dealer dealer, Gamer gamer){
        /* 경우의 수 6가지
         1. 둘 다 총 점수가 21점 초과 >> 비김
         2. 둘 다 총 점수가 21점 이하지만 점수가 같음 >> 비김
         3. 딜러의 총 점수가 21점 초과, 게이머의 총 점수가 21점 이하 >> 게이머 승
         4. 둘 다 총 점수가 21점 이하이지만 게이머의 총 점수가 21점에 가까움 >> 게이머 승
         5. 게이머의 총 점수가 21점 초과 딜러의 총 점수가 21점 이하 >> 딜러 승
         6. 둘 다 총 점수가 21점 이하이지만 딜러의 총 점수가 21점에 가까움 >> 딜러 승
        */
        int gamerScore = Rule.getScore(gamer.openCards());
        int dealerScore = Rule.getScore(dealer.openCards());


        if(dealerScore > MAX_SCORE  && gamerScore > MAX_SCORE || gamerScore == dealerScore){
            System.out.println("비겼습니다!");
        }else if(dealerScore <= MAX_SCORE && gamerScore <= MAX_SCORE){
            System.out.println(dealerScore > gamerScore ? "딜러 승"  :"게이머 승!");
        }else if(dealerScore <= MAX_SCORE) {
            System.out.println("딜러 승!");
        }else {
            System.out.println("게이머 승!");
        }
    }

    public static int getScore(List<Card> cards){
        int score = 0;
        for(Card card : cards) {
            int eachScore = converDenominationToScore(card.getDenomination());
            score += eachScore;
        }

        return score;
    }

    // 작업의 이름을 주기위해서 메소드로 따로 빼기도 한다
    private static int converDenominationToScore(String denomination){
        return  switch(denomination){
                case "A" -> 1;
                case "J","Q","K" -> 10;
                default -> Integer.parseInt(denomination);
            };
    }

}
