import java.util.Arrays;

class Solution {
    public String solution(int[][] scores) {
        String answer = "";
        int[][] studentScores = new int[scores.length][scores.length];
        double[] MAX = new double[scores.length];
        double[] MIN = new double[scores.length];
        Arrays.fill(MIN, 100);
        
        //학생별 점수 분배
        for(int i = 0; i < scores.length; i++) {
            for(int j = 0; j < scores.length; j++) {
                studentScores[j][i] = scores[i][j];
                if(j != i) {
                    MAX[j] = Math.max(MAX[j], scores[i][j]);
                    MIN[j] = Math.min(MIN[j], scores[i][j]);
                }
            }
        }
        
        //최대값 혹은 최소값 제외하고 평균 구하기 (MAX를 분자, MIN을 분모로 활용)
        for(int i = 0; i < scores.length; i++) {
            if(studentScores[i][i] > MAX[i]) {
                studentScores[i][i] = 0;
                MAX[i] = 0;
                MIN[i] = scores.length-1;
                MAX[i] += Arrays.stream(studentScores[i]).sum();
            }
            else if(studentScores[i][i] < MIN[i]) {
                studentScores[i][i] = 0;
                MAX[i] = 0;
                MIN[i] = scores.length-1;
                MAX[i] += Arrays.stream(studentScores[i]).sum();
            }
            else {
                MAX[i] = 0;
                MIN[i] = scores.length;
                MAX[i] += Arrays.stream(studentScores[i]).sum();
            }
            
            double average;
            average = MAX[i] / MIN[i];
        
            answer += 50 > average ? "F" : 70 > average ? "D" : 80 > average ? "C" : 90 > average ? "B" : "A";
        }

        return answer;
    }
}