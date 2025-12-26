class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= 100 ; i++) {
            if((n * i) % 6 == 0) { //6의 최소공배수 구하기
                answer = (n * i) / 6;
                break;
            }
        }
        
        return answer;
    }
}