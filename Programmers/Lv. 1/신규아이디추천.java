import java.util.*;

class Solution {
    public String solution(String new_id) {
        String answer = "";
        answer = new_id;
        
        //1단계
        answer = answer.toLowerCase();
        //2단계
        answer = answer.replaceAll("[^a-z0-9._-]", "");
        //3단계
        answer = answer.replaceAll("[.]{2,}", ".");
        //4단계
        if(answer.charAt(0) == '.') answer = answer.substring(1);
        if(answer.length() > 1 && answer.charAt(answer.length() - 1) == '.') answer = answer.substring(0, answer.length() - 1);
        //5단계
        if(answer.length() == 0) answer = "a";
        //6단계
        if(answer.length() >= 16) answer = answer.substring(0, 15);
        if(answer.charAt(answer.length() - 1) == '.') answer = answer.substring(0, answer.length() - 1);
        //7단계
        if(answer.length() <= 2) while(answer.length() < 3) answer = answer + answer.charAt(answer.length() - 1);
        
        return answer;
    }
}