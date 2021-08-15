/*
https://velog.io/@gonudayo/Java-해시-프로그래머스-전화번호-목록/
*/
import java.util.HashMap;

class Solution {
    public boolean solution(String[] phone_book) {
        HashMap<String, Integer> HM = new HashMap<>();
        for (String number : phone_book) HM.put(number, 1);
        
        for(int i = 0; i < phone_book.length; i++) {
            for(int j = 1; j < phone_book[i].length(); j++) {
                if(HM.containsKey(phone_book[i].substring(0,j))) {
                    return false;
                }
            }
        }

        return true;
    }
}