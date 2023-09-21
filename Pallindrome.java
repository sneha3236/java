import java.util.*;
class Pallindrome
{
public static void main(String ar[])
{
int n,r,s=0,temp;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
n=sc.nextInt();
temp=n;
while(n>0)
{
r=n%10;
s=(s*10)+r;
n=n/10;
}
if(s==temp)
{
System.out.println("number is pallindrome");
}
else{
System.out.println("not a pallindrome");}
}
}