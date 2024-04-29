import java.util.Scanner;
class SumOfADigit
{ public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Digit");
        int num=sc.nextInt();
        int sum=0;
        int rem=0;
        for(int i=0;num>0;i++)
        {
            rem=num%10;
            num=num/10;
            sum=sum+rem;
        } 
        System.out.println("Sum of the digit is " + sum);
    }
} 