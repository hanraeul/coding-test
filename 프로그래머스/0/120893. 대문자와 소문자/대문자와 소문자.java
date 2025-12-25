class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder save = new StringBuilder();
        
        for(int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i) >= 'A' && my_string.charAt(i) <= 'Z') {
               save.append(Character.toLowerCase(my_string.charAt(i)));
            }
            else{
               save.append(Character.toUpperCase(my_string.charAt(i)));
            }
        }
        
        return answer = save.toString();
    }
}