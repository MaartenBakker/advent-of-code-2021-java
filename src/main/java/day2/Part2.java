package day2;

import java.util.List;

public class Part2 {
    public static void main(String[] args) {
        List<String> data = InputData.getData();

        SubmarinePosition2 position = new SubmarinePosition2(0,0, 0);

        for (String s: data) {
            position = position.move(new SubmarineCommand(s));
        }

        System.out.println(position);
        System.out.println(position.multiplyPosByDepth());
    }
}
