import java.util.*;
class series1
{
public static void main(String ar[])
{
int b,e,diff;
Scanner s=new Scanner(System.in);
System.out.println("enter a first number");
b=s.nextInt();
System.out.println("enter a last number");
e=s.nextInt();
System.out.println("enter a diiference between 2 numbers");
diff=s.nextInt();
while(b<=e)
{
System.out.println(b+" ");
b=b+diff;
}
}
}