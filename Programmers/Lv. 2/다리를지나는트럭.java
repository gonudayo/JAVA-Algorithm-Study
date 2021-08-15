/*
https://velog.io/@gonudayo/Java-큐-프로그래머스-다리를-지나는-트럭/
*/
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;
        Queue<Integer> waiting = new LinkedList<>();
        Queue<Pair> bridge = new LinkedList<>();
        
        for(int i : truck_weights) waiting.offer(i);
        
        while(true) {
            time++;
            
            if(!bridge.isEmpty() && time - bridge.peek().t == bridge_length) {
                weight += bridge.poll().w;
            }
            
            if(!waiting.isEmpty() && waiting.peek() <= weight) {
                bridge.offer(new Pair(waiting.peek(), time));
                weight -= waiting.poll();
            }
            
            if(bridge.isEmpty()) break;
        }
        
        return time;
    }
}
class Pair{
	int w;
	int t;
	Pair(int w,int t){
		this.w = w;
		this.t = t;
	}
}