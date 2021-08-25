import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String LongtoString = String.valueOf(n);//long 형 n을 String으로 변환하여 LongtoString에 저장한다
        
        char[] StringtoChar = LongtoString.toCharArray();//String 형 LongtoString을 Char배열으로 변환하여 StringtoChar에 저장한다
        
        Arrays.sort(StringtoChar);//StringtoChar을 내림차순으로 정렬한다
        
        String ChartoString = new String(StringtoChar);//char 배열인 StringtoChar을 다시 String 형으로 변환하여 ChartoString에 저장한다
        
        String SortedString =  new StringBuilder(ChartoString).reverse().toString();//StringBuilder의 reverse 메소드를 활용해 뒤집어 SortedString에 저장한다
        
        long answer = Long.parseLong(SortedString);//정렬이 끝난 SortedString을 Long형으로 변환하여 answer에 저장한다
        
        return answer;
    }
}