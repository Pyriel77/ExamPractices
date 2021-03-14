package Basics;

import java.util.Arrays;
import java.util.Scanner;

public class StringToken {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        if(!(s.trim().length() == 0)) {
            String[] arr = s.trim().split("[\\s+ !?',.:_@-]");
            Arrays.stream(arr).forEach(System.out::println);
        } else {
            System.out.println("0");
        }


        scan.close();
    }
}
