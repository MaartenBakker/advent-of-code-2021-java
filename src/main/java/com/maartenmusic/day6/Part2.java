package com.maartenmusic.day6;

import java.util.List;

public class Part2 {

    public static void main(String[] args) {
        List<Integer> data = InputData.getData();

        long[] school = new long[10];

        for (int i : data) {
                school[i] = school[i]+1L;
        }

        for (int i = 0; i < 256; i++) {
            school[9] = school[0];
            school[0] = school[1];
            school[1] = school[2];
            school[2] = school[3];
            school[3] = school[4];
            school[4] = school[5];
            school[5] = school[6];
            school[6] = school[7] + school[9];
            school[7] = school[8];
            school[8] = school[9];
        }

        long total = 0L;

        for (int i = 0; i < school.length-1; i++) {
            total += school[i];
        }

        System.out.println(total);
    }
}
