package level1;

/*3085번 
 * 첫째 줄에 보드의 크기 N이 주어진다. (3 ≤ N ≤ 50) N×N크기에 사탕을 채워 놓는다.
 * 다음 N개 줄에는 보드에 채워져 있는 사탕의 색상이 주어진다. 빨간색은 C, 파란색은 P, 초록색은 Z, 노란색은 Y로 주어진다.
 * 사탕의 색이 다른 인접한 두 칸을 고르고 사탕을 서로 교환한다. 
 * 모두 같은 색으로 이루어져 있는 가장 긴 연속 부분(행 또는 열)을 고른 다음 그 사탕을 모두 먹는다.
 * 
 * 먹을 수 있는 사탕의 최대 개수는? 
 * */

import java.util.Scanner;

public class Candy {
	static int check(char[][] a) {
		int n = a.length;
		int ans = 1;
		for (int i = 0; i < n; i++) {
			int cnt = 1;
			for (int j = 1; j < n; j++) {
				if(a[i][j] == a[i][j-1]) {
					cnt += 1;
				} else {
					cnt = 1;
				}
				if(ans < cnt) ans = cnt;
			}
			cnt = 1;
			for (int j = 1; j < n; j++) {
				if(a[j][i] == a[j][i-1]) {
					cnt += 1;
				} else {
					cnt = 1;
				}
				if(ans < cnt) ans = cnt;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[][] a = new char[n][n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.next().toCharArray();
		}
		int ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(j+1 < n) {
					char t = a[i][j]; a[i][j] = a[i][j+1]; a[i][j+1] = t;
					int temp = check(a);
					if(ans < temp) ans = temp;
					t = a[i][j]; a[i][j] = a[i][j+1]; a[i][j+1] = t;
				}
				if(i+1 < n) {
					char t = a[i][j]; a[i][j] = a[i][i+1]; a[i][i+1] = t;
					int temp = check(a);
					if(ans < temp) ans = temp;
					t = a[i][j]; a[i][j] = a[i][i+1]; a[i][i+1] = t;
				}
			}
			System.out.println(ans);
		}
	}

}
