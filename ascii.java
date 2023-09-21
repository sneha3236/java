import java.util.Scanner;
class ascii
{
public static void main(String ar[])
{
char ch;
System.out.println("enter a character");
Scanner s=new Scanner(System.in);
ch=s.next().charAt(0);
int a=ch;
System.out.println("ASCII value of " +ch+ " is " +a);
}
}