package basics;

import java.io.IOException;
import java.util.Arrays;

public class ArraysLeftRotation {

    static int[] rotLeft(int[] a, int d) {

        int[] rotated = new int[a.length];
        int r = 0;

        for (int i = 0; i < a.length; i++) {
            if (d > a.length) {
                d = d % a.length;
            }
            if (i - d < 0) {
                r = i - d + a.length;
            } else if (i - d >= 0) {
                r = i - d;
            }
            rotated[r] = a[i];
        }

    return rotated;
    }

    //private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[] a = {1, 4, 7, 9, 11, 12, 10, 23, 22, 76, 28, 45, 90};
        int d = 2;
        System.out.println(Arrays.toString(rotLeft(a, d)));

//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] nd = scanner.nextLine().split(" ");
//
//        int n = Integer.parseInt(nd[0]);
//
//        int d = Integer.parseInt(nd[1]);
//
//        int[] a = new int[n];
//
//        String[] aItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int aItem = Integer.parseInt(aItems[i]);
//            a[i] = aItem;
//        }
//
//        int[] result = rotLeft(a, d);
//
//        for (int i = 0; i < result.length; i++) {
//            bufferedWriter.write(String.valueOf(result[i]));
//
//            if (i != result.length - 1) {
//                bufferedWriter.write(" ");
//            }
//        }
//
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    }
}



