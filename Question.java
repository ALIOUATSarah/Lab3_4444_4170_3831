/******************************************************************************

Write a Java program that performs the following tasks:
1.	Accepts the daily temperatures (in degrees Celsius) for a week (7 days) from the user.
2.	Stores these temperatures in an array.
3.	Provides the following functionalities using user-defined methods:
o	Display the highest temperature of the week.
o	Display the lowest temperature of the week.
o	Display the average temperature for the week.


*******************************************************************************/
import java.util.Scanner;

public class Question {

    // Function to find the highest temperature in the array
    public static float Highest(float[] temp) {
        float max = temp[0]; // Assume the first value is the maximum
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > max) {
                max = temp[i]; // Update max if a bigger value is found
            }
        }
        return max;
    }

    // Function to find the lowest temperature in the array
    public static float Lowest(float[] temp) {
        float min = temp[0]; // Assume the first value is the minimum
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] < min) {
                min = temp[i]; // Update min if a smaller value is found
            }
        }
        return min;
    }

    // Function to calculate the average of all temperatures
    public static float Avg(float[] temp) {
        float sum = 0;
        for (int i = 0; i < temp.length; i++) {
            sum = sum + temp[i]; // Add each temperature to sum
        }
        return sum / temp.length; // Divide by number of elements
    }

    public static void main(String[] args) {
        // Create Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Ask user how many temperature values they want to enter
        System.out.println("Enter number of temperatures:");
        int n = input.nextInt();

        // Create an array to store the temperatures
        float[] temp = new float[n];

        // Loop to take input for each temperature
        for (int i = 0; i < n; i++) {
            System.out.println("Temperature " + (i + 1) + ":");
            temp[i] = input.nextFloat();
        }

        // Call functions and display the results
        System.out.println("The highest temperature is: " + Highest(temp));
        System.out.println("The lowest temperature is: " + Lowest(temp));
        System.out.println("The average temperature is: " + Avg(temp));

        // Close the scanner
        input.close();
    }
}
