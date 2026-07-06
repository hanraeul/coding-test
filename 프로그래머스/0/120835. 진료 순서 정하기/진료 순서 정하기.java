import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] emerlist = Arrays.copyOf(emergency, emergency.length);
        int length = emergency.length;
        Arrays.sort(emerlist);
        
        for(int i = 0; i < emerlist.length; i++) {
            for(int z = 0; z < emergency.length; z++) {
                if(emerlist[i] == emergency[z]) {
                    answer[z] = length;
                    length --;
                    break;
                }
            }
        }
        return answer;
    }
}