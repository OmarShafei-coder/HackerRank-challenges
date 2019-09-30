import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        int numOfvalleys = 0;
        int currentLevel = 0;
        int numberOfSteps;
        int i;
        String steps;
        Scanner input = new Scanner(System.in);

        numberOfSteps = input.nextInt();
        steps = input.next();
        input.close();

        for (i=0; i<numberOfSteps; i++) {
            if(steps.charAt(i) == 'U')      currentLevel++;
            else if(steps.charAt(i) == 'D') currentLevel--;
            else;   

            if(currentLevel == 0 && steps.charAt(i) == 'U'){
                numOfvalleys++;
            }
        }

        System.out.println(numOfvalleys);
    }
}