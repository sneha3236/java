import java.util.*;
class age
{
public static void main(String ar[])
{
int age;
Scanner s=new Scanner(System.in);
System.out.println("enter a age");
age=s.nextInt();
if(age<5)
System.out.println("baby");
else if(age<=12)
System.out.println("child");
else if(age<=19)
System.out.println("youth");
else if(age<=90)
System.out.peintln("young");
else if(age<=59)
System.out.println("adult");
else
System.out.println("senior citizen");
}
}