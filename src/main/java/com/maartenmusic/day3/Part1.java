package com.maartenmusic.day3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Part1 {
    private static final Map<Integer, Integer> zeros = new HashMap<>();
    private static final Map<Integer, Integer> ones = new HashMap<>();
    private static final StringBuilder gammaRate = new StringBuilder();
    private static final StringBuilder epsilonRate = new StringBuilder();

    public static void main(String[] args) {
        List<String> data = InputData.getData();
        int binSize = data.get(0).length();

        for (String s : data) {
            for (int i = 0; i < binSize; i++) {
                if (s.charAt(i) == '0') {
                    updateZeros(i);
                } else {
                    updateOnes(i);
                }
            }
        }

        for (int i = 0; i < binSize; i++) {
            gammaRate.append(zeros.get(i) > ones.get(i) ? "0" : "1");
            epsilonRate.append(zeros.get(i) > ones.get(i) ? "1" : "0");
        }

        System.out.println(Integer.parseInt(gammaRate.toString(), 2) * Integer.parseInt(epsilonRate.toString(), 2));
    }

    private static void updateZeros(int i) {
        if (zeros.putIfAbsent(i, 1) != null) {
            zeros.put(i, zeros.get(i) + 1);
        }
    }

    private static void updateOnes(int i) {
        if (ones.putIfAbsent(i, 1) != null) {
            ones.put(i, ones.get(i) + 1);
        }
    }
}
