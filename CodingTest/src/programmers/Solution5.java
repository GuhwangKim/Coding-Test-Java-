package programmers;

public class Solution5 {
	class Solution {
	    public int solution(String s) {
	        int answer = 0;
	        // replace (ġȯ ����, �ٲ� ����) �� ���� �߿� �� ���ڰ� ���ٸ�
	        String[] arr= {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	        
	        for (int i = 0; i < arr.length; i++) {
				s=s.replace(arr[i], String.valueOf(i));
			}
	        answer=Integer.parseInt(s);
	        
	        return answer;
	    }
	}

}