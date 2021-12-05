package com.maartenmusic.day3;

import java.util.ArrayList;
import java.util.List;

public class Part2 {

    public static void main(String[] args) {
        List<String> data = InputData.getData();
        int i = 0;

        List<String> zeros;
        List<String> ones;

        while(data.size() > 1) {
            zeros = new ArrayList<>();
            ones = new ArrayList<>();

            for(String s : data) {
                if (s.charAt(i) == '0') {
                    zeros.add(s);
                } else {
                    ones.add(s);
                }
            }

            if (zeros.size() > ones.size()) {
                data.removeAll(ones);
            } else {
                data.removeAll(zeros);
            }
            i++;
        }

        String oxygen = data.get(0);
        System.out.println(oxygen);

        data = InputData.getData();
        i = 0;

        while(data.size() > 1) {
            zeros = new ArrayList<>();
            ones = new ArrayList<>();

            for(String s : data) {
                if (s.charAt(i) == '0') {
                    zeros.add(s);
                } else {
                    ones.add(s);
                }
            }

            if (zeros.size() > ones.size()) {
                data.removeAll(zeros);
            } else {
                data.removeAll(ones);
            }
            i++;
        }

        String scrubber = data.get(0);
        System.out.println(data.get(0));

        System.out.println(Integer.parseInt(oxygen, 2) * Integer.parseInt(scrubber, 2));
    }

}
