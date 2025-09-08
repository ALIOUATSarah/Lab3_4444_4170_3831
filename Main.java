/******************************************************************************

David the developer, has written a java method that is supposed to find the index 
of the first prime number in a given list. 

For example : 
    int[] numbers = {8, 10, 15, 18, 22, 29, 35};
When the function is called, it should return the index of 29 which is 5. 

However, his code does not work. Debug the following code to achieve the objective 
mentioned above. 

---------------------------- ERRORS IN DAVID’S CODE ----------------------------
1. Loop syntax error:
   - David wrote: for (int i = 0, i <= num, i--)

     * The parts of a for-loop must be separated by ;
     * Using i--
   - FIX: for (int i = 2; i <= num / 2; i++)

2. Wrong operator for divisibility:
   - David wrote: if (num / i = 0)
   - Problems:
     * "=" is assignment.
     * "/" is devision".
   - FIX: if (num % i == 0)

3. Division by zero risk:
   - Because David started the loop at i = 0.
   - FIX: Start loop from i = 2.

4. Prime check condition:
   - The check for (num <= 1) was inside the loop, but it should be handled 
     at the start of the method.
   - FIX: Move "if (num <= 1) return false;" outside the loop.


*******************************************************************************/

public class Question2 {

    public static void main(String[] args) {
        // Example number to check
        int num = 11;

        // Call the isPrime method to check if 'num' is prime
        boolean a = isPrime(num);

        // Print the result (true if prime, false if not)
        System.out.println(a);
    }

    // Corrected Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;  // numbers <= 1 are not prime

        // Loop from 2 up to half the number
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) { // if divisible by i → not prime
                return false;
            }
        }
        return true; // no divisors found → prime
    }
}
