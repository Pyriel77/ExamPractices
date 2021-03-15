package Basics;

import java.util.Arrays;

public class LarioAndMuigi {

    public static int[] pipeFix(int[] numbers) {

        int[] fixed = new int[numbers[numbers.length-1] - numbers[0] + 1];

        for (int i = 0; i < fixed.length; i++) {
            fixed[i] = numbers[0]++;
        }

        return fixed;
    }

}
