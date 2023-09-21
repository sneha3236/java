import java.util.*;
class triangle
{
public static void main(String ar[])
{
float t1,t2,t3,sum;
Scanner s=new Scanner(System.in);
System.out.println("enter a angle A");
t1=s.nextFloat();
System.out.println("enter a angle B");
t2=s.nextFloat();
System.out.println("enter a angle C");
t3=s.nextFloat();
sum=t1+t2+t3;
System.out.println("sum of the angles are"+sum);
if(sum==180)
System.out.println("valid triangle");
else
System.out.println("not valid");
}
}