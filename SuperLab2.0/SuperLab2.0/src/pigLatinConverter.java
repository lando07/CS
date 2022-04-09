
/**
 * Write a description of class pigLatinConverter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class pigLatinConverter {
    public static String convert(String engLang) {
        engLang = engLang.toLowerCase();
        String pigLatinLang;
        int frstVwlIndx;
        if (engLang.charAt(0) == 'a' || engLang.charAt(0) == 'e' || engLang.charAt(0) == 'i' || engLang.charAt(0) == 'o'
                || engLang.charAt(0) == 'u') {
            pigLatinLang = engLang + "hay";
        } else {
            frstVwlIndx = findFirstVowelIndex(engLang);
            pigLatinLang = engLang.substring(frstVwlIndx) + engLang.substring(0, frstVwlIndx) + "ay";
        }
        return pigLatinLang;
    }

    public static int findFirstVowelIndex(String word) {
        for (int i = 0; i < word.length(); i++) {
            switch (word.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    return i;
            }
        }
        return -1;
    }
    private pigLatinConverter(){

    }
}
