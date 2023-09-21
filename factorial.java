import java.util.*;
class factorial
{
public static void main(String ar[])
{
int n,fact=1,i;
Scanner s=new Scanner(System.in);
System.out.println("enter a number ");
n=s.nextInt();
{
for(i=1;i<=n;i++)
fact=fact*i;
}
System.out.println("factorial of a number is "+fact);
}
}