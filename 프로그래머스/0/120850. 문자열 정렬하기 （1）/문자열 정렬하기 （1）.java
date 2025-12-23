import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> numlist = new ArrayList<>();
        
        for(int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if(c >= '0' && c <= '9') {
                numlist.add(c - '0');
            }
        }
        
        Collections.sort(numlist); //정렬
        
        int[] answer = new int[numlist.size()];
        for(int z = 0; z < numlist.size(); z++) {
            answer[z] = numlist.get(z);
        }
        
        return answer;
    }
}