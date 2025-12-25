class Solution {
    public int solution(int num, int k) {
        int answer = 0; // <- 0이 아닌 -1로 초기화가 효율적
        String change = "";
        
        change = num + "";
        for(int i = 0; i < change.length(); i++) {
            if(change.charAt(i) - '0' == k) {
                answer = i + 1;
                break;
            }
            else if(i == change.length() - 1) {
                answer = -1;
                //장황한코드. 애초에 answer을 -1로 초기화하는게 효율적
            }
            
        }
        
        return answer;
    }
}