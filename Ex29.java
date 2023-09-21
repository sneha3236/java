import java.util.*;
class Ex29
{
public static void main(String args[])
{
int i , j,max;
Scanner s= new Scanner(System.in);
int rows = s.nextInt();
int cols = s.nextInt();
int[][] numbers = new int[rows][cols];
for( i = 0 ; i<rows ; i++)
{
for(j = 0 ; j<rows; j++)
{
numbers[i][j] = s.nextInt();
}
}
max = numbers[0][0];
for(i =0; i <numbers.length;i++)
{
if(max < numbers[i][j])
max = numbers[i][j];
}
System.out.println("largest number is :"+max);
}
}