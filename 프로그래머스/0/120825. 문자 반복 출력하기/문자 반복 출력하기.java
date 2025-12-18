class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String array[] = new String[my_string.length()];
        String cor = "";
        
        for(int i = 0; i < my_string.length(); i++) {
            
            cor = "";
            
        // 문자열에서 뗀 문자하나를 n번만큼반복한걸 cor에 저장    
            for(int z = 1; z <= n ; z++) {
                cor += my_string.charAt(i);
                
        // 내부for문이 끝나면 array인덱스에 cor을 저장
                if(z <= n) {    
                    array[i] = cor;
                }
            }
        }
        
        for(int g = 0 ; g < array.length; g++) {
            answer += String.valueOf(array[g]);
        } // array에 저장된값을 answer에 합치는 반복작업
        
        return answer;
    }
}

/* 성장중..? 
깔끔하지않고 불필요한 구조많음, 리팩토링대상
사고과정은 정답방향
*/