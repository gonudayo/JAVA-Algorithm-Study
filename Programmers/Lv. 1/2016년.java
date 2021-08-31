class Solution {
    public String solution(int a, int b) {
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int k = 0;
        for(int i = 0; i < 12; i++) {
            for(int j = 0; j < month[i]; j++) {
                if(a-1 == i && b-1 == j) return day[k%7];
                k++;
            }
        }
        return "";
    }
}