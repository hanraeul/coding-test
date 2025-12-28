import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 0;
        ArrayList<Integer> save = new ArrayList<>();
        
        for(int i = 1; i <= n; i++) {  // 나눠질수
                        
            for(int z = 1; z <= i; z++) { //나눌수
                
                if(i % z == 0) {
                    save.add(i);
                    
                    if(save.size() >= 3) { //약수3개이상일시
                        answer++;
                        break;
                    }
                }
                
            }        
            save.clear();
        }
        return answer;
    }
}