class Solution {
    public String solution(String s) {
        String answer = "";
        int k = 0;
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                answer += ' ';
                k = 0;
            }
            else {
                if(k % 2 == 0) answer += Character.toString(s.charAt(i)).toUpperCase();
                else answer += Character.toString(s.charAt(i)).toLowerCase();
                k++;
            }
        }
        
        return answer;
    }
}