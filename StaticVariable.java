class Student{
    int rollno;
    String name;
    static String college="UIT";
    Student(int r,String n)
    {
        rollno=r;
        name=n;
    }
    void display()
    {
        System.out.println(rollno+" "+name+" "+college);
    }
}
public class StaticVariable {
    public static void main(String[] args) {
        Student s1= new Student(1, "Kripa");
        Student s2= new Student(2, "Jeeva");
        s1.display();
        s2.display();
    }
}
