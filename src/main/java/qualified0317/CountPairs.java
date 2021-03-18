package qualified0317;

import java.util.HashSet;
import java.util.Set;

public class CountPairs {

    public static int countPairs(int[] arr, int[] arr2) {


        Set<Integer> set = new HashSet<Integer>();


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr[i] + arr2[j] == 10) {
                    if (arr[i] > arr2[j]) {
                        set.add(arr2[j]);
                    } else {
                        set.add(arr[i]);
                    }
                }
            }
        }

        return set.size();
    }
}
