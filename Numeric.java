import java.util.*;
import java.lang.*;
public class Numaric
{
public static void main(String[] args)
{
  String s;
  int i,count=0;
  Scanner sc=new Scanner(System.in);
  s=sc.nextLine();
  char ch[]=s.toCharArray();
  int len=s.length();
  for(i=0;i<len;++i)
{
  if(ch[i]>='a'&& ch[i]<='z'||ch[i]>='A'&& ch[i]<='Z')
  {
  count=count+1;
  }
}
if(count==0)
{
  System.out.println("yes");
}
else
System.out.println("no");

}
}
