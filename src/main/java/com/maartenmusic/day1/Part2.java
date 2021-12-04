package com.maartenmusic.day1;

import java.util.List;

public class Part2 {
    public static void main(String[] args) {
        List<Integer> inputData = InputData.getData();

        int count = 0;

        for (int i = 1; i < inputData.size() - 2; i++) {

            int window = 0;
            for (int j = 0; j < 3; j++) {
                window += inputData.get(i + j);
            }

            int prevWindow = 0;
            for (int j = -1; j < 2; j++) {
                prevWindow += inputData.get(i + j);
            }

            if (window > prevWindow) {
                count++;
            }
        }

        System.out.println(count);
    }
}
