package com.maartenmusic.day7;

import java.util.Collections;
import java.util.List;

public class Part1 {
    public static void main(String[] args) {
        List<Integer> data = InputData.getData();

        int min = Collections.min(data);
        int max = Collections.max(data);

        long minFuel = Long.MAX_VALUE;
        int minPos = 0;

        for (int i = min; i <= max; i++) {
            long fuel = 0;
            for (int crabPos : data) {
                fuel += Math.abs(crabPos - i );
            }
            if(fuel < minFuel) {
                minFuel = fuel;
                minPos = i;
            }
        }

        System.out.println(minPos);
        System.out.println(minFuel);
    }
}
