import java.util.*;
class leap
{
public static void main(String ar[])
{
int year;
Scanner s=new Scanner(System.in);
System.out.println("enter year");
year=s.nextInt();
if(year%400==0)
System.out.println("leap year");
else if(year%100==0)
System.out.println("not a leap year");
else if(year%4==0)
System.out.println("leap year");
else
System.out.println("not a leap year");
}
}