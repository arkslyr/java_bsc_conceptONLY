class A extends Thread
{
    public void run()
    {
        for(int i=0;i<3;i++)
         {
             System.out.println("Thread A i=" + i);
         }
         System.out.println("Exit from A");
    }
}
class B extends Thread
{
    public void run()
    {
        for(int i=0;i<3;i++)
         {
             System.out.println("Thread B i=" + i);
         }
         System.out.println("Exit from B");
    }
}
class ThreadTest
{
    public static void main(String[] args) {
        A threadA = new A();
        B threadB = new B();
        System.out.println("Start Thread A");
        threadA.start();
        System.out.println("Start Thread B");
        threadB.start();
        System.out.println("End of main Thread");
    }
} 