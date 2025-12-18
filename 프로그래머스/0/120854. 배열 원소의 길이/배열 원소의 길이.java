class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        
        // 문자열 길이잴때는 .length()
        for(int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}