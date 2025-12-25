import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        my_string = my_string.toLowerCase(); //문자열 소문자로 변경
        ArrayList<Character> charlist = new ArrayList<>();
        
        for(int i = 0; i < my_string.length(); i++) {
            charlist.add(my_string.charAt(i));
        }
        
        Collections.sort(charlist);
        
        for(int z = 0; z < charlist.size(); z++) {
            answer += charlist.get(z);
        }
        
        
        return answer;
    }
}