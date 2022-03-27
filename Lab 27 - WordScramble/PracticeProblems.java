import static java.lang.System.out;

public class PracticeProblems{
    public static void main(String[] args){
        out.println("\'7\' is the character \'a\'? >>> " + isLetterA('7'));
        out.println("\'a\' is the character \'a\'? >>> " + isLetterA('a'));
        out.println("\'F\' is the character \'a\'? >>> " + isLetterA('F'));
        out.println("\n\"apple\" has at least 2 \'a\'s? >>> " + hasMultipleAs("apple"));
        out.println("\"Some teachers eat apples.\" has at least 2 \'a\'s? >>> " + hasMultipleAs("Some teachers eat apples."));
        out.println("\n\'u\' is a vowel? >>> " + isVowel('u'));
        out.println("\'b\' is a vowel? >>> " + isVowel('b'));
        out.println("\'I\' is a vowel? >>> " + isVowel('I'));
        out.println("\nVowel count in \"salsa\" >>> " + numVowels("salsa"));
        out.println("\nVowel count in \"The best teachers eat salsa.\" >>> " + numVowels("The best teachers eat salsa."));
        out.println("\nThe word \"salsa\" has the same number of \'a\' and \'s\'? >>> " + evenChars("salsa", 'a', 's'));
        out.println("The word \"salsa\" has the same number of \'a\' and \'f\'? >>> " + evenChars("salsa", 'a', 'f'));
        out.println("\nThe word \"programmer\" has a repeated \'m\'? >>> " + hasRepeat("programmer", 'm'));
        out.println("The word \"programmer\" has a repeated \'r\'? >>> " + hasRepeat("programmer", 'r'));
        out.println("\nCapitalizing \'m\' gives you >>> " + capChar('m'));
        out.println("Capitalizing \'W\' gives you >>> " + capChar('W'));
        out.println("\nCapitalizing vowels in \"salsa\" gives you >>> " + capVowels("salsa"));
        out.println("Capitalizing vowels in \"SCRUMPTIOUS\" gives you >>> " + capVowels("SCRUMPTIOUS"));
    }

    public static boolean isLetterA(char letter){
        return letter == 'a' || letter == 'A';
    }

    public static boolean hasMultipleAs(String s){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(isLetterA(s.charAt(i)))
                count++;
            if(count >1)
                return true;
        }
        return false;
    }

    public static boolean isVowel(char letter){
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (int i = 0; i < vowels.length; i++){
            if(vowels[i] == letter)
                return true;
        }
        return false;
    }

    public static int numVowels(String s){
        int numOfVowels = 0;
        for (int i = 0; i < s.length(); i++){
            if(isVowel(s.charAt(i)))
                numOfVowels++;
        }
        return numOfVowels;
    }

    public static boolean evenChars(String s, char a, char b){
        int[] charsFound = new int[2];
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == a)
                charsFound[0]++;
            else if (s.charAt(i) == b)
                charsFound[1]++;
        }
        return charsFound[0] == charsFound[1];
    }

    public static boolean hasRepeat(String s, char a){
        for(int i = 0; i < s.length(); i++){
            if(s.length() - i == 1)
                break;
            if(a == s.charAt(i) && a == s.charAt(i+1))
                return true;
        }
        return false;
    }

    public static char capChar(char a){
        return (a+"").toUpperCase().charAt(0);
    }

    public static String capVowels(String s){
        String newS = "";
        for(int i = 0; i < s.length(); i++){
            if(isVowel(s.charAt(i)))
            newS += s.substring(i, i+1).toUpperCase();
            else
            newS += s.substring(i, i+1).toLowerCase();
        }
        return newS;
    }
}