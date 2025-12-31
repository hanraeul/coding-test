class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        int share = 0;
        int any = 0;
        
        for(int z = i; z <= j; z++) {
            
            share = z / 10; //숫자를 자릿수로 자르기위해 '숫자10'을 사용
            any = z % 10;
            
            if(share == k && any == 0) { // 쫌..
                answer ++;
                continue;
            }
            
            while(share != 0) {
                
                if(any == k) {
                    answer ++;
                    any = share % 10;
                    share = share / 10;
                }
                
                else {
                    any = share % 10;
                    share = share / 10;
                }
            }
            if(any == k) {
                answer ++;
            }
            
        }
        
        return answer;
    }
}