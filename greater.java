import java.util.*;
class greater
{
public static void main(String ar[])
{
int a,b;
Scanner s= new Scanner(System.in);
System.out.println("enter two numbers");
a=s.nextInt();
b=s.nextInt();
if(a<b)
System.out.println(" greater is"+b);
else if(a>b)
System.out.println(" greater is"+a);
else
System.out.println("both are equal");
}
}
