class Solution {
    public long solution(int price, int money, int count) {
        long temp = money;
        while(count > 0) temp -= price * count--;
    
        if(temp >= 0) return 0;
        return temp * -1;
    }
}