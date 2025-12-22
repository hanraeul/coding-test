class Solution {
    public int solution(int hp) {
        int answer = 0;
        int[] array = {5, 3};
        
        int master = hp % array[0];
        
        answer = (hp / array[0]) + (master / array[1]) + (master % array[1]);
        
        return answer;
    }
}