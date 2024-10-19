import java.util.HashMap;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        HashMap <Character, Integer> charMap = new HashMap();

        char target = ' ';
        int max = 0;

        for (int i = 0; i < str.length(); i++){
            if (charMap.containsKey(str.charAt(i)))
                charMap.put(str.charAt(i), charMap.get(str.charAt(i))+1);
            else
                charMap.put(str.charAt(i), 0);
            
            if (charMap.get(str.charAt(i))>max){
                max = charMap.get(str.charAt(i));
                target = str.charAt(i);
            }
        }

        return target;
    }
}
