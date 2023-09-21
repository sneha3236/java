import java.util.*;
class alpha
{
public static void main(String ar[])
{
char alpha;
Scanner s=new Scanner(System.in);
System.out.println("enter alphabet");
alpha=s.nextChar();
if(alpha>=65 && alpha<=90)
{
alpha=(char)(aplha+32);
System.out.println(" "+alpha);
}
else
{
alpha=(char)(alpha-32);
System.out.println(" "+alpha);
}
}
}