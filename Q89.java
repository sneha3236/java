import java.util.*;
class Q48
{
public static void main(String ar[])
{
int n,r,s=0,rev=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
n=sc.nextInt();
while(n!=0)
{
r=n%10;
rev=rev*10+r;
n/=10;
}
if(n==rev)
System.out.println("number is palindrome");
else
System.out.println("not a palindrome");
}
}