class Solution {
    public int[] solution(long n) {
        StringBuffer str = new StringBuffer(Long.toString(n)).reverse();
        int[] answer = new int[str.length()];
        int i = 0;
        
        while(i < str.length()) {
            answer[i++] = Integer.parseInt(str.substring(i-1, i));
        }
        
        return answer;
    }
}