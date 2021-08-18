/*
https://velog.io/@gonudayo/Java-큐-프로그래머스-기능개발/
*/

import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
	    Queue<Integer> Q = new LinkedList<Integer>();
        List<Integer> temp = new ArrayList<Integer>();
        int i;
        int date = 0;
        int cnt = 0;
        
        for(i = 0; i < progresses.length; i++) {
            Q.add(progresses[i]);
        }
        
        
        i = 0;
        while(!Q.isEmpty()) {
            if(Q.peek() + (speeds[i] * date) >= 100) {
                Q.remove();
                i++;
                cnt++;
            }
            else {
                if(cnt != 0) {
                    temp.add(cnt);
                }
                cnt = 0;
                date++;
            }
        }
        temp.add(cnt);
        
        int[] answer = new int[temp.size()];

	    for (i = 0; i < answer.length; i++) {
		    answer[i] = temp.get(i);
	    }
        
        return answer;
    }
}