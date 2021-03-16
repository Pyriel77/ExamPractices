package basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class SubStringComparison {

    public static String getSmallestAndLargest(String s, int k) {

        List<String> subs = new ArrayList<>();

        if (s.length() == 0) {
            return "Empty string";
        }

        if (s.length() < k) {
            return s;
        }

        for (int i = 0; i < s.length(); i++) {
            if(k + i > s.length()) {
                break;
            }
            subs.add(s.substring(i, k+i));
        }

        Collections.sort(subs);
        String smallest = subs.get(0);
        String largest = subs.get(subs.size() - 1);


        return smallest + "\n" + largest;
    }
}
