class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int d = 0;
        
        d = n / 10; // 서비스음료 갯수
        k = k - d; // 전체음료수갯수 - 서비스음료갯수
        
        answer = n * 12000 + k * 2000;
        
        return answer;
    }
}


/*
    양꼬치 10인분(n) 120,000원 + 음료수 1개(k) 2,000원 서비스 고정
    s = n / 10

*/