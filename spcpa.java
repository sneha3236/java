import java.util.*;
class spcpa
{
public static void main(String ar[])
{
float sp,cp,profit,loss;
Scanner s= new Scanner(System.in);
System.out.println("enter cost price");
cp=s.nextFloat();
System.out.println("enter selling price");
sp=s.nextFloat();
if(cp<sp)
{
profit=sp-cp;
System.out.println("profit is: "+profit);
}
else if(sp<cp)
{
loss=cp-sp;
System.out.println("loss is: "+loss);
}
else
System.out.println("no profit no loss");
}
}
