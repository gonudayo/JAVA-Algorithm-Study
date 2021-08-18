/*
https://velog.io/@gonudayo/Java-정렬-프로그래머스-가장-큰-수/
*/

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

class Solution {
	public String solution(int[] numbers) {
        String answer = "";
        List<String> list = new ArrayList<String>();
        
        for(int a : numbers) list.add(String.valueOf(a));

		Collections.sort(list, new numbersComparator());

		if(list.get(0).equals("0")) return "0";
		
		for (String a : list) answer += a;
        
		return answer;
	}
}

class numbersComparator implements Comparator<String> {
    @Override
	public int compare(String a, String b) {
        return ((b + a).compareTo(a + b));
    }
}