import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class zad1 {
    public static void main(String args[])
    {
        String str1 = "jashdjhsagj";
        String str2 = "janj";
        Map<Character, Integer> mapa = new HashMap<Character, Integer>();

        int length2 = str2.length();
        int length1 = str1.length();

        for( Integer i=0;i<length2;i++){
            char ch = str2.charAt(i);
            System.out.println(ch);
            Integer col = 0;
            //int index = str1.indexOf(ch);
            for (int c = 0; c < length1; c++) {
                if (str1.charAt(c) == ch) {
                    col++;
                }
            }
            mapa.put(ch,col);
        }
        System.out.println(mapa);
    }
}
