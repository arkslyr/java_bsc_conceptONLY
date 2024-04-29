class MethodOverLoading {
int l;
int b;
void area(int x, int y)
{
    System.out.println(x*y);
}
void area(int x)
{
    System.out.println(x*x);
}
void area()
{
    System.out.println(3*5*2);
}
public static void main(String[] args) {
    MethodOverLoading obj = new MethodOverLoading();
    obj.area(2,3);
    obj.area(2);
    obj.area();
}
}
