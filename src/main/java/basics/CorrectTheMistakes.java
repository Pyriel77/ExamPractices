package basics;

public class CorrectTheMistakes {

    public static String correct(String string) {

        String corr = string.replace('5', 'S');
        corr = corr.replace('0', 'O');
        corr = corr.replace('1', 'I');

        return corr;
    }
}
