import java.util.*;
class spcp
{
public static void main(String ar[])
{
float sp,cp;
Scanner a=new Scanner(System.in);
System.out.println("enter a selling price");
sp= a.nextFloat();
System.out.println("enter a cost price");
cp= a.nextFloat();
if(sp<cp)
System.out.println("loss");
else if(sp>cp)
System.out.println("profit");
else
System.out.println("equal");
}
}