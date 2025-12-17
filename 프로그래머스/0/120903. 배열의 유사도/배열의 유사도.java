class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        for(int i = 0; i < s1.length; i++) {
            for(int z = 0; z < s2.length; z++) {
                if(s1[i].equals(s2[z])) {
                    answer ++;
                }
            }
        }
        
        return answer;
    }
}

// equals() 까먹고있었네