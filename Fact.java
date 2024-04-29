import java.util.Scanner;

class Fact
{
    public static void main(String[] args) 
    {
    Scanner sc=new Scanner(System.in);    
    int fact=1;
    int i=1;
    System.out.println("Enter the number");
    int n=sc.nextInt();
    if(n>0)
       {
           for(i=1;i<=n;i++)
           {
               fact=fact*i;
           }
         System.out.println("factorial of"+n+"is"+fact);  

       }
    else if(n==0)
       {
          System.out.println("factorial of"+n+"is"+fact); 
       }   
    else 
    System.out.println("Invalid");
    }
}