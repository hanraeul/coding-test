class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = n ; i > 0 ; i--) {
            
            if(0 == i % 2) {
            answer = answer + i;    
            }
            
        }
        
        return answer;
    }
}