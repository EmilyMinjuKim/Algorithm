package level1;

import java.util.Scanner;

/*1476번 
 * 수 3개를 이용해서 연도를 나타낸다. (1 ≤ E ≤ 15, 1 ≤ S ≤ 28, 1 ≤ M ≤ 19) 
 * 1년은  1 1 1로 나타낼 수 있다. 1년이 지날 때마다, 세 수는 모두 1씩 증가한다. 만약, 어떤 수가 범위를 넘어가는 경우에는 1이 된다.
 * 예를 들어, 15년은 15 15 15로 나타낼 수 있다. 
 * 하지만, 1년이 지나서 16년이 되면 16 16 16이 아니라 1 16 16이 된다. 이유는 1 ≤ E ≤ 15 라서 범위를 넘어가기 때문이다.
 * 
 * 첫째 줄에 세 수 E, S, M이 주어진다. 우리가 알고 있는 연도로 몇 년인가? 
 * */

public class Date {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int E = sc.nextInt();
		int S = sc.nextInt();
		int M = sc.nextInt();
		int e=1, s=1, m=1;
		for (int i = 1; ; i++) {
			if(e==E && s==S && m==M) {
				System.out.println(i);
				break;
			}
			e += 1;
			s += 1;
			m += 1;
			if (e == 16) {
				e = 1;
			}
			if (s == 29) {
				s = 1;
			}
			if (m == 20) {
				m = 1;
			}
		}

	}

}
