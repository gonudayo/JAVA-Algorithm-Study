public class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n);
        char[] arr = str.toCharArray();
        for(int i = 0; i < str.length(); i++) {
            answer += arr[i] - 48;
        }
        return answer;
    }
}