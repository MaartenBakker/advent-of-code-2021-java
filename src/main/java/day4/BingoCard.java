package day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BingoCard {
    private final List<List<BingoNumber>> grid = new ArrayList<>();
    private boolean bingo;

    public BingoCard(String input) {
        String[] rows = input.split("\n");
        for (String row : rows) {
            row = row.trim();
            addRow(row);
        }
    }

    public void markNumber(int number) {
        if (!bingo) {
            for (List<BingoNumber> row : grid) {
                for (BingoNumber bingoNumber : row) {
                    if (bingoNumber.getNumber() == number) {
                        bingoNumber.setMarked();
                    }
                }
            }
            if (checkForBingo()) {
                bingo(number);
            }
        }
    }

    private boolean checkForBingo() {
        for(List<BingoNumber> row : grid) {
            if (row.stream().allMatch(BingoNumber::isMarked)) {
                return true;
            }
        }

        for (int i = 0; i < grid.get(0).size(); i++) {
            int finalI = i;
            if (grid.stream().allMatch(row -> row.get(finalI).isMarked())) {
                return true;
            }
        }

        return false;
    }

    private void bingo(int number) {
        this.bingo = true;
        System.out.println("BINGO!!!!");
        long sum = 0;
        for (List<BingoNumber> row : grid) {
            for (BingoNumber bingoNumber : row) {
                if (!bingoNumber.isMarked()) {
                    sum += bingoNumber.getNumber();
                }
            }
        }
        System.out.println("Result= " + sum * number);
//        uncomment for Part 1 result
//        System.exit(0);
    }

    private void addRow(String stringRow) {
        List<BingoNumber> row = new ArrayList<>();
        Arrays.stream(stringRow.split("\\s+"))
                .map(String::trim)
                .map(Integer::parseInt)
                .map(BingoNumber::new)
                .forEach(row::add);
        grid.add(row);
    }

    @Override
    public String toString() {
        for(List<BingoNumber> row : grid) {
            for (BingoNumber number : row) {
                System.out.print(number);
            }
            System.out.println();
        }

        return "";
    }
}
