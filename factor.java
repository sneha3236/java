import java.util.*;
class factor
{
public static void main(String ar[])
{
int a;
Scanner s= new Scanner(System.in);
System.out.println("enter a number");
a=s.nextInt();
System.out.println("Factors of" +a+ "are");
for(int i=;i<=a;i++)
   if(a%i==0)
{
System.out.println(i+" ");
}
}
}