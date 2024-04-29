class Abc
{
    int a;
    double b;
    String c;
    Abc()
    {
        a=100;
        b=55.5;
        c="Bus";
    }
    Abc(int x)
    {
       a=x;
    }
    Abc(double y, String z)
    {
        b=y;
        c=z;
    }

}
public class ConstrOverLoading {
    public static void main(String[] args) {
        Abc obj = new Abc();
        Abc obj2 = new Abc(20);
        Abc obj3 = new Abc(22.2, "Car");
        System.out.println(obj.a+" "+obj.b+" "+obj.c);
        System.out.println(obj2.a+" "+obj2.b+" "+obj2.c);
        System.out.println(obj3.a+" "+obj3.b+" "+obj3.c);

    }
}
