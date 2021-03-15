package Basics;

public class ATM {

    public static int solve(int n) {

        int[] notes = {500, 200, 100, 50, 20, 10};
        int numOfNotes = 0;

        if(n < 10 || n % 10 != 0) {
            return -1;
        }

        for (int i = 0; i < notes.length; i++) {
            numOfNotes = numOfNotes + (n / notes[i]);
            n = n % notes[i];
        }

    return numOfNotes;
    }
}
