package programmers_lv1;

public class Solution32 {
	public double solution(int[] arr) {
        double answer = 0;
        
        double sum=0;
        
        for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
        
        answer=sum/arr.length;
        
        return answer;
    }
}
