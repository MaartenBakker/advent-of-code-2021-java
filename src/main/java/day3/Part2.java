package day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Part2 {
    private static List<String> zeros;
    private static List<String> ones;
    private static String oxygen = "";
    private static String scrubber = "";

    public static void main(String[] args) {
        List<String> data = InputData.getData();
        int i = 0;

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

        System.out.println(oxygen = data.get(0));

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

        System.out.println(scrubber = data.get(0));

        System.out.println(Integer.parseInt(oxygen, 2) * Integer.parseInt(scrubber, 2));
    }

}
