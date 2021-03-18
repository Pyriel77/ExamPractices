package t360;

import java.util.HashSet;
import java.util.Set;

public class DigitsCounter {

    public static int getCountOfDigits(String str) {

        Set<Integer> digits = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                digits.add(Integer.parseInt(String.valueOf(str.charAt(i))));
            }
        }


        return digits.size();
    }

    public static void main(String[] args) {

        System.out.println(getCountOfDigits("string1contains1233and566"));
    }


}
