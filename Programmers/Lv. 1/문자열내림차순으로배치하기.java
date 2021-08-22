import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
      String str[] = s.split(""); //문자열 s를 하나씩 잘라서 문자열 배열 str에 저장한다.
      Arrays.sort(str); //문자열 배열 str을 오름차순으로 정렬한다.
      Collections.reverse(Arrays.asList(str)); //문자열 배열 str을 뒤집는다.
                 
      return String.join("",str); //원소 사이에 ""을 추가하여 배열을 문자열로 나열한다 ex) String.join(",",str)이면 "바나나,사과,망고" 이런식으로 ','가 추가되어 원소들이 나열된다.
    }
}