class Solution {
    public String[] solution(String my_str, int n) {
        int remain = 0;
        
        if (my_str.length() % n == 0) {
            remain = 0;
        }
        else {
            remain = 1;
        }
        
        String[] answer = new String[(my_str.length() / n) + remain];
        
        for(int i = 0; i < (my_str.length() / n) + remain ; i++) {
            if(i == 0) {
                answer[i] = my_str.substring(0, n);
            }
            else if(i < my_str.length() / n) {
                answer[i] = my_str.substring(n*i, (n*(i+1)));
            }
            else {
                answer[i] = my_str.substring(n*i, my_str.length());
                
            }
        }
                
        return answer;
    }
}

/*

1. answer 배열길이는 주어진 문자열을 n으로 나눴을때의 몫 + 나머지가 0이라면 0을 더하고 1 이상이라면 1을 더한다. (그냥 100으로 설정해도되긴함)
2. for문으로 처음 한번만 저장
3. 0 ~ n+1 n+1 ~ (n*(i+1)) +1

*/