package Basics;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        StringBuilder sb = new StringBuilder(A);
        sb.reverse();

        if (A.equals(sb.toString())) {
            System.out.println("Yes");

        } else {
            System.out.println("No");
        }

    }
}

