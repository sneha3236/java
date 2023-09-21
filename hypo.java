import java.util.*;
class hypo
{
public static void main(String ar[])
{
float h,p,b,hs,ps,bs,sum;
Scanner s=new Scanner(System.in);
System.out.println("enter h,p and b");
h=s.nextFloat();
p=s.nextFloat();
b=s.nextFloat();
hs=h*h;
ps=p*p;
bs=b*b;
sum=ps+bs;
if(hs==sum)
System.out.println("triangle is hypo");
else
System.out.println("triangle is not hypo");
}
}