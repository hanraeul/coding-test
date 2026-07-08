class Solution {
    public int solution(int[] array, int n) {       
        int answer = 0;
        int index = 0;
        int num = 0;
        
        for(int i = 0 ; i < array.length; i++) {
            
            if(i == 0) {
                num = Math.abs(array[i] - n);
                index = i;
            }
            
            /*if(array[i] == n) {  
                answer = array[i];
                break;
            }     */
            
            else if(Math.abs(array[i] - n) < num) {
                num = Math.abs(array[i] - n);
                index = i;
            }
            
            else if(Math.abs(array[i] - n) == num && array[i] < array[index]) {
                num = Math.abs(array[i] - n);
                index = i;
            }            
        }
        
        answer = array[index];
                
        return answer;
    }
}

/*

1. 변수 num,index 두개 선언
2. for문에서 array값을 분리
3. 분리한값에서 n을 빼고 num에 저장, 인덱스값은 index에 저장
4. 다음반복때는 분리한값에서 n을 빼고 num보다 작으면 저장, num에 저장할때만 인덱스값도 같이 저장
5. for문 끝나면 index값으로 array 값 추출해서 answer에 저장후 리턴

에러 - 가까운수가 여러개면 더 작은 수를 리턴하는 구조가 없음.

*/