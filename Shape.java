import java.util.Scanner;
class Shape
{
    int l;
    int b;
    void get(int length, int breadth )
    { 
        l=length;
        b=breadth;
    }
    int calcArea()
    {
        int a=l*b;
        return a;
    }
    public static void main(String[] args) 
    { 
      Scanner sc=new Scanner(System.in);
      Shape rect = new Shape();
      System.out.println("Enter the Length and Bredth");
      int lr=sc.nextInt();
      int br=sc.nextInt();
      rect.get(lr,br);
      int area=rect.calcArea();
      System.out.println(area);
      Shape sqr = new Shape();
      System.out.println("Enter the Length and Bredth");
      int ls=sc.nextInt();
      int bs=sc.nextInt();
      sqr.get(ls,bs);
      area=sqr.calcArea();
      System.out.println(area);   
    }   
}