import java.util.HashMap;

class Solution {
    public int solution(int[][] passwords, String s) {
        HashMap<Integer, Integer> HM = new HashMap<Integer, Integer>();
        
        for (int[] number : passwords) HM.put(number[0], number[1]);
        
        int temp = 0;
        int key = 0;
        int cnt = 0;
        
        for(int i = 0; i < s.length(); i++){
            String temp_s = s;
            if(s.charAt(i) == '#') {
                if(key == 1) {
                    if(HM.containsValue(Integer.parseInt((temp_s.substring(temp, i))))) cnt++;
                    key = 0;
                }
                else {
                    if(HM.containsKey(Integer.parseInt((temp_s.substring(temp, i))))) key = 1;
                }
                temp = i + 1;
            }
        }
        
        return cnt;
    }
}