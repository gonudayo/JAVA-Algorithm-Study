class Solution {
    public int[] solution(int[] arr, int divisor) {
        int cnt = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                cnt++;
            }
        }
        
        if(cnt == 0) {
            int[] answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        int[] answer = new int[cnt];
        
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                answer[--cnt] = arr[i];
            }
        }
        
        for(int i = 0; i < answer.length; i++) {
            for(int j = i + 1; j < answer.length; j++) {
                if(answer[i] > answer[j]) {
                    int temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;
                }
            }
        }
        
        return answer;
    }
}