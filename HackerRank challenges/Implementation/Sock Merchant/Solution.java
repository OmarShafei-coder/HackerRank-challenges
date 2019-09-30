import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Solution {

    static int sockMerchant(ArrayList<Integer> colors, int n){
        
        int counter;
        int result = 0;
        int i, j;

        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(colors);
         
        ArrayList<Integer> listWithoutDuplicates = new ArrayList<>(hashSet);
          
        for(i=0; i<listWithoutDuplicates.size(); i++){
            counter = 0;
            for(j=0; j<n; j++){
                if(listWithoutDuplicates.get(i).equals(colors.get(j)) ){
                    counter++;
                }
            }

            result += counter/2;
        }

        return result;
    }


    public static void main(String[] args) {

        // ArrayList with duplicate elements
        ArrayList<Integer> colors = new ArrayList<>();
        int n;
        int i, j;
        int numOfMatchingPairs;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of socks: ");
        n = input.nextInt();

        System.out.println("Enter the colors:");
        for(i=0; i<n; i++){
            colors.add(i, input.nextInt());
        }
            
        numOfMatchingPairs = sockMerchant(colors, n);
        System.out.println("\n" + numOfMatchingPairs);

        
        
    }

    

}