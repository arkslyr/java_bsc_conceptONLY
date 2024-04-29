class ExceptionDemo { 
    public static void main(String args[]) 
     { 
        try
         { 
            int num1 = 100, num2 = 0; 
            int result = num1 / num2; 
            System.out.println("Result = " + result); 
         }   
        catch (ArithmeticException e) 
        { 
            System.out.println("ArithmeticException:Division by Zero"); 
        } 
        finally
        {
            System.out.println("Denominator shoud not be ZERO!!!");
        }
     } 
    }
    