import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        
        int numberOfClouds;
        int[] c = new int[100];
        Scanner input = new Scanner(System.in);
        int i;
        int jumps = -1;
        //Enter the number of clouds
        numberOfClouds = input.nextInt();

        //Enter the clouds
        for (i=0; i<numberOfClouds; i++) {
           c[i] = input.nextInt();
        }

        input.close();

        for(i=0; i<numberOfClouds; i++, jumps++) {

            if(i<numberOfClouds-2 && c[i+2] == 0){
                i++;
            }
        }

        System.out.println(jumps);
    }
}