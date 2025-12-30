import java.util.*;

class Solution {
    public int solution(String before, String after) {
        String answer = "";
        ArrayList<Character> swan = new ArrayList<>();
        ArrayList<Character> swan2 = new ArrayList<>();
        
        for(int i = 0; i < before.length(); i++) {
            swan.add(before.charAt(i));
            swan2.add(after.charAt(i));
        }
        Collections.sort(swan);
        Collections.sort(swan2);
        
        for(int z = 0; z < swan.size(); z++) {
            if(swan.get(z) != swan2.get(z)) {
                return 0;
            }
        }
        
        return 1;
        
    }
}