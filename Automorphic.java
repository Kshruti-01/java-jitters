/*An automorphic number is the number which is contained in the last digit  of its square. Write a program to input a number and check whether a number is automorphic or not.
  Sample input: 25
  Soln: The square of 25 is 625 and 25 is present as the last two digits.
  Sample output: 25 is an automorphic number*/

import java.util.*;
public class Automorphic
  {
    public static void main(String...args)
    {
      Scanner sc= new Scanner(System.in);
      int n,p,flag=1;
      p=n*n;
      while(n>0)
        {
          if(n%10!=p%10)
            f=1;
            break;
          else{
            n=n/10;
            p=p/10;
          }
        }
      if(f==0)
        System.out.println("Automorphic number");
      else
        System.out.println("not an automorphic number");
    }
  }
