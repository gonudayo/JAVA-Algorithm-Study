import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] temp = new int[1000000];
        int N = 0;
        temp[0] = arr[0];
        
        for(int i = 1; i < arr.length; i++) {
            if(temp[N] != arr[i]) {
                N++;
                temp[N] = arr[i];
            }
        }
        
        int[] answer = new int[N + 1];
        for(int i = 0; i < N + 1; i++) {
            answer[i] = temp[i];
        }
    
        return answer;
    }
}