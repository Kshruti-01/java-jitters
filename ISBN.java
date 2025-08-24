/* The International Standard Book Number (ISBN) is a unique numeric book identifier which is printed on every book. The ISBN is based upon 10 digit code. The ISBN is legal if :
1*digit1 + 2*digit2 + 3*digit3 + 4*digit4 + 5*digit5 + 6*digit6 + 7*digit7 + 8*digit8 + 9*digit9 + 10*digit10 ix divisible by 11.
example: for an ISBN 1401601499
  sum=1*1+2*4+3*0+4*1+5*6+6*0+7*1+8*4+9*9+10*9 = 253 which is divisible by 11
(i) Input the ISBN code as 10 digit integer
(ii) If the ISBN is not a 10 digit number, output the message, "Illegal ISBN", terminate the program
(iii) If the number is 10 digits extract the digits from number and compute the sum as explained above
If the sum is divisible by 11, output the message "Legal ISBN". If the sum is not divisible by 11, output the message "Illegal ISBN".*/ 


import java.util.Scanner;
public class ISBN
 {
   Public static void main(String...args)
   {
     Scanner sc= new Scanner(System.in);
     int n,n1,c=0,i,r,s=0;
     System.out.println("Enter the 10 digit number");
     n=sc.nectInt();
     n1=n;
     while(n1>0){
       n1=n1/10;
       c++;
     }
     if(c<10 && c>10)
       System.out.println("Illegal ISBN, enter 10 digit number");
       break;
     else{
       for(1=10;i>=1;i--)
         {
           r=n%10;
           s=s+r*i;
           n/=10;
       }
       if(s%11==0)
         System.out.println("Legal ISBN");
       else
         System.out.println("Illegal ISBN");
     }
   }
 }  
       
    
