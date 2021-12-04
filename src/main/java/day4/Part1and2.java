package day4;

import java.util.ArrayList;
import java.util.List;

public class Part1and2 {
    public static void main(String[] args) {
        List<BingoCard> cards = new ArrayList<>();

        InputData.getCards().forEach(i -> cards.add(new BingoCard(i)));

        InputData.getNumbers().forEach(n -> cards.forEach(bingoCard -> bingoCard.markNumber(n)));
    }
}
