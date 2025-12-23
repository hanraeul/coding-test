class Solution {
    public String solution(String my_string, int num1, int num2) {
        char index1 = 0;
        char[] change = my_string.toCharArray();
        // String을 char로 형변환하는 방법
        
        index1 = change[num1];
        change[num1] = change[num2];
        change[num2] = index1;
        
        return String.valueOf(change);
    }
}