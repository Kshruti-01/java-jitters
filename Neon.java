/* Write a program in java to check whether a number is n noen number or not. A number is said to be Neon if the sum of the digit of square of a number is equal to the original number.
  Sample input: 9
  Sample output: 9*9=81, 8+1=9, 9 is a neon number*/

import java.util.Scanner;
public class Neon
  {
    public static void main(String...args)
    {
      Scanner in= new Scanner(System.in);
      int n,p, s=0;
      n= in.nextInt();
      p=n*n;
      while(p>0)
        {
          d=p%10;
          s=s+p;
          p/=10;
        }
      if(s==n)
        System.out.println("it is a neon number");
      else
        System.out.println("it is not a neon number");
    }
  }
