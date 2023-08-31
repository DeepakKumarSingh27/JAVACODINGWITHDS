package String;
class Student
{
    static
    {
        System.out.println("static block");
    }
}
public class Test {
    public static void main(String[] args) {
        try
        {
            Class.forName("");
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
