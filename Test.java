class Room
{
    int length;
    int breadth;
    Room(int x,int y)
    {
        length=x;
        breadth=y;
    }
    int area()
    {
        return (length*breadth);
    }
}
class BedRoom extends Room
{
    int height;
    BedRoom(int x,int y,int z)
    {
        super(x,y);
        height=z;
        
    }
    int volume()
        {
            return(length*height*breadth);
        }
}
public class Test {
    public static void main(String[] args) {
        BedRoom r1 = new BedRoom(14, 12, 10);
        int area= r1.area();
        int volume= r1.volume();
        System.out.println("Area ="+area);
        System.out.println("Volume ="+volume);
    }
}
