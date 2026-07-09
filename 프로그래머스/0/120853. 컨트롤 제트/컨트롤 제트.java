class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] Ssplit = s.split(" ");
        
        for(int i = 0; i < Ssplit.length; i++) {
            
            if(Ssplit[i].equals("Z")) {
                int ctrlZ = Integer.parseInt(Ssplit[i-1]);
                answer = answer - ctrlZ;
            }
            else {
                int num = Integer.parseInt(Ssplit[i]);
                answer += num;
            }
        }                
        return answer;
    }
}


/*
1. split으로 공백자르기한 s문자열을 Ssplit 배열에 저장
2. for문으로 배열 값이 Z인지 검증
3. 만약 Z라면 answer -= Ssplit(i-1); 앞서 더한값 빼기
4. Z가 아니라면 answer에 더한다
5. 끝나면 answer return
*/