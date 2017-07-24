/*
You are given an integer . Print the factorial of this number.


Input 
Input consists of a single integer , where .

Output 
Print the factorial of .

Example 
For an input of , you would print .

Note: Factorials of  can't be stored even in a  long long variable. Big integers must be used for such calculations. Languages like Java, Python, Ruby etc. can handle big integers, but we need to write additional code in C/C++ to handle huge values.

We recommend solving this challenge using BigIntegers.
*/

import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Factorial {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	System.out.print("Enter a number 1-100 to find factorial: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(fact(num));
    }
    
    public static BigInteger fact(int n) {
        if (n == 1)
            return BigInteger.valueOf(1);
        return BigInteger.valueOf(n).multiply(fact(n-1));
    }
}
