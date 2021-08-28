class Solution {
    public int solution(int n) {
        int answer = 0;
        String Ternary = "";
        while(n / 3 != 0) {
            Ternary += n % 3;     
            n /= 3;
        }
        Ternary += n;
        
        int p = 1;
        for(int i = Ternary.length() - 1; i >= 0 ; i--) {
            answer += (Ternary.charAt(i) - '0') * p;
            p *= 3;
        }
        
        return answer;
    }
}