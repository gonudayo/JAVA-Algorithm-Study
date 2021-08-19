import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        
        for(int i = 0; i < citations.length; i++) {
            int H = citations.length - i; 
            
            if(H <= citations[i]) return H;
        }
        
        return 0;
    }
}