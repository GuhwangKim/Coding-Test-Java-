package programmers_lv1;

public class Solution35 {
	public String solution(int num) {
        String answer = "";
        
        if(num%2==0) {
        	answer="Even";
        } else {
        	answer="Odd";
        }
        return answer;
    }
}
