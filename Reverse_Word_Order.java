
package solution;

import java.util.Scanner;


public class Reverse_Word_Order{
   
 
public static void main(String args[])
{
            String a[] = new String[5];                                                     // Sample array a[5] with size of 5 to store string
            String b[] = new String[5];                                                     // Sample array b[5] with size of 5 to reverse string order
            for(int c=0;c<=a.length-1;c++)                                                  // for loop to store elments in array.
                {
                    System.out.println("Enter value for a["+c+"] ");                        // User Prompt for inserting strings
                    Scanner sc= new Scanner(System.in);                                     // Scanning string to store into the array.
                    a[c] = sc.next();                                    
                }
            int h=0;                                                                        // Initiating loop handler with value 0
            for(int k=4;k>=0;k--)                                                           // Accesing elements from from descending order.
                {
                    b[h] = a[k];                                                            // Storing value of b[h] = a[k] 
                     h++;                                                                   // h iterated from intial value to 4  
                }                                                         
 
            for(int d=0;d<=a.length-1;d++)                                                  // loop to print output string.
               {
                    System.out.println("\nThe values are: a["+d+"]"  + " is" + " " +b[d]);  // Print_line to show values of b[].
               }
}
}

   
          

