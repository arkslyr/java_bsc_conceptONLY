import java.util.Scanner;
import java.io.*;
class A 
{
    int a;
    void get()
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the first number");
        a=sc.nextInt();
    }
}
class B extends A
{
    int b;
    int sum;
    void get1()
    { 
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the Second Number");
        b = sc.nextInt();
        
    }
}
class C extends B
{
    void sum()
    {
        sum=a+b;
        System.out.println("Sum = "+ sum);
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args) {
        
        C obj=new C();
          obj.get();
          obj.get1();
          obj.sum();
    }
    
}
