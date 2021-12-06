package com.maartenmusic.day6;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Part1 {
    private static final Map<Integer, Long> school = new HashMap<>();

    public static void main(String[] args) {
        for (int i = 0; i <= 8; i++) {
            school.put(i, 0L);
        }

        List<Integer> data = InputData.getData();

        for (int i : data) {
            school.put(i, school.get(i)+1L);
        }

        for (int i = 0; i < 80; i++) {
            long temp = school.get(0);
            school.put(0, school.get(1));
            school.put(1, school.get(2));
            school.put(2, school.get(3));
            school.put(3, school.get(4));
            school.put(4, school.get(5));
            school.put(5, school.get(6));
            school.put(6, school.get(7) + temp);
            school.put(7, school.get(8));
            school.put(8, temp);
        }

        System.out.println(school.values().stream().reduce(Long::sum));
    }
}