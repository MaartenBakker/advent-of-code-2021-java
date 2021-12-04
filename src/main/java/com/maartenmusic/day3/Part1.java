package com.maartenmusic.day3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Part1 {
    private static Map<Integer, Integer> zeros = new HashMap<>();
    private static Map<Integer, Integer> ones = new HashMap<>();
    private static String gammaRate = "";
    private static String epsilonRate = "";

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

            for (int i = 0; i < binSize; i++) {
                if (zeros.get(i) > ones.get(i)) {
                    gammaRate += "0";
                    epsilonRate += "1";
                } else {
                    gammaRate += "1";
                    epsilonRate += "0";
                }
            }
        }

        System.out.println(Integer.parseInt(gammaRate, 2) * Integer.parseInt(epsilonRate, 2));
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
