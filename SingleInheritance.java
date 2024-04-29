import java.util.Scanner;
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
    void sum()
    {
        sum=a+b;
        System.out.println("Sum = "+ sum);
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        
        B obj=new B();
          obj.get();
          obj.get1();
          obj.sum();
    }
    
}
