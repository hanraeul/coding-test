class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        StringBuilder password = new StringBuilder();
        
        for(int i = code-1; i < cipher.length(); i += code) {
            password.append(cipher.charAt(i));
        }
        
        return answer = password.toString();
    }
}