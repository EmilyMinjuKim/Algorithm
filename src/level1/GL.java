package level1;

import java.util.Arrays;
import java.util.Scanner;

public class GL {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		Calculator cal = new Calculator();
		System.out.println(Arrays.toString(cal.solution(a, b)));
		
	}

}

class Calculator{
	public int[] solution(int n, int m) {
		int[] answer = new int[2];
		int lcm = n*m;
		
		answer[0] = gcd(n, m);
		answer[1] = n*m/answer[0];
		
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
