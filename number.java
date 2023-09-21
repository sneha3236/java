import java.util.*;
class number
{
public static void main(String ar[])
{
int a;
Scanner s=new Scanner(System.in);
System.out.println("enter a number");
a=s.nextInt();
if(a<0)
System.out.println("number is negative");
else if(a>0)
System.out.println("number is positive");
else
System.out.println("number is zero");
}
}