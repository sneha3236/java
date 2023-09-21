import java.util.*;
class largestinarray
{
public static void main(String ar[])
{

int i,n,max;
Scanner s=new Scanner(System.in);
System.out.println("enter the number of elements u want to insert");
n=s.nextInt();
int a[]=new int[n];
System.out.println("enter the elements u want to insert in an array");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
max=a[0];
for( i=0;i<n;i++)
{
if(max<a[i])
{
max=a[i];
}
}
System.out.println("largest elemnt in an array is: "+max);
}
}