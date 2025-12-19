class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int k = 0;
        int g = 0;
        
        for(int i = 0; i < num_list.length ; i++) {
            if(num_list[i] % 2 == 0) {
                k ++;    // 짝수면 카운트
            }
            else {
                g ++;  //홀수면 카운트
            }
        }
        
        answer[0] = k;
        answer[1] = g;
        
        return answer;
    }
}