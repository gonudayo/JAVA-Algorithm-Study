import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        int[] dropFirst = {1, 2, 3, 4, 5};
        int[] dropSecond = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] dropThird = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        
        int[] Score = {0, 0, 0};
        
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == dropFirst[i%5]) Score[0]++;
            if(answers[i] == dropSecond[i%8]) Score[1]++;
            if(answers[i] == dropThird[i%10]) Score[2]++;
        }
        
        int MAX = Math.max(Math.max(Score[0], Score[1]), Score[2]);
        if(MAX == Score[0]) list.add(1);
        if(MAX == Score[1]) list.add(2);
        if(MAX == Score[2]) list.add(3);
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}