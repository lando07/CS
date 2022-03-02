import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class localizedMainExec {
    public static final String fileNotFound = "Oops! File not found, make sure all text files are present!";
    public localizedMainExec(int os) throws IOException {
        switch (os) {
            case 0:
                linux.main();
            case 1:
                win.main();
            case 2:
                bluej.main();
        }
    }
}

class linux {
    private linux(){}
    static void main() throws IOException{
        univObjs univObjs = new univObjs(0);
        try(BufferedReader br = new BufferedReader(new FileReader("Welcome.txt"))){
            String line;
            while((line = br.readLine()) != null){
                out.println(line);
            }
        }
        catch(FileNotFoundException e){
            out.println(localizedMainExec.fileNotFound);
        }
        //univObjs.nextLine(); isa confused
    }
}

class win {
    private win(){}
    static void main() throws IOException{
        univObjs univObjs = new univObjs(1);
        try(BufferedReader br = new BufferedReader(new FileReader("Welcome.txt"))){
            String line;
            while((line = br.readLine()) != null){
                out.println(line);
            }
        }
        catch(FileNotFoundException e){
            out.println(localizedMainExec.fileNotFound);
        }
        //univObjs.nextLine(); isa confused
    }
}

class bluej {
    private bluej(){}
    static void main() throws IOException{
        univObjs univObjs = new univObjs(2);
        try(BufferedReader br = new BufferedReader(new FileReader("Welcome.txt"))){
            String line;
            while((line = br.readLine()) != null){
                out.println(line);
            }
        }
        catch(FileNotFoundException e){
            out.println(localizedMainExec.fileNotFound);
        }
        //univObjs.nextLine(); isa confused
    }
}