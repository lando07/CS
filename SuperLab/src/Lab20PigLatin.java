import static java.lang.System.*;
import java.util.Scanner;

public class Lab20PigLatin
{
    private Lab20PigLatin(){}
    
    public static void Lab20(){
        String stringInput = "";
        //rules of pig latin:
        //move all leading consonants to end and add ay
        //if starts with a vowel add hay to the end, (y is not a vowel here)
        while(stringInput.indexOf("quit") == -1){
            out.print("Type a word (or \"quit\") >>> ");
            stringInput = UnivRefs.console.nextLine();
            if(stringInput.contains("quit")){
                //continue
            }
            else{
                String pigLatinString = pigLatinConverter.convert(stringInput);
                out.println(pigLatinString);
            }
        }
        out.println("Bye!");
    }
}