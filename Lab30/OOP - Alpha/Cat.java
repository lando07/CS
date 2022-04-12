import static java.lang.System.out;
//Name: 

public class Cat
{
    private String name;
    private String breed;

    public Cat(String n, String b){
        name = n;
        breed = b;
    }

    public void meow(){
        out.println(name + ": meooooow");
    }

    public String getName(){
        return name;
    }
    
    public void setName(String n){
        name = n;
    }
}
