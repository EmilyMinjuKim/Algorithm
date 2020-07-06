package level1;

import java.util.Arrays;

class Main {

	public static void main(String[] args) {
		
		GcdLcm sol = new GcdLcm();
		System.out.println(Arrays.toString(sol.solution(3, 12)));
		
	}
}

class GcdLcm {
	  public int[] solution(int n, int m) {
	      int[] answer = new int[2];
	      int lcm = n*m;
	      
	      answer[0] = gcd(n, m);
	      answer[1] = lcm / answer[0];
	   
	      return answer;
	      
	}
	 
	  
	  public int gcd(int a, int b) {
		  if(b == 0) {
			  return a;
		  } else {
			  return gcd(b, a%b);
		  }
	  }
}
