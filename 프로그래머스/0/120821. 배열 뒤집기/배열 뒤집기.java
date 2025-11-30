class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int count = -1;
        
        for(int i = num_list.length-1; i >= 0; i--){
            count ++;
            answer[count] = num_list[i];
            
        }
        return answer;
    }
}

// for문 i++ 증가형태로 쓰면 값저장, num_list 배열 길이 두개를 저장해야함
// 감소형태로 쓰면.. 