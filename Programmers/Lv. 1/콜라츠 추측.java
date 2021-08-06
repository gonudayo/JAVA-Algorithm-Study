class Solution {
    public int solution(long num) {
        int k = 0;
        while(num!=1) {
            k++;
            if(num % 2 == 1) num = num * 3 + 1;
            else num /= 2;
            
            if(k == 500) {
                k = -1;
                break;
            }
        }
        return k;
    }
}