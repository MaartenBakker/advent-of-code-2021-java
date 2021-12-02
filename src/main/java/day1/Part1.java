package day1;

import java.util.List;

public class Part1 {
    static List<Integer> inputData = InputData.getData();

    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i < inputData.size() ; i++) {
            if(inputData.get(i) > inputData.get(i-1)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
