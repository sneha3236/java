import java.util.Scanner;  
public class ass8  
{  
public static void main(String[] args)   
{  
int n,temp;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the number of elements you want to store: ");  
n=sc.nextInt();  
int[] array = new int[n];  
System.out.println("Enter the elements of the array: ");  
for(int i=0; i<n; i++)  
{  
array[i]=sc.nextInt();  
}  
System.out.println("Array elements are: ");  
for (int i=0; i<n; i++)   
{  
System.out.println(array[i]);  
}  
{
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
}
return a[n-2];
}  
}