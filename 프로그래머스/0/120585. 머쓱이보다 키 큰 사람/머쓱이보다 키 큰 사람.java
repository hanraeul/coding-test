import java.util.Arrays;

class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        Arrays.sort(array);
        
        for(int i = 0; i < array.length; i++) {
            
            if(array[i] > height) {
                answer ++;
            }
            else{
                
            }
           
        }
        return answer;
    }
}

// 머쓱이보다 키 큰 사람수. 즉 array[i] >= height 가 아니라 array[i] > height 가 맞다
// 굳이 정렬이 필요할까? 정렬하지않고도 풀수있었던 문제
// else 저렇게 비워둘꺼면 안써도됨