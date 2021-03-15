package Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfArraySingles {

    public static int repeats(int [] arr){

        List<Integer> occurences = new ArrayList<>();
        int sum = 0;

        for (int j : arr) {
            occurences.add(j);
        }

        for ( int i = 0; i < arr.length; i++) {
            if (occurences.indexOf(arr[i]) == occurences.lastIndexOf(arr[i])) {
                sum += arr[i];
            }
        }
        return sum;
    }

}
