package blackjack;

public class Card {
    /*
 무늬 pattern - Spade , Heart, Clover , Diamond
 값 denomination - A,2,3,4,5...9,10,J,Q,K
  */

    private String pattern;
    private String denomination;

    public Card(String pattern, String denomination) {
        this.pattern = pattern;
        this.denomination = denomination;
    }

    //getter 만든다

    public String getPattern() {
        return this.pattern;
    }

    public String getDenomination() {
        return this.denomination;
    }

    @Override
    public String toString() {
        return String.format("%s(%s)\n", this.pattern, this.denomination);
    }


}
