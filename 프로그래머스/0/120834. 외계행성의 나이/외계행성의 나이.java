class Solution {
    public String solution(int age) {
        StringBuilder save = new StringBuilder();
        String alpha = age + "";
        
        for(int i = 0; i < alpha.length(); i++) {
            save.append((char)((alpha.charAt(i) - '0') + 'a'));
        }
        
        return save.toString();
    }
}