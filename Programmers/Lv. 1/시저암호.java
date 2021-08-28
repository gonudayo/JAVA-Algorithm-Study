class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i = 0; i < s.length(); i++) {
            int temp = (int)s.charAt(i) + n;
            if(temp > 90 && 64 < temp-n && temp-n < 91) temp -= 26;
            else if(temp > 122 && 96 < temp-n && temp-n < 123) temp -= 26;
            if(temp-n == 32) temp -= n;
            
            answer += (char)temp;
        }
        return answer;
    }
}