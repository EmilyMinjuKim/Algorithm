package level1;

import java.util.Scanner;

/*
0과 1로만 이루어진 이진수면서 다음 조건을 만족하면 이친수(pinary number)라 한다. 
1. 이친수는 0으로 시작하지 않는다.
2. 이친수에서는 1이 두 번 연속으로 나타나지 않는다. 즉, 11을 부분 문자열로 갖지 않는다.

N자리 이친수의 개수를 구하시오 (1 ≤ N ≤ 90)
*/

public class PinaryNum {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] d = new long[n+1];
		d[1] = 1;
		if(n >= 2) {
			d[2] = 1;
		}
		for (int i = 3; i <= n; i++) {
			d[i] = d[i-1] + d[i-2];
		}
		System.out.println(d[n]);
	}
	
}
