class Solution {
    public int solution(int[] array) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < array.length; i++) {
            sb.append(array[i]);            
        }
        
        for(int z = 0; z < sb.length(); z++) {
            
            if(sb.charAt(z) == '7') {
                answer++;
            }
            else {
                continue;
            }
        }
                
        return answer;              
    }
}

/*
1. StringBuilder sb 선언
2. 첫번째 for문으로 array 배열값들을 하나씩빼서 sb에 전부 저장
3. 두번째 for문으로 sb값을 charAt로 잘라서 7인지 확인, 7이면 answer ++
4. 반복 끝나면 answer return
*/