package com.maartenmusic.day5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Part1and2 {

    public static void main(String[] args) {
        Map<Point, Integer> grid = new HashMap<>();

        List<String> input = InputData.getData();

        for (String s : input) {
            Line line = new Line(s);

            for (Point point : line.getPoints()) {
                if (grid.putIfAbsent(point, 1) != null) {
                    grid.put(point, (grid.get(point) + 1));
                }
            }
        }

        int count = 0;

        for (int i : grid.values()) {
            if (i > 1) {
                count++;
            }
        }

        System.out.println(count);
    }
}
