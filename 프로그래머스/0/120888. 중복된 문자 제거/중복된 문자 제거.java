class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        
        //2중 for문 리팩토링대상
        
        for(int i = 0; i < my_string.length(); i++) { //비교할 문자하나 추출
            
            for(int z = 0; z < my_string.length(); z++) { //한바퀴돌려서 중복찾기
                
                if(my_string.charAt(i) == my_string.charAt(z)) {
                // 중복을 찾았으면 중복문자만 제외한 문자열을 다시생성해서 비교작업 반복
                    if(i <= z) {
                        sb.append(my_string.charAt(i));
                        break;
                    }
                    else {
                        break;
                    }
                }
                
                }
            }
        return sb.toString();
    }
}