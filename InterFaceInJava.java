interface Area
{
    final static float pi=3.14f;
    float compute(float x,float y);
}
class Rectangle implements Area{
    public float compute(float x, float y)
    {
        return(x*y);
    }
}
class Circle implements Area
{
    public float compute(float x,float y)
    {
        return(x*x*pi);
    }
}
class InterFaceInJava {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Circle circ = new Circle();
        Area area;
        area= rect;
        System.out.println("Area of rectangle ="+ area.compute(10,20));
        area= circ;
        System.out.println("Area of a circle = "+ area.compute(10,0));
    }
}
