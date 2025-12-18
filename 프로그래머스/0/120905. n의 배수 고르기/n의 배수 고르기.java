class Solution {
    public int[] solution(int n, int[] numlist) {
        int z = 0;
        int c = 0;
        
        
        // 배열 길이 확정짓기 + 배열 안에 n의 배수값만 집어넣기
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) {
                c ++;
            }
            
        }
        
        int[] answer = new int[c];

        
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) {
                answer[z] = numlist[i];
                z ++;
            }
        }
        
        return answer;
    }
}