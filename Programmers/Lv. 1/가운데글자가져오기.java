class Solution {
    public String solution(String s) {
        char[] c;
        if(s.length() % 2 == 0) {
            c = new char[2];
            c[0] = s.charAt(s.length() / 2 - 1) ;
            c[1] = s.charAt(s.length() / 2);
        }
        else {
            c = new char[1];
            c[0] = s.charAt(s.length() / 2);
        }
        
        String answer = String.valueOf(c);
        return answer;
    }
}