package testTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test10 {
	public static void main(String[] args) throws IOException {
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String gender;
		
		System.out.println("input gender : "); gender=br.readLine();
		
		String gender1=gender=="M"?"����":"����";
		
		System.out.println(gender1);
		
}
}
