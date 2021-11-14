import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] arr = new int[201];
        List<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                arr[numbers[i] + numbers[j]] = 1;
            }
        }
        for(int i = 0; i < 201; i++) {
            if(arr[i] == 1) result.add(i);
        }
      // List to Array
        int[] answer = new int[ result.size() ];
        for(int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}
