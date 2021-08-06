class Solution {
    public long solution(long n) {
        return (double)Math.sqrt(n)  == (long)Math.sqrt(n) ? (long)((Math.sqrt(n) + 1) * (Math.sqrt(n) + 1)) : -1;
    }
}