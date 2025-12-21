import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        int even = 0;
        int count = 0;
        
        if(n % 2 == 0) {
            even = n / 2;
        }
        else {
            even = n / 2 + 1;
        }
        
        int[] answer = new int[even];  // 배열 길이 확정
        
        for(int i = 0; i < n ; i++) {
            
            if((n - i) % 2 >= 1) {  //n에서 값을빼서 홀수인지 확인  
                answer[count] = n - i;
                count ++;
            }
        }
        
        Arrays.sort(answer);
        return answer;
    }
}