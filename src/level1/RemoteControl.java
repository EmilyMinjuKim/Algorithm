package level1;

import java.util.Scanner;

/*1107번 리모콘 
 * 100번 채에서 이동하려고 하는 채널은 N이다. 어떤 버튼이 고장났는지 주어졌을 때, 채널 N으로 이동하기 위해서 버튼을 최소 몇 번 눌러야하는지 
 * 구하는 프로그램을 작성하시오. 
 * 
 * 첫째 줄에 채널 N (0 ≤ N ≤ 500,000)이 주어진다.  
 * 둘째 줄에는 고장난 버튼의 개수 M (0 ≤ M ≤ 10)이 주어진다. 
 * 고장난 버튼이 있는 경우에는 셋째 줄에는 고장난 버튼이 주어지며, 같은 버튼이 여러 번 주어지는 경우는 없다.
 * */

public class RemoteControl {

	static boolean[] broken = new boolean[10];
	static int possible(int c) {
		if(c == 0) {
			if(broken[0]) {
				return 0;
			} else {
				return 1;
			}
		}
		
		int len = 0;
		while(c>0) {
			if(broken[c%10]) {
				return 0;
			}
			len += 1;
			c /= 10;
		}
		return len;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			int x = sc.nextInt();
			broken[x] = true;
		}
		
		int ans = n - 100;
		if(ans < 0) {
			ans = -ans;
		}
		
		for (int i = 0; i <= 1000000; i++) {
			int c = i;
			int len = possible(c);
			if(len > 0) {
				int press = c - n;
				if(press < 0) {
					press = -press;
				}
				if(ans > len + press) {
					ans = len + press;
				}
			}
		}
		System.out.println(ans);
	}
	
}
