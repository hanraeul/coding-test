import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        ArrayList<Character> numlist = new ArrayList<>();
        
        for(int i = 0; i < s.length(); i++) {
            
            for(int z = 0; z < s.length(); z++) {
                
                if(s.charAt(i) == s.charAt(z) && i != z) {
                    break;   //같은 문자 발견즉시 내부반복탈출, 단 자신은 예외
                }
                else if(s.charAt(i) != s.charAt(z) && z == s.length() - 1) {
                    numlist.add(s.charAt(i));
                }
                else if(i == z && z == s.length() -1) {
                    numlist.add(s.charAt(i));
                }
            }
            
        }
        
        Collections.sort(numlist);
        
        for(int j = 0; j < numlist.size(); j++) {
            sb.append(numlist.get(j));
        }
        
        return sb.toString();
    }
}