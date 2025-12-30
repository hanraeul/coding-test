import java.util.*;

class Solution {
    public String solution(String letter) {
        HashMap<String, Character> hashswan = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();
        
        hashswan.put(".-", 'a');
        hashswan.put("-...", 'b');
        hashswan.put("-.-.", 'c');
        hashswan.put("-..", 'd');
        hashswan.put(".",'e');
        hashswan.put("..-.", 'f');
        hashswan.put("--.", 'g');
        hashswan.put("....", 'h');
        hashswan.put("..",'i' );
        hashswan.put(".---", 'j');
        hashswan.put("-.-", 'k');
        hashswan.put(".-..", 'l');
        hashswan.put("--", 'm');
        hashswan.put("-.", 'n');
        hashswan.put("---",'o');
        hashswan.put(".--.", 'p');
        hashswan.put("--.-", 'q');
        hashswan.put(".-.", 'r');
        hashswan.put("...", 's');
        hashswan.put("-", 't');
        hashswan.put("..-", 'u');
        hashswan.put("...-", 'v');
        hashswan.put(".--", 'w');
        hashswan.put("-..-", 'x');
        hashswan.put("-.--", 'y');
        hashswan.put("--..", 'z');
        
        for(int i = 0; i < letter.length(); i++) {
            
            if(letter.charAt(i) == ' ') {
                result.append(hashswan.get(sb.toString()));
                sb.setLength(0);
                continue;
            }
           
            else if(i == letter.length() - 1) {
                sb.append(letter.charAt(i));
                result.append(hashswan.get(sb.toString()));
                break;
            }
            
            sb.append(letter.charAt(i));

        }
        return result.toString();
    }
}