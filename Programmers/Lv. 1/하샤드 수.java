import java.util.*;

public class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int a = x;

        while(a!=0) {
             sum += a%10;
             a = a/10;
        }

        return x % sum == 0 ? true : false;
    }
}