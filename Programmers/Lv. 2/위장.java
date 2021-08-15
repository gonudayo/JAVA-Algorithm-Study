/*
https://velog.io/@gonudayo/Java-해시-프로그래머스-위장/
*/
import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> HM = new HashMap<>();
        
        for(int i = 0; i < clothes.length; i++) {
             HM.put(clothes[i][1], HM.getOrDefault(clothes[i][1], 0) + 1);
        }
        
        for(String key : HM.keySet()) {
            answer *= HM.get(key) +1;
        } 
            
        return answer - 1;
    }
}