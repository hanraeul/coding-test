class Solution {
    public double solution(int[] numbers) {
        double answer = 0, add = 0, count = 0;
        
        for(int i = 0; i < numbers.length; i++) {
            add = add + numbers[i];
            count++;
        }
        
        return answer = add / count;
    }
}