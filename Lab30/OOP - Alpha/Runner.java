import static java.lang.System.out;
//Name: 

public class Runner
{
    public static void main(String[] args)
    {
        Cat c1 = new Cat("Tom", "Alley");
        Cat c2 = new Cat("Tom", "Persian");
        
        c1.setName("Fred");
        out.println(c1.getName());
        
        c1.meow();
        c2.meow();
    }
}
