import java.util.Scanner;
import java.util.Arrays;
public class Solution {
    public static void main(String[] args) {

        long[] arr = new long[5];
        Scanner scanner = new Scanner(System.in);
        int i;
        long max = 0;
        long min = 0;

        for(i=0; i<5; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.close();
        //Sorting
        Arrays.sort(arr);

        //getting the minimum
        for(i=0; i<4; i++) {
            min += arr[i];
        }

        //getting the maximum
        for(i=1; i<5; i++) {
            max += arr[i];
        }

        System.out.print(min + " " + max);
    }
}