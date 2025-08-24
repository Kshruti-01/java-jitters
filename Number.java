/* Using switch statement, write a menu driven program:
(i)To check and display whether a number input by a user is a composite number or not. ( A number is said to be composite if it has one or more factors, excluding one and the number itself. Example: 4,6,8,9..)
(ii) To find the smallest didgit of an integer that is input.
  sample inut: 6524
  sample output: Smallest digit is 2
 For an incorrect choice, an appropriate error message should be displayed*/

import java.util.*;
public class Number
  {
    public static void main(String...args)
    {
      Scanner sc= new Scanner(System.in);
      int n,c=0,i,d,min,ch;
      System.out.println("1 to check composite number");
      System.out.println("2 to check smallest of digit");
      System.out.println("Enter your choice");
      ch=sc.nextInt();
      switch(ch)
        {
          case 1:
            System.out.println("Enter the number to check the composite number");
            n=sc.nextInt();
            for(i=2;i<=n;i++)
              {
                if(n%i==0)
                  c++;
              }
            if(c>=1)
              System.out.pritnln("Composite number");
            else
              System.out.println("Not a composite number");
            break;

          case 2:
            System.out.println("Enter the number to find the smallest digit");
            n=sc.nextInt();
            min=n%10;
            while(n>0)
              {
                d=n%10;
                if(d<min)
                  min=d;
                n=n/10;
              }
            System.out.println("the smallest number is"+min);
            break;
          default:
            System.out.println("wrong choice");
        }
    }
  }
