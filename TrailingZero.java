/*Find the number of trailing zeros in a factorial, trailing zeros are the number of zeros occuring at the end of the result
  input= 5! (5!=120 i.e., one zero)
  output=1
  input = 10! (10!=3628800 i.e., two zeros)
  output = 2*/

public class Alpha
  {
    static int trailing(int n)
    {
      int res=0;
      int powOf5= 5;
      while( n>=powOf5)
        {
          res=res+(n/powOf5);
          powOf5= powOf5*5;
        }
      return res;
    }
    public static void main(String...args){
      Scanner sc= new Scanner(System.in);
      int n= sc.nextInt();
      System.out.println(trailing(n));
    }
  }
  
