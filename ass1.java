import java.util.*;
class ass1
{
public static void main(String ar[])
{
int age=0,rollno=0;
String name="";
Scanner s=new Scanner(System.in);
for(int i=0;i<3;i++)
{
System.out.println("enter a name");
System.out.println("enter a age");
System.out.println("enter a roll number");
name=s.nextLine();
age=s.nextInt();
rollno=s.nextInt();
}
System.out.println("entered data is"+name);
System.out.println("entered data is"+age);
System.out.println("entered data is"+rollno);
}
}