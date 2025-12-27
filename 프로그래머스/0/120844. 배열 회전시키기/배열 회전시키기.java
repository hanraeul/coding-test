class Solution {  //로직 불필요하게 복잡 리팩토링 필요
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int lastnum = numbers[numbers.length - 1];
        int firstnum = numbers[0];
        
            if(direction.equals("right")) {
                for(int i = 1; i < numbers.length; i++) {
                    answer[i] = numbers[i - 1];
                    
                    if(numbers[i] == lastnum) {
                        answer[0] = lastnum;
                    }
                }
            }
            else {
                for(int i = 0; i < numbers.length - 1; i++) {
                    answer[i] = numbers[i + 1];
                    
                    if(i == numbers.length - 2) {
                        answer[numbers.length - 1] = firstnum;
                    }
                }
            }
        return answer;
    }
}