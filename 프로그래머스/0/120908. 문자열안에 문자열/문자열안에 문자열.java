class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        
        // 특정문자열을 포함하는지 확인하는 메소드가 있구나 .contains()
        
        if(str1.contains(str2) == true) {
            answer = 1;
        } 
        else{
            answer = 2;
        }
        
        return answer;
    }
}