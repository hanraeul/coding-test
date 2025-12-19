class Solution {
    public int solution(int n) {
        int answer = 0;
        
        double i = Math.sqrt((double)n); //제곱근
        
        if((int)i * (int)i != n) { //소수점자르고 제곱해보기
            answer = 2;
        }
        else {
            answer = 1;
        }
        
        
        return answer;
    }
}
