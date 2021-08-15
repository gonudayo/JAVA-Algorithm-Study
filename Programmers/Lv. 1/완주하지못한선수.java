/*
https://velog.io/@gonudayo/Java-해시-프로그래머스-완주하지-못한-선수/
*/
import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> HM = new HashMap<>();
        
        for (String name : participant) HM.put(name, HM.getOrDefault(name, 0) + 1);
        
        for (String name : completion) HM.put(name, HM.get(name) - 1);
        
        for (String key : HM.keySet()) {
            if (HM.get(key) != 0) {
                answer = key; 
                break; 
            } 
        } 
        
        return answer;
    }
}