/*Write a program in java to check whether a number is palindrome or not. A number is said to be palindrome if the new number obtained after reversing the digits is same as the original number.
  Sample input: 232
  Sample output: 232, it is a plaindrome number*/

import java.util.*;
public class Palindrome
  {
    public static void main(String...args)
    {
      Scanner sc= new Scanner(System.in);
      int n,no, rev=0,d;
      System.out.println("enter a number");
      n=sc.nextInt();
      no=n;
      while(no>0)
        {
          d=no%10;
          rev=rev*10+d;
          no/=10;
        }
      if(rev==n)
        System.out.println("It is a palindrome number");
      else
        System.out.println("It is a palindrome number");
    }
  }
        
