package day2;

import java.util.Arrays;
import java.util.List;

public class InputData {
    private static final String data = "forward 6\n" +
            "forward 9\n" +
            "down 9\n" +
            "down 7\n" +
            "forward 8\n" +
            "down 4\n" +
            "forward 7\n" +
            "forward 3\n" +
            "up 5\n" +
            "down 7\n" +
            "down 3\n" +
            "down 2\n" +
            "down 1\n" +
            "down 2\n" +
            "down 1\n" +
            "forward 5\n" +
            "down 9\n" +
            "up 7\n" +
            "forward 6\n" +
            "forward 3\n" +
            "down 2\n" +
            "forward 2\n" +
            "down 4\n" +
            "down 3\n" +
            "forward 9\n" +
            "up 4\n" +
            "down 7\n" +
            "forward 5\n" +
            "down 4\n" +
            "down 4\n" +
            "forward 8\n" +
            "up 6\n" +
            "forward 4\n" +
            "forward 6\n" +
            "down 8\n" +
            "forward 6\n" +
            "up 9\n" +
            "down 6\n" +
            "down 8\n" +
            "forward 7\n" +
            "down 8\n" +
            "up 1\n" +
            "forward 5\n" +
            "up 8\n" +
            "forward 9\n" +
            "down 7\n" +
            "down 9\n" +
            "up 3\n" +
            "forward 9\n" +
            "forward 7\n" +
            "down 1\n" +
            "down 5\n" +
            "forward 6\n" +
            "up 3\n" +
            "down 2\n" +
            "forward 8\n" +
            "forward 5\n" +
            "forward 9\n" +
            "down 5\n" +
            "down 5\n" +
            "forward 7\n" +
            "forward 9\n" +
            "forward 8\n" +
            "forward 9\n" +
            "up 4\n" +
            "up 8\n" +
            "forward 2\n" +
            "up 6\n" +
            "forward 2\n" +
            "down 8\n" +
            "forward 4\n" +
            "forward 6\n" +
            "down 1\n" +
            "forward 3\n" +
            "down 7\n" +
            "down 8\n" +
            "forward 9\n" +
            "forward 5\n" +
            "down 8\n" +
            "forward 1\n" +
            "forward 8\n" +
            "down 8\n" +
            "up 1\n" +
            "down 9\n" +
            "forward 6\n" +
            "down 1\n" +
            "down 8\n" +
            "up 6\n" +
            "up 8\n" +
            "down 7\n" +
            "forward 8\n" +
            "down 3\n" +
            "forward 2\n" +
            "up 2\n" +
            "forward 1\n" +
            "forward 7\n" +
            "down 5\n" +
            "down 7\n" +
            "forward 5\n" +
            "down 7\n" +
            "forward 5\n" +
            "forward 4\n" +
            "up 8\n" +
            "down 5\n" +
            "forward 8\n" +
            "forward 6\n" +
            "up 4\n" +
            "up 1\n" +
            "down 1\n" +
            "down 8\n" +
            "down 1\n" +
            "up 1\n" +
            "down 4\n" +
            "down 4\n" +
            "up 3\n" +
            "down 6\n" +
            "forward 7\n" +
            "up 8\n" +
            "up 1\n" +
            "forward 7\n" +
            "forward 6\n" +
            "down 9\n" +
            "forward 3\n" +
            "down 9\n" +
            "down 5\n" +
            "forward 5\n" +
            "forward 1\n" +
            "forward 5\n" +
            "down 4\n" +
            "forward 4\n" +
            "up 5\n" +
            "down 8\n" +
            "down 2\n" +
            "forward 2\n" +
            "down 8\n" +
            "up 4\n" +
            "down 3\n" +
            "forward 6\n" +
            "up 7\n" +
            "forward 2\n" +
            "up 5\n" +
            "up 9\n" +
            "forward 6\n" +
            "down 1\n" +
            "down 1\n" +
            "up 4\n" +
            "down 7\n" +
            "up 2\n" +
            "forward 1\n" +
            "down 5\n" +
            "down 4\n" +
            "down 5\n" +
            "forward 4\n" +
            "down 3\n" +
            "up 8\n" +
            "forward 7\n" +
            "down 2\n" +
            "up 6\n" +
            "forward 4\n" +
            "forward 8\n" +
            "forward 8\n" +
            "up 7\n" +
            "down 2\n" +
            "down 7\n" +
            "down 9\n" +
            "forward 8\n" +
            "down 9\n" +
            "down 5\n" +
            "forward 8\n" +
            "forward 6\n" +
            "up 4\n" +
            "up 7\n" +
            "down 7\n" +
            "forward 1\n" +
            "up 2\n" +
            "forward 1\n" +
            "down 6\n" +
            "down 1\n" +
            "forward 9\n" +
            "forward 8\n" +
            "up 4\n" +
            "forward 9\n" +
            "up 7\n" +
            "forward 8\n" +
            "forward 1\n" +
            "down 6\n" +
            "up 3\n" +
            "forward 2\n" +
            "down 6\n" +
            "up 3\n" +
            "up 5\n" +
            "forward 6\n" +
            "up 5\n" +
            "down 9\n" +
            "forward 4\n" +
            "up 5\n" +
            "down 3\n" +
            "forward 5\n" +
            "forward 2\n" +
            "up 6\n" +
            "up 1\n" +
            "up 4\n" +
            "forward 9\n" +
            "down 5\n" +
            "up 2\n" +
            "forward 9\n" +
            "up 5\n" +
            "down 6\n" +
            "up 9\n" +
            "down 6\n" +
            "down 7\n" +
            "forward 6\n" +
            "forward 3\n" +
            "down 2\n" +
            "forward 3\n" +
            "down 1\n" +
            "down 9\n" +
            "down 2\n" +
            "down 2\n" +
            "forward 8\n" +
            "up 9\n" +
            "forward 4\n" +
            "forward 6\n" +
            "forward 5\n" +
            "forward 9\n" +
            "forward 4\n" +
            "up 6\n" +
            "down 8\n" +
            "down 8\n" +
            "down 3\n" +
            "forward 1\n" +
            "forward 7\n" +
            "up 3\n" +
            "forward 2\n" +
            "down 9\n" +
            "up 7\n" +
            "forward 5\n" +
            "down 1\n" +
            "forward 9\n" +
            "up 8\n" +
            "forward 7\n" +
            "forward 1\n" +
            "down 7\n" +
            "forward 8\n" +
            "down 7\n" +
            "down 6\n" +
            "forward 5\n" +
            "forward 7\n" +
            "up 9\n" +
            "up 4\n" +
            "forward 2\n" +
            "down 1\n" +
            "forward 3\n" +
            "down 5\n" +
            "forward 2\n" +
            "forward 2\n" +
            "forward 6\n" +
            "up 1\n" +
            "up 9\n" +
            "down 1\n" +
            "down 7\n" +
            "up 6\n" +
            "down 6\n" +
            "down 7\n" +
            "forward 3\n" +
            "forward 7\n" +
            "forward 9\n" +
            "forward 9\n" +
            "down 6\n" +
            "down 8\n" +
            "forward 9\n" +
            "up 5\n" +
            "forward 5\n" +
            "down 6\n" +
            "down 4\n" +
            "forward 1\n" +
            "up 9\n" +
            "forward 6\n" +
            "up 4\n" +
            "up 7\n" +
            "forward 5\n" +
            "down 7\n" +
            "down 6\n" +
            "forward 2\n" +
            "down 4\n" +
            "forward 2\n" +
            "down 1\n" +
            "forward 8\n" +
            "down 3\n" +
            "down 8\n" +
            "down 7\n" +
            "down 6\n" +
            "forward 3\n" +
            "forward 1\n" +
            "down 8\n" +
            "up 4\n" +
            "down 8\n" +
            "forward 7\n" +
            "down 2\n" +
            "forward 3\n" +
            "forward 2\n" +
            "forward 4\n" +
            "forward 2\n" +
            "forward 8\n" +
            "forward 2\n" +
            "up 1\n" +
            "down 6\n" +
            "down 9\n" +
            "down 3\n" +
            "forward 8\n" +
            "down 3\n" +
            "forward 8\n" +
            "forward 3\n" +
            "forward 5\n" +
            "down 6\n" +
            "forward 6\n" +
            "forward 2\n" +
            "down 7\n" +
            "forward 8\n" +
            "down 1\n" +
            "forward 7\n" +
            "forward 6\n" +
            "up 9\n" +
            "forward 2\n" +
            "up 4\n" +
            "up 6\n" +
            "forward 4\n" +
            "forward 5\n" +
            "forward 6\n" +
            "forward 7\n" +
            "down 4\n" +
            "forward 9\n" +
            "forward 1\n" +
            "down 8\n" +
            "down 5\n" +
            "down 9\n" +
            "up 5\n" +
            "forward 9\n" +
            "forward 6\n" +
            "forward 7\n" +
            "down 5\n" +
            "forward 9\n" +
            "down 4\n" +
            "down 8\n" +
            "forward 9\n" +
            "down 5\n" +
            "down 5\n" +
            "down 6\n" +
            "forward 8\n" +
            "forward 9\n" +
            "down 5\n" +
            "down 7\n" +
            "forward 8\n" +
            "forward 5\n" +
            "forward 9\n" +
            "up 4\n" +
            "down 3\n" +
            "down 3\n" +
            "forward 5\n" +
            "down 7\n" +
            "down 3\n" +
            "up 7\n" +
            "forward 6\n" +
            "up 7\n" +
            "down 9\n" +
            "forward 6\n" +
            "forward 8\n" +
            "up 8\n" +
            "down 9\n" +
            "down 6\n" +
            "up 3\n" +
            "forward 6\n" +
            "up 3\n" +
            "down 4\n" +
            "down 6\n" +
            "forward 5\n" +
            "down 5\n" +
            "forward 1\n" +
            "down 5\n" +
            "forward 2\n" +
            "up 3\n" +
            "up 9\n" +
            "down 9\n" +
            "up 1\n" +
            "down 3\n" +
            "down 4\n" +
            "forward 5\n" +
            "up 4\n" +
            "down 2\n" +
            "forward 1\n" +
            "forward 7\n" +
            "up 9\n" +
            "up 9\n" +
            "down 2\n" +
            "down 8\n" +
            "forward 5\n" +
            "down 4\n" +
            "up 2\n" +
            "forward 9\n" +
            "down 3\n" +
            "up 6\n" +
            "down 3\n" +
            "forward 1\n" +
            "down 7\n" +
            "down 7\n" +
            "down 7\n" +
            "forward 1\n" +
            "forward 6\n" +
            "down 5\n" +
            "up 7\n" +
            "forward 2\n" +
            "up 6\n" +
            "down 5\n" +
            "up 3\n" +
            "down 5\n" +
            "up 1\n" +
            "down 9\n" +
            "up 2\n" +
            "down 7\n" +
            "up 5\n" +
            "down 6\n" +
            "up 1\n" +
            "forward 5\n" +
            "down 2\n" +
            "down 1\n" +
            "up 2\n" +
            "forward 5\n" +
            "forward 8\n" +
            "up 7\n" +
            "up 5\n" +
            "forward 9\n" +
            "forward 9\n" +
            "forward 5\n" +
            "forward 8\n" +
            "down 4\n" +
            "forward 8\n" +
            "down 1\n" +
            "up 3\n" +
            "down 1\n" +
            "down 9\n" +
            "up 5\n" +
            "down 7\n" +
            "down 8\n" +
            "down 4\n" +
            "down 3\n" +
            "forward 6\n" +
            "down 5\n" +
            "down 7\n" +
            "forward 6\n" +
            "down 3\n" +
            "down 1\n" +
            "down 5\n" +
            "forward 4\n" +
            "up 8\n" +
            "down 6\n" +
            "forward 1\n" +
            "forward 1\n" +
            "down 4\n" +
            "down 8\n" +
            "forward 9\n" +
            "forward 3\n" +
            "forward 6\n" +
            "down 5\n" +
            "down 7\n" +
            "down 4\n" +
            "up 1\n" +
            "forward 2\n" +
            "forward 4\n" +
            "forward 8\n" +
            "up 2\n" +
            "up 9\n" +
            "up 3\n" +
            "down 8\n" +
            "forward 4\n" +
            "down 7\n" +
            "forward 7\n" +
            "down 5\n" +
            "up 3\n" +
            "up 6\n" +
            "down 5\n" +
            "forward 2\n" +
            "down 8\n" +
            "up 1\n" +
            "down 4\n" +
            "down 4\n" +
            "forward 1\n" +
            "down 6\n" +
            "down 1\n" +
            "up 2\n" +
            "forward 2\n" +
            "down 8\n" +
            "down 7\n" +
            "forward 5\n" +
            "forward 2\n" +
            "up 4\n" +
            "forward 6\n" +
            "down 4\n" +
            "down 6\n" +
            "down 2\n" +
            "up 5\n" +
            "down 5\n" +
            "forward 7\n" +
            "forward 2\n" +
            "down 2\n" +
            "down 7\n" +
            "forward 1\n" +
            "forward 1\n" +
            "forward 4\n" +
            "down 3\n" +
            "forward 3\n" +
            "up 4\n" +
            "up 6\n" +
            "down 3\n" +
            "forward 4\n" +
            "down 5\n" +
            "down 6\n" +
            "down 1\n" +
            "forward 3\n" +
            "up 3\n" +
            "down 5\n" +
            "down 5\n" +
            "down 5\n" +
            "forward 5\n" +
            "forward 5\n" +
            "forward 2\n" +
            "up 3\n" +
            "down 6\n" +
            "down 6\n" +
            "down 2\n" +
            "down 5\n" +
            "forward 3\n" +
            "forward 9\n" +
            "down 9\n" +
            "forward 6\n" +
            "up 4\n" +
            "down 8\n" +
            "up 7\n" +
            "forward 1\n" +
            "forward 4\n" +
            "forward 9\n" +
            "down 6\n" +
            "up 1\n" +
            "up 1\n" +
            "up 4\n" +
            "up 6\n" +
            "forward 7\n" +
            "down 5\n" +
            "forward 8\n" +
            "forward 7\n" +
            "up 1\n" +
            "up 6\n" +
            "down 7\n" +
            "down 8\n" +
            "down 4\n" +
            "down 8\n" +
            "up 8\n" +
            "down 7\n" +
            "up 1\n" +
            "forward 9\n" +
            "forward 6\n" +
            "forward 2\n" +
            "forward 7\n" +
            "down 9\n" +
            "down 9\n" +
            "down 7\n" +
            "forward 4\n" +
            "forward 8\n" +
            "forward 8\n" +
            "up 3\n" +
            "down 7\n" +
            "down 7\n" +
            "down 3\n" +
            "forward 5\n" +
            "forward 3\n" +
            "down 3\n" +
            "down 6\n" +
            "forward 2\n" +
            "down 6\n" +
            "up 7\n" +
            "forward 2\n" +
            "up 5\n" +
            "down 7\n" +
            "forward 4\n" +
            "down 7\n" +
            "forward 6\n" +
            "up 6\n" +
            "up 6\n" +
            "forward 6\n" +
            "forward 3\n" +
            "up 1\n" +
            "forward 2\n" +
            "forward 6\n" +
            "up 1\n" +
            "down 9\n" +
            "forward 8\n" +
            "forward 6\n" +
            "down 8\n" +
            "down 3\n" +
            "up 5\n" +
            "forward 7\n" +
            "forward 2\n" +
            "up 4\n" +
            "up 3\n" +
            "forward 4\n" +
            "down 3\n" +
            "down 5\n" +
            "down 5\n" +
            "down 2\n" +
            "down 7\n" +
            "up 2\n" +
            "down 2\n" +
            "up 7\n" +
            "down 1\n" +
            "forward 6\n" +
            "forward 5\n" +
            "forward 4\n" +
            "down 6\n" +
            "down 1\n" +
            "down 5\n" +
            "down 6\n" +
            "down 3\n" +
            "down 9\n" +
            "down 2\n" +
            "down 7\n" +
            "forward 7\n" +
            "up 7\n" +
            "down 3\n" +
            "down 3\n" +
            "forward 7\n" +
            "up 5\n" +
            "down 9\n" +
            "forward 9\n" +
            "down 2\n" +
            "up 4\n" +
            "up 9\n" +
            "up 9\n" +
            "down 1\n" +
            "up 6\n" +
            "down 1\n" +
            "forward 7\n" +
            "down 6\n" +
            "forward 9\n" +
            "down 9\n" +
            "down 4\n" +
            "down 1\n" +
            "forward 6\n" +
            "down 2\n" +
            "forward 6\n" +
            "up 8\n" +
            "forward 1\n" +
            "up 1\n" +
            "up 5\n" +
            "down 6\n" +
            "down 8\n" +
            "down 8\n" +
            "forward 5\n" +
            "forward 4\n" +
            "forward 3\n" +
            "up 8\n" +
            "up 9\n" +
            "down 4\n" +
            "forward 4\n" +
            "forward 4\n" +
            "down 9\n" +
            "forward 9\n" +
            "down 7\n" +
            "forward 7\n" +
            "up 4\n" +
            "forward 2\n" +
            "down 8\n" +
            "forward 1\n" +
            "down 7\n" +
            "forward 5\n" +
            "forward 1\n" +
            "down 8\n" +
            "up 1\n" +
            "up 1\n" +
            "down 2\n" +
            "down 4\n" +
            "down 7\n" +
            "down 3\n" +
            "forward 7\n" +
            "down 3\n" +
            "up 3\n" +
            "forward 8\n" +
            "up 6\n" +
            "forward 7\n" +
            "forward 6\n" +
            "down 1\n" +
            "down 8\n" +
            "forward 7\n" +
            "up 1\n" +
            "forward 2\n" +
            "down 6\n" +
            "down 1\n" +
            "forward 4\n" +
            "forward 2\n" +
            "down 9\n" +
            "up 8\n" +
            "down 9\n" +
            "down 2\n" +
            "down 3\n" +
            "down 5\n" +
            "down 3\n" +
            "down 8\n" +
            "down 1\n" +
            "down 1\n" +
            "up 5\n" +
            "forward 5\n" +
            "down 2\n" +
            "down 5\n" +
            "down 5\n" +
            "up 4\n" +
            "up 5\n" +
            "up 6\n" +
            "up 7\n" +
            "down 5\n" +
            "forward 4\n" +
            "up 6\n" +
            "up 3\n" +
            "down 5\n" +
            "forward 9\n" +
            "down 5\n" +
            "down 3\n" +
            "down 8\n" +
            "forward 6\n" +
            "forward 4\n" +
            "forward 4\n" +
            "forward 4\n" +
            "forward 9\n" +
            "forward 3\n" +
            "up 3\n" +
            "forward 7\n" +
            "down 6\n" +
            "down 7\n" +
            "down 9\n" +
            "down 5\n" +
            "up 3\n" +
            "forward 9\n" +
            "forward 7\n" +
            "forward 2\n" +
            "down 4\n" +
            "up 4\n" +
            "down 7\n" +
            "down 9\n" +
            "down 6\n" +
            "down 8\n" +
            "forward 4\n" +
            "forward 9\n" +
            "down 4\n" +
            "forward 9\n" +
            "forward 3\n" +
            "forward 9\n" +
            "down 8\n" +
            "forward 6\n" +
            "down 6\n" +
            "up 8\n" +
            "forward 9\n" +
            "forward 5\n" +
            "forward 6\n" +
            "down 5\n" +
            "up 1\n" +
            "forward 2\n" +
            "up 5\n" +
            "up 8\n" +
            "down 7\n" +
            "down 9\n" +
            "forward 6\n" +
            "forward 7\n" +
            "forward 2\n" +
            "down 8\n" +
            "down 5\n" +
            "forward 5\n" +
            "down 6\n" +
            "forward 2\n" +
            "forward 7\n" +
            "down 6\n" +
            "up 5\n" +
            "down 4\n" +
            "down 7\n" +
            "up 9\n" +
            "up 4\n" +
            "down 1\n" +
            "forward 4\n" +
            "up 6\n" +
            "forward 2\n" +
            "forward 8\n" +
            "forward 9\n" +
            "down 5\n" +
            "forward 1\n" +
            "forward 1\n" +
            "down 6\n" +
            "up 9\n" +
            "forward 7\n" +
            "down 9\n" +
            "forward 4\n" +
            "forward 2\n" +
            "forward 6\n" +
            "forward 6\n" +
            "forward 7\n" +
            "up 6\n" +
            "down 8\n" +
            "up 8\n" +
            "down 7\n" +
            "forward 6\n" +
            "up 2\n" +
            "forward 6\n" +
            "down 1\n" +
            "down 5\n" +
            "down 6\n" +
            "up 8\n" +
            "forward 5\n" +
            "up 5\n" +
            "forward 1\n" +
            "down 9\n" +
            "down 1\n" +
            "up 4\n" +
            "down 2\n" +
            "up 8\n" +
            "up 2\n" +
            "down 3\n" +
            "up 4\n" +
            "down 3\n" +
            "up 5\n" +
            "down 4\n" +
            "down 2\n" +
            "up 9\n" +
            "forward 2\n" +
            "forward 8\n" +
            "down 5\n" +
            "down 3\n" +
            "forward 4\n" +
            "forward 3\n" +
            "forward 3\n" +
            "down 6\n" +
            "down 8\n" +
            "forward 6\n" +
            "down 1\n" +
            "forward 6\n" +
            "down 8\n" +
            "down 7\n" +
            "down 7\n" +
            "forward 6\n" +
            "forward 5\n" +
            "up 8\n" +
            "forward 7\n" +
            "up 6\n" +
            "down 7\n" +
            "forward 7\n" +
            "down 8\n" +
            "down 8\n" +
            "forward 7\n" +
            "up 4\n" +
            "forward 4\n" +
            "forward 1\n" +
            "up 1\n" +
            "down 5\n" +
            "up 6\n" +
            "up 6\n" +
            "up 7\n" +
            "down 1\n" +
            "down 2\n" +
            "up 3\n" +
            "down 3\n" +
            "forward 6\n" +
            "down 7\n" +
            "down 9\n" +
            "down 1\n" +
            "forward 2\n" +
            "forward 6\n" +
            "down 9\n" +
            "up 2\n" +
            "forward 6\n" +
            "up 7\n" +
            "forward 5\n" +
            "down 6\n" +
            "down 5\n" +
            "forward 2\n" +
            "down 9\n" +
            "forward 8\n" +
            "up 7\n" +
            "down 9\n" +
            "down 7\n" +
            "forward 8\n" +
            "forward 7\n" +
            "down 6\n" +
            "down 7\n" +
            "forward 1\n" +
            "down 9\n" +
            "up 6\n" +
            "up 8\n" +
            "down 4\n" +
            "down 2\n" +
            "down 4\n" +
            "down 2\n" +
            "down 5\n" +
            "forward 9\n" +
            "down 3\n" +
            "forward 3\n" +
            "forward 1\n" +
            "down 2\n" +
            "down 4\n" +
            "down 1\n" +
            "up 3\n" +
            "up 7\n" +
            "down 5\n" +
            "down 8\n" +
            "forward 6\n" +
            "up 6\n" +
            "down 2\n" +
            "down 3\n" +
            "forward 3\n" +
            "up 4\n" +
            "up 3\n" +
            "down 6\n" +
            "down 3\n" +
            "forward 4\n" +
            "forward 7\n" +
            "forward 3\n" +
            "up 7\n" +
            "forward 3\n" +
            "down 8\n" +
            "forward 7\n" +
            "down 3\n" +
            "forward 8\n" +
            "forward 2\n" +
            "forward 4\n" +
            "down 5\n" +
            "forward 3\n" +
            "down 8\n" +
            "up 2\n" +
            "forward 5\n" +
            "up 7\n" +
            "forward 2\n" +
            "down 2\n" +
            "down 5\n" +
            "up 1\n" +
            "up 7\n" +
            "down 4\n" +
            "up 9\n" +
            "down 4\n" +
            "forward 3\n" +
            "forward 1\n" +
            "up 9\n" +
            "forward 1\n" +
            "forward 3\n" +
            "forward 1\n" +
            "forward 5\n" +
            "forward 2\n" +
            "forward 6\n" +
            "up 6\n" +
            "down 1\n" +
            "forward 1\n" +
            "forward 6\n" +
            "forward 6\n" +
            "forward 5\n" +
            "down 6\n" +
            "forward 8\n" +
            "down 4\n" +
            "forward 3\n" +
            "forward 4\n" +
            "forward 1\n" +
            "forward 9\n" +
            "down 4\n" +
            "forward 5\n" +
            "down 2\n" +
            "down 3\n" +
            "forward 7\n" +
            "forward 2\n" +
            "forward 1\n" +
            "forward 5\n" +
            "down 9\n" +
            "up 3\n" +
            "up 7\n" +
            "forward 3\n" +
            "forward 2\n" +
            "down 2\n" +
            "up 7\n" +
            "forward 9\n" +
            "up 4\n" +
            "up 2\n" +
            "up 1\n" +
            "down 5\n" +
            "down 4\n" +
            "forward 2\n" +
            "down 6\n" +
            "down 5\n" +
            "down 6\n" +
            "forward 6\n" +
            "down 9\n" +
            "down 1\n" +
            "forward 2\n" +
            "forward 7\n" +
            "forward 4\n" +
            "down 5\n" +
            "down 6\n" +
            "down 2\n" +
            "forward 7\n" +
            "down 3\n" +
            "forward 5";

    public static List<String> getData() {
        return Arrays.asList(data.split("\n"));
    }
}
