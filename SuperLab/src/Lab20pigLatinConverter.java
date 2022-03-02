public class Lab20pigLatinConverter
{   
    private Lab20pigLatinConverter(){}
    
    public static String convert(String engLang){
        engLang = engLang.toLowerCase();
        String pigLatinLang;
        int frstVwlIndx;
        if(engLang.charAt(0) == 'a'||engLang.charAt(0) == 'e'||engLang.charAt(0) == 'i'||engLang.charAt(0) == 'o'||engLang.charAt(0) == 'u'){
            pigLatinLang = engLang + "hay";
        }
        else{
            frstVwlIndx = findFirstVowelIndex(engLang);
            pigLatinLang = engLang.substring(frstVwlIndx) + engLang.substring(0,frstVwlIndx) +"ay";
        }
        return pigLatinLang;
    }

    private static int findFirstVowelIndex(String word){
        for (int i=0; i<word.length(); i++){
            if(word.charAt(i) == 'a'|| word.charAt(i) == 'e' || word.charAt(i) == 'i'|| word.charAt(i) =='o'|| word.charAt(i) =='u'){
                return i;
            }
        }
        return -1;
    }
}
