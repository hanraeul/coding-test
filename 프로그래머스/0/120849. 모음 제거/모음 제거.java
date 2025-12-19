class Solution {
    public String solution(String my_string) {
        char[] array = {'a','e','i','o','u'};
        StringBuilder cor = new StringBuilder();

        for(int i = 0; i < my_string.length(); i++) {
            
            for(int z = 0; z < array.length; z++){
                
                if(my_string.charAt(i) == array[z]) {
                    break;   //모음 발견즉시 break
                }
                else if(z == array.length - 1) {
                    cor.append(my_string.charAt(i));
                    //모음아닌게 확인끝나면 cor에 저장
                }
            }
        }
        return cor.toString();
    }
}
