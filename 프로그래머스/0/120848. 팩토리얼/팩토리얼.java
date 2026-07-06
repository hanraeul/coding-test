class Solution {
    public int solution(int n) {
        int answer = 1;
        int a = 1;
        
        while(a <= n) {
            if(a * answer > n){
                answer --;
                break;
            }
            a *= answer;
            answer++;
        }
        
        return answer;
    }
}