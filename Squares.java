import java.util.*;
import java.lang.*;
public class Squares
{
public static void main(String[] args)
{
  int n,a,b=0;
  Scanner sc=new Scanner(System.in);
  n=sc.nextInt();
  while(n>0)
  {
    a=n%10;
    n=n/10;
    b=(a*a)+b;

  }
  System.out.println(b);
}
}
