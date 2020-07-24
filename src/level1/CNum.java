package level1;

/*1748번 수 이어 쓰기1
 * 1부터 N까지의 수를 이어서 쓰면 다음과 같이 새로운 하나의 수를 얻을 수 있다.
 * 1234567891011121314151617181920212223...
 * 이렇게 만들어진 새로운 수는 몇 자리 수일까? 
 * 
 * 첫째 줄에 N(1≤N≤100,000,000)이 주어진다.
 * */

import java.util.Scanner;

public class CNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ans = 0;
		for (int start = 1, len = 1; start <= n; start *= 10, len++) {
			int end = start*10 - 1;
			if(end > n) {
				end = n;
			}
			ans += (long)(end - start + 1) * len;
		}
		System.out.println(ans);
		
		
	}

}
