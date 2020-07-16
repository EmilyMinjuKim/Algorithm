package level1;

import java.util.Scanner;

/*
 가장 긴 증가하는 부분 수열 11053번
 
수열 A = {10, 20, 10, 30, 20, 50} 인 경우에 가장 긴 증가하는 부분 수열은 A = {10, 20, 10, 30, 20, 50} 이고, 길이는 4이다.
첫째 줄에 수열 A의 크기 N (1 ≤ N ≤ 1,000)이 주어진다.
둘째 줄에는 수열 A를 이루고 있는 Ai가 주어진다. (1 ≤ Ai ≤ 1,000)
첫째 줄에 수열 A의 가장 긴 증가하는 부분 수열의 길이를 출력한다.
 */
public class LIS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		int[] d = new int[n];
		for (int i = 0; i < n; i++) {
			d[i] = 1;
			for (int j = 0; j < i; j++) {
				if(a[j] < a[i] && d[i] < d[j] + 1) {
					d[i] = d[j] + 1;
				}
			}
		}
		
		int ans = d[0];
		for (int i = 0; i < n; i++) {			//max값 찾기 
			if(ans < d[i]) {
				ans = d[i];
			}
		}
		System.out.println(ans);
	}

}
