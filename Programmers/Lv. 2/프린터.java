/*
https://velog.io/@gonudayo/Java-큐-프로그래머스-프린터/
*/
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Pair> q = new LinkedList<>();
        
        for (int i = 0; i < priorities.length; i++) {
			q.offer(new Pair(i, priorities[i]));
		}
        
        while(!q.isEmpty()) {
            boolean flag = false;
            int prio = q.peek().priority;
            
            for(Pair p : q) {
                if(prio < p.priority) {
                    flag = true;
                }
            }
            
            if(flag) {
                q.offer(q.poll());
                answer++;
            }
            else {
                if(q.poll().location == location) return priorities.length - q.size();
            }
        }

        return answer;
    }
}
class Pair{
	int location;
	int priority;
	Pair(int location,int priority){
		this.location = location;
		this.priority = priority;
	}
}