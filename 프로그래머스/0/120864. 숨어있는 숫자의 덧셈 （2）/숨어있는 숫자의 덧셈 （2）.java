import java.util.Arrays;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        StringBuilder sb = new StringBuilder("0");
        
        for(int i = 0; i < my_string.length(); i++) {
            if(Character.isDigit(my_string.charAt(i))){
                sb.append(my_string.charAt(i));
            }
            /*else if(sb.length() == 0 && !Character.isDigit(my_string.charAt(i))) {
                continue;
            }*/
            else {
                answer += Integer.parseInt(sb.toString());
                sb = new StringBuilder("0");
            }
        }
        answer += Integer.parseInt(sb.toString());
        return answer;
    }
}

/* 

1. for문을 사용하여 my_string 문자열에서 문자를 하나씩 떼서
숫자인지 알파벳인지 구분
2. if문 (만약 숫자라면) 숫자는 StringBuilder sb에 저장후, for문으로 돌아가 다음문자가 숫자인지 반복확인한다.
3. if문 (이번 문자가 숫자가 아니라면) sb에 저장된 숫자를 answer에 더하고 sb를 초기화후 for문으로 복귀
4. if문 (sb가 비어있고 이번문자가 숫자가 아니라면) for문 다음주기 실행
4. for문 끝나면 answer return

*/