class Super{
    int x;
    Super(int x)
    {
        this.x=x;
    }
    void display()
    {
        System.out.println("Super x ="+ x);
    }
}
class Sub extends Super
{
    int y;
    Sub(int x,int y)
    {
        super(x);
        this.y=y;
    }
    void display()
    {
        System.out.println("Super x ="+ x);
        System.out.println("sub y ="+ y);
    }

}
public class OverRiding {
    public static void main(String[] args) {
        Sub s1= new Sub(10,12);
        s1.display();
    }
    
}
