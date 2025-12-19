class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        StringBuilder cor = new StringBuilder(my_string.length() - letter.length()); //메모리 누수방지
        
        
        for(int i = 0; i < my_string.length(); i++) {
            
            if(!String.valueOf(my_string.charAt(i)).equals(letter)) {
                cor.append(my_string.charAt(i));
            }
           
        }
        
        return answer += cor.toString();
    }
}