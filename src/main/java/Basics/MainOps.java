package Basics;

import java.util.Arrays;

import static Basics.ATM.solve;
import static Basics.LarioAndMuigi.pipeFix;
import static Basics.SumOfArraySingles.repeats;

public class MainOps {

    public static void main(String[] args) {

        int[] testArray = {1, 3, 5, 6, 7, 8, 9, 3, 5, 11};
//
//        System.out.println(Arrays.toString(pipeFix(testArray)));

//        System.out.println(solve(1350));

        System.out.println(repeats(testArray));

    }
}
