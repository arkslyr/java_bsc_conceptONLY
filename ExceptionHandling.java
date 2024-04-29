class ExecptionHandling {
    public static void main(String[] args) {
    
        int a[]={5,5};
        int b=5;
        int c;
        try
        {
            int x=(a[2]/(b-a[0]));
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Error");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Index Error");        
        }
        finally
        {
            c=a[1]/a[0];
            System.out.println("c ="+ c);
        }

}    
}