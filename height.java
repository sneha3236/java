import java.util.*;
class height 
{
public static void main(String ar[])
{
float feet,inch;
double inches,feets,distance;
Scanner s=new Scanner(System.in);
System.out.println("enter feets");
feet=s.nextInt();
System.out.println("enter inches");
inch=s.nextInt();
inches=12*feet;//to convert feet into inches
feets=inch*0.0833;//to convert inch into feet
System.out.println(" "+inches);
System.out.println(" "+feets);
distance=inches+feets;
System.out.println("total distance is: "+distance);ls
}
}