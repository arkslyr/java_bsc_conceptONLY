class Grade
{
    public static void main(String[]args)
    {
        int mark= 8;
        
        switch(mark)
        {
            case 10:
            case 9:
                System.out.println("Grade : A+");
                break;
            case 8:
            case 7:
                System.out.println(" Grade : A");
                break;
            case 6:
                System.out.println("Grade : B");
                break;
            case 5:
                System.out.println("Grade : C");
                break;
            case 4:
                System.out.println("Grade : D");
            default:
                System.out.println(" PLEASE ENTER THE marks from 10 to 1");
                break;
        }
    }
}