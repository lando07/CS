import static java.lang.System.out;
import java.util.Random;
import java.util.Arrays;

public class KindnessRunner{
    public static void main(String[] args){
        Random rand = new Random();
        int day = 0;
        Person[] people = {new Person("Fred",0), new Person("George",0), new Person("Bill",0), new Person("Mary",30)};
        out.println("Starting point\n"+ Arrays.toString(people));
        do{
            out.println("\nDay " + day);
            for(int i = 0; i < people.length; i++){
                if(people[i].getHappiness() > 29)
                    out.println(people[i].actOfKindness(people[rand.nextInt(4)]));
            }
            out.println(Arrays.toString(people));
            day++;
        }while(people[0].getHappiness() < 50||people[1].getHappiness() < 50||people[2].getHappiness() < 50||people[3].getHappiness() < 50);
    }
}