import java.util.*;
class Apple{
    String favor;

    String color;

    Scanner sc = new Scanner(System.in);

    public void set()
    {
        System.out.println("enter apple favor");
        this.favor = sc.nextLine();
        System.out.println("enter apple color");
        this.color= sc.nextLine();
    }

    
}
class banana{
    String favor,color;
   
    Scanner sc = new Scanner(System.in);

    public void set()
    {
        System.out.println("enter apple favor");
        this.favor = sc.nextLine();
        System.out.println("enter apple color");
        this.color= sc.nextLine();
    }
}

public class polymorphism1{
    public static void main(String[] args) {

        banana b = new banana();
        b.set();
        
    }

}