class Solution {
    public String solution(String rsp) {
        StringBuilder rspresult = new StringBuilder(rsp.length());
        
        for(int i = 0; i < rsp.length(); i++) {
            
            // 큰따옴표, 작은따옴표 구분해서 사용하기
            if('2' == rsp.charAt(i)) { 
                rspresult.append('0');
            }
            else if('5' == rsp.charAt(i)) {
                rspresult.append('2');
            }
            else {
                rspresult.append('5');
            }
        }
        
        return rspresult.toString();
    }
}