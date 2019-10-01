/****************************************************************************
* factorial.java
****************************************************************************
* Calculates the factorial from user inputed number
*___________________________________________________________________________
* Daniel Harlow
* Oct. 1, 2019
* CMSC_255 - 003
****************************************************************************/
import java.util.Scanner;
import java.lang.Math;
    public class factorial {
        public static void main(String[] args) {
            Scanner stdin = new Scanner(System.in);
            System.out.println("Enter number to calculate factorial for: ");
            int userInput = stdin.nextInt();
            int factorial = 1;
        	for (int i = userInput; i > 0; i--) {
        		factorial *= i;
        	}
        	System.out.println(factorial);
        }
    }