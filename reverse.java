import java.util.*;
class reverse
{
public static void main(String ar[])
{
int a,b,i;
Scanner s=new Scanner(System.in);
System.out.println("enter a number from where u want to start");
a=s.nextInt();
System.out.println("enter a number where u want to end");
b=s.nextInt();
if(a>b)
{
for(i=a;i<=b;i++)
System.out.println("numbers are "+i);}
else
{
for(i=b;i>=a;i--)
System.out.println("numbers are "+i);
}
}
}