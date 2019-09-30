import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        
        int[] a = new int[100000];
        int[] temp = new int[100000];
        int n;
        int d;
        int i,j;
        Scanner input = new Scanner(System.in);

        n = input.nextInt();
        d = input.nextInt();

        for(i=0; i<n; i++) {
            a[i] = input.nextInt();      
        }
        input.close();

        // Store d elements in a temp array
        for(i=0; i<d; i++) {
            temp[i] = a[i];
        }

        // Shift rest of the array
        for(i=0;i<n-d; i++) {
            a[i] = a[i+d];
        }

        // Store back the d elements
        for(i=n-d, j=0; i<n; i++, j++) {
            a[i] = temp[j];
        }

        //printing the array
        for(i=0; i<n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}