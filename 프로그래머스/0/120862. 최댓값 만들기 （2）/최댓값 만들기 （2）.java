import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        int num1 = numbers[numbers.length - 1]; //제일 큰값
        int num2 = numbers[numbers.length - 2]; //2번째로 큰값
        int num3 = numbers[0] * numbers[1]; //음수가 있다면
        
        if(num3 > num1 * num2) {
            answer = num3;
        }
        else {
            answer = num1 * num2;
        }
        
        return answer;
    }
}