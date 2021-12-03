package day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputData {
    private static final String data = """
            011111101011
            101001110000
            010010001011
            011111100101
            111110100011
            100000010101
            001110110111
            101101111100
            001101110111
            010101000101
            010001001110
            000010001111
            011111001000
            011011111011
            001101110100
            011101111010
            000101000000
            011010101111
            010001010010
            110010101001
            100000011111
            001100001011
            011100001000
            100101100111
            111011101101
            011001010100
            011110010100
            010001110001
            111001101110
            011001110011
            101110111100
            101101010110
            111111100101
            001011100100
            101000111101
            001101100000
            101011011110
            111110000111
            101101010010
            001110100100
            110010010101
            110000011000
            000000000100
            100101011110
            010101110001
            110111100111
            110110100101
            100110000001
            001111000011
            000100101000
            001100111011
            001011010011
            000110111010
            001110011100
            100010001100
            011010000001
            011100001111
            110111111101
            011100110101
            110111010010
            010111001110
            110100110101
            010010011011
            100111010000
            011100000111
            011100011100
            100111000011
            111111110001
            111011001000
            001111111011
            011001000100
            100110010010
            000000100111
            101011001010
            111111101001
            011100101011
            101110001101
            111111010100
            100100000010
            111100001011
            110000011101
            110111100110
            011100010101
            100111001101
            101101100001
            000101101101
            001001001110
            101001100000
            101010110001
            100001010101
            100100001001
            111101100001
            100000010010
            000001101010
            000110100011
            110011111100
            111010101110
            011110111000
            101011110001
            100100100001
            000000011011
            000100000010
            101011010110
            011001111111
            101111010000
            100001101011
            110111000110
            111000110001
            100000000101
            100010111011
            010100011111
            100000011101
            110011000010
            010111111001
            011011101111
            110011111110
            111011010011
            000011010100
            111010100000
            010100101010
            101000000011
            000101100000
            111101100100
            111101101101
            010000111111
            100001000001
            000011010110
            110001101001
            110100011110
            000100001000
            110010100011
            010000010001
            000010000100
            100001000000
            111110100101
            001100001111
            001001010001
            101011110000
            101101001111
            110001011110
            100011011101
            100000110100
            110011000100
            110101001000
            100010010001
            001011011010
            111000101000
            111000100100
            001001100010
            100100011111
            011101101100
            001011111001
            111000001100
            100001101010
            101001111011
            010101100111
            010111100101
            010000110110
            010011001001
            011000110110
            000000101111
            101110111000
            100010100010
            001101011100
            010010001000
            011011110010
            001001100000
            001110010010
            011011100001
            100101001110
            000100001111
            100100110001
            100100111010
            110000010110
            110010011110
            110100110000
            111011011111
            000100111001
            010111110000
            111001100001
            001010011100
            010000000110
            110010010010
            101000001001
            100111000100
            001001111011
            111000111000
            000110100010
            100001101001
            000100111101
            111111110111
            100001000010
            000111000100
            110101001111
            111101011011
            100101111110
            010110111101
            100010101111
            111010111011
            110000100101
            100111011001
            110110100111
            010011000011
            000011010010
            100011011110
            001000100101
            001001111010
            110011001111
            101010100111
            011111010000
            110001011101
            010010101110
            110011111011
            011011101011
            111110001011
            011001000001
            101111000110
            111100101110
            011011001110
            010011010001
            000101011001
            111100101010
            010000100001
            101010100100
            110110011110
            111000111110
            100111001100
            001000100001
            110110110011
            111110101111
            011110111110
            000101101110
            000011111111
            010101111000
            010000001100
            010111100001
            111010110100
            001110000001
            101100101111
            010110100001
            011100000110
            110001001000
            100110101001
            001000111010
            101100000101
            100110011101
            011110101101
            011100010100
            000011100000
            000011101111
            100100000001
            010001100100
            001111000110
            101001010110
            000011101101
            111110001100
            101011101110
            100001010110
            111110110010
            000101111111
            000111101111
            011000011001
            101101000101
            110110111001
            111010011000
            000100100110
            001110011010
            001001011000
            101001011001
            110111000001
            000101110101
            100001110101
            110010100010
            001000010011
            000011000100
            111100000000
            011000100001
            000111000110
            010101011011
            001110011011
            110011101001
            001111101001
            010100100101
            011111000100
            010000011101
            010101001100
            001011010010
            010001011100
            011011010011
            001000111101
            011011101010
            001010010001
            010101011000
            011110100000
            010010001100
            000010001011
            000000001101
            001111000001
            100111001011
            010000001111
            010111111111
            110000100100
            110111001001
            111010011101
            001000000010
            011110010000
            111111111110
            011011111111
            110010110011
            001100101111
            101011101010
            111111000011
            101011000100
            011001011000
            111001000100
            001011001100
            011010001101
            100100011100
            111000101111
            111010001001
            100110000010
            100011000110
            001101011011
            110000011011
            010101010000
            010100001000
            000011010000
            110110001110
            111001001010
            010011111111
            010011110111
            111100010100
            110101101010
            100100011001
            111101011000
            011000001011
            101011100100
            111011101100
            011010011110
            000100010111
            010101100011
            000001000000
            001000110110
            100000110110
            000100101010
            010111001111
            100100010110
            111000011100
            111100010000
            001100010100
            010001011011
            111101110110
            100011111101
            100001010010
            011111101100
            010110011110
            111100011001
            110110010110
            110011011011
            000100100010
            111110110110
            010110010110
            000000111110
            110010101000
            011100100100
            110011100000
            001011100110
            001000110111
            010011001010
            001011001110
            100010010010
            100011000100
            110010111000
            100010111000
            111010000000
            010101001110
            110100010100
            010011010110
            111111000110
            000110111001
            001011000101
            110111011001
            101001101001
            111001111111
            111100000100
            100100110100
            110100000010
            000100011011
            100101000000
            000000000111
            101010100001
            010011101000
            101101101010
            011011001111
            000001111011
            110100011001
            111101100010
            000001110101
            110011000000
            100101110111
            101000100100
            010110011011
            001001101011
            000100011010
            011011000010
            001111100000
            101111000101
            001101111010
            010000101101
            011100011011
            011001011010
            010010101101
            100101101011
            100111011101
            111011001111
            001010101011
            111101011110
            010100000111
            001101011001
            001101000101
            101111000001
            010100010000
            011011111100
            110101101011
            000000011001
            000000101101
            101100010010
            101110011101
            001110010011
            001011000111
            111101001110
            010101101010
            001100010000
            100101010101
            111101110111
            001101010001
            111001100101
            001101101101
            111100101000
            100001100011
            011000011010
            101111000111
            101000010100
            000011001001
            111010101101
            100110010100
            011001111000
            001001100110
            010100110000
            101100001010
            111100100001
            000110010000
            100100000100
            011100101000
            100111101011
            001111100001
            111001011001
            000000010101
            011000010011
            100111000010
            000100001101
            110100010110
            001110001111
            001101110010
            110110101000
            100111011010
            011001110111
            011111011111
            101111111100
            001100100110
            101101111111
            010000111101
            010000000111
            010110000100
            111101001000
            011101101110
            010011011111
            000000101100
            101011100000
            010111111010
            111001011000
            001000100110
            110000001010
            110101011011
            101001010000
            000000110110
            000100101100
            001000010010
            101010010000
            011100010001
            001100101010
            010110001010
            011000100110
            110001111010
            100001011100
            010001111010
            111101010100
            100001111010
            000100011000
            011110111100
            111110010000
            000011111100
            001010101100
            011100001101
            101100001101
            111010000111
            001110100011
            100001001110
            110011001010
            000101111110
            111101010010
            101000001110
            001100111101
            111110101010
            001101001010
            000011110011
            000001010110
            110111010110
            110011111001
            110111001110
            011100111001
            111101100011
            010110001000
            100100100101
            111001110001
            001101101011
            111000101110
            011000100010
            001100001010
            101001011101
            101001000110
            101001110100
            100010010011
            111011110011
            011100111101
            100110010000
            111110001010
            101011111010
            101110101100
            100010100000
            110101001011
            111001101111
            101010110000
            110011010110
            101001110101
            001011011100
            111100011110
            011000111110
            011100111100
            001101000011
            101110010111
            110011101110
            001100011100
            001100001000
            010000010011
            110011111000
            101010001001
            001001110110
            111000000010
            101110100110
            010000000011
            100100001000
            000000101010
            110000111010
            000101110111
            110101100011
            010111101011
            010110100100
            011010100111
            010110111100
            011010011100
            001110110100
            010110100000
            010010111100
            001001100001
            101010000001
            100010101011
            010011100010
            110010001001
            111110110101
            111001100110
            101010011101
            000100110100
            011000111100
            000001011010
            100100001010
            110010001100
            101111001101
            011101101001
            001011111101
            101001011111
            111011001110
            001000010000
            000000000011
            011100100000
            000101001010
            100101100100
            101000100101
            101011111000
            100101111010
            100011110110
            011110010011
            101111110101
            000000110000
            111101011010
            110001110001
            100000001110
            101101000000
            110110010100
            100011000111
            011000000100
            011010110110
            100100001100
            011000110001
            000011010001
            011010111111
            011110001110
            111111000000
            000111011001
            110100000100
            110101000111
            011001101010
            010000100010
            110010000100
            011011001010
            010100011000
            111000100001
            011001110010
            011111010111
            001000110001
            110010011101
            001110010001
            001011011000
            000111010000
            010010011010
            011110110110
            010010000010
            000000111000
            101110101010
            110111010001
            010010000100
            001110010100
            101011110011
            001000100100
            110000110000
            100011000101
            000011100010
            010101111100
            110110110100
            111110000100
            011010110100
            001111001111
            101010111011
            010010000001
            001011101101
            001001000011
            000111100100
            100111111000
            011111001011
            011110101001
            101011101101
            101110111011
            111111101000
            110000100011
            011101010011
            111100000111
            011110101000
            001000110101
            110101111011
            010101000001
            110111011011
            000100000101
            011010010101
            000111010010
            100011001101
            001011011011
            001001111111
            100100110010
            101100101000
            110111010011
            111000011001
            100000001111
            001001111001
            001010010000
            011010011111
            111100010001
            010101001010
            000100001011
            011110000100
            101101110101
            011100001010
            100110110110
            001110111100
            010010101010
            000101011111
            101101010111
            100110100000
            100110100001
            010110010010
            011010100010
            101001110110
            011110000111
            001001010010
            010011001101
            011000011000
            101001100011
            011111100100
            110111110111
            010010110001
            100111000111
            100001100000
            100101001001
            001010110011
            101111110010
            111100101100
            100011101111
            010010111101
            010001010101
            100011001011
            101111100010
            101011010011
            101111001000
            111111111111
            101001111101
            011111110010
            101111010010
            011000000010
            101110101101
            011011100101
            111110011111
            110101110101
            000001011110
            110110110111
            001001001000
            000100111011
            011101011111
            101110000111
            100011100100
            011000110011
            110100011111
            101010001011
            000000010011
            110101010011
            001101010000
            011011010101
            000101100110
            100110001111
            100011010101
            111100101001
            101111010001
            000011001000
            100110000111
            101001111010
            000110000110
            010100101011
            101011111100
            000111000010
            111000100111
            110010101100
            111000000100
            101101000001
            110101001110
            001100100100
            011000011111
            000010111100
            100010101010
            000001011111
            011001100001
            010010000111
            111100111010
            110100011100
            101000101111
            010110001001
            101111100110
            101101110110
            001010101000
            000101110110
            101101111001
            110000001001
            110101100000
            011100110110
            101110010101
            111001101100
            101000011011
            011001010110
            101111011110
            001110101111
            000100110110
            101110100111
            001010010100
            001000000000
            100100001110
            101011000010
            001011111011
            011111100111
            100001001100
            000001101100
            110001101101
            010101001001
            000000011110
            010100111001
            011111100010
            011000010100
            000001111101
            011110011101
            010001010111
            001100110001
            101111001010
            100100010000
            101011101011
            011110001001
            001101100011
            010010100100
            111010101010
            011010100011
            010100011010
            001000000110
            100011001100
            011111000010
            111011011101
            111101010111
            000101011110
            101011101001
            100111110001
            000000011101
            100010001010
            000000010000
            111001100100
            101100111000
            100011000010
            010011010111
            011110111101
            111000110101
            001000001001
            111001100111
            010001001010
            011101110101
            001111111111
            000101001100
            010011010000
            000111111101
            100101110100
            110011110110
            100110111101
            011011101001
            001111101111
            110010001110
            110100111101
            001111101110
            100110100100
            010011001111
            110001011000
            100101110010
            101101101100
            001010111111
            111000000111
            110100101011
            100100000000
            100100111101
            110110000000
            110010010100
            111100110000
            101110001100
            110001111100
            111001100000
            111011100011
            100100011101
            000111110111
            011011000100
            111001101000
            000001011011
            100000101101
            100011010100
            010111000000
            011111001101
            010000101011
            110001010110
            001101100111
            111101111011
            000100101001
            000000100110
            011011111110
            001011010001
            101110010010
            010101101101
            100111011011
            100001111000
            011110011011
            001001110011
            010100011011
            001001110010
            111101010101
            010111011001
            000001001110
            010111010110
            000000100000
            000001101101
            001110101000
            100100101001
            111100001010
            110110101010
            000101111000
            011010100000
            100111101111
            110000110110
            001001000111
            100110101011
            010011100000
            010110011101
            111110100111
            110000000001
            011101001101
            101110100100
            011110011010
            000111001110
            110100001100
            110011011000
            000001010010
            011111010010
            011111010101
            000101110011
            111001011111
            001111110101
            110111000011
            001011101100
            110010000000
            100001011010
            001111110111
            111110011110
            110111100001
            001010000001
            110111101110
            001100000110
            000110001001
            110001101110
            111110101001
            111101101111
            010110110100
            100101011010
            011111110110
            001110111001
            011000101110
            010001010001
            101000000000
            001010000110
            011110111001
            010000001011
            101110110101
            100011011001
            000100111000
            011000111111
            010010100010
            101100110110
            011001010101
            111000001101
            111101011101
            111011010101
            101100101110
            100101010001
            001011000001
            101110111010
            100010110100
            010011001100
            100001100110
            000101010111
            001110110010
            100100010101
            000100100000
            100101101101
            010101000011
            000100011101
            101000001100
            111111101111
            110000111011
            001011100010
            100100101100
            011011100110
            101010110101
            000111110100
            101111100100
            001001111101
            010000111000
            000000101000
            001000010111
            001011010000
            110010111011
            100111101101
            011100111011
            101100101001
            010010000011
            100110001110
            101000011100
            010111001000
            011111111001
            010100111111
            011000110111
            000001100101
            100101100010
            001111110000
            100000011011""";

    private static final String testData = """
            00100
            11110
            10110
            10111
            10101
            01111
            00111
            11100
            10000
            11001
            00010
            01010""";

    public static List<String> getData() {
        return new ArrayList<>(Arrays.asList(data.split("\n")));
    }

    public static List<String> getTestData() {
        return new ArrayList<>(Arrays.asList(testData.split("\n")));
    }
}
