import java.util.Scanner;
 class Pallindrome 
{ 
    public static void main(String[]args) 
    { 
        int r,sum=0,temp; 
        Scanner sc=new Scanner(System.in);    
     System.out.println("value of M is");   
      int M=sc.nextInt();      
   temp=M;       
  while(M>0){          
   r=M%10;           
  sum=(sum*10)+r; 
    M=M/10; 
        } 
        if(temp==sum) 
        System.out.println("pallindrome number");    
     else 
        System.out.println("not pallindrome"); 
    } 
} 
