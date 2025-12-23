import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> numlist = new ArrayList<>();
        
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                numlist.add(i);
            }
        }
        
        Collections.sort(numlist);
        int[] answer = new int[numlist.size()];

        
        for(int z = 0; z < numlist.size(); z++) {
            answer[z] = numlist.get(z);
        }
        
        
        return answer;
    }
}