class Demo
{
    int divisor,divident;
    public int divison() throws ArithmeticException
    {
        int result=divident/divisor;
        return result;
    }
}
public class ThrowsExceptionDemo
{
    public static void main(String[] args) 
    {
        Demo demo = new Demo();
        int result=0;
        try{
            demo.divident=8;
            demo.divisor=0;
            result=demo.divison();
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception");
            System.out.println("Catches an Exception");
        }
        finally
        {
            System.out.println("Result is " + result);
        }
    }
}