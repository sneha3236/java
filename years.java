import java.util.*;
class years

{
public static void main(String ar[])
{

yint cdate,cmonth,cyear,bdate,bmonth,byear;
Scanner s=new Scanner(System.in);

System.out.println("enter current date in DD form");
cdate=s.nextInt();

System.out.println("enter current month in MM form");
cmonth=s.nextInt();

System.out.println("enter current year in YYYY form");
cyear=s.nextInt();



System.out.println("enter birth date in DD form");
bdate=s.nextInt();

System.out.println("enter birth month in MM form");
bmonth=s.nextInt();

System.out.println("enter birth year in YYYY form");
byear=s.nextInt();


System.out.println("current date is:"+cdate+"-"+cmonth+"-"+cyear);
System.out.println("birth date is:"+bdate+"-"+bmonth+"-"+byear);


int pdate,pmonth,pyear;
pdate=cdate-bdate;
pmonth=cmonth-bmonth;
pyear=cyear-byear;
System.out.println("age is"+pyear+"-"+pmonth+"-"+pdate);

}
}