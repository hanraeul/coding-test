class Solution {
    public int solution(int order) {
        int answer = 0;
        String game = order + "";
        
        for(int i = 0; i < game.length(); i++) {
            
            switch (game.charAt(i) - '0') {
                case 3:
                    answer ++;
                    break;
                case 6:
                    answer ++;
                    break;
                case 9:
                    answer ++;
                    break;
                default:
                    break;
            }
        
        }
           return answer;

    }
}