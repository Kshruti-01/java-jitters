/*Write a java program to check whether a number is an armstring number or not. A number is siad to be armstrong if the sum of the cube of its digit is equal to the original number.
sample input: 153
Sample output: 1^3+5^3+3^3= 153. so it is an armstrong number*/

import java.util.Scanner;
public class Armstrong
  {
    public static void main(String...args)
    {
      Scanner sc= new Scanner(System.in);
      int n, no, d, s=0;
      n=sc.nextInt();
      no=n;
      while(no>0)
        {
          d=no%10;
          s=s+d*d*d;
          no/=10;
        }
      if(s==n)
        System.out.println("The number" +n+ "Armstrong number");
      else
        System.out.println("The number"+n+ "is not an Armstrong number");
    }
  }
