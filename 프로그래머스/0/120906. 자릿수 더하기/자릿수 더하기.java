class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String change = String.valueOf(n);
        
        for(int i = 0; i < change.length(); i++) {
            answer += (change.charAt(i) - '0');
        }        // 문자를 숫자로 바꾸는 흔한방법 -'0'(처음알게됨)
        
        return answer;
    }
}