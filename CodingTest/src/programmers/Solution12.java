package programmers;

import java.util.Arrays;

public class Solution12 {
	class Solution {
	    public String solution(String[] participant, String[] completion) {
	        String answer = "";
	        Arrays.sort(participant);
	        Arrays.sort(completion);
	        
	        for (int i = 0; i < completion.length; i++) {
				if(!completion[i].equals(participant[i])) {
					answer=participant[i];
					break;
				} 
				if(i==completion.length-1) {
					answer=participant[i+1];
				}
			}
	        	        
	        return answer;
	    }
	}

}
