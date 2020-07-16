package level1;

import java.util.Scanner;

//1309

public class Zoo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[][] d = new int[n+1][3];							//d[0][0] = 1로 초기화 해놓고 for문을 1~n까지 돌리려고 
		d[0][0] = 1;													//초기화 
		for (int i = 1; i <= n; i++) {
			d[i][0] = d[i-1][0] + d[i-1][1] + d[i-1][2];
			d[i][1] = d[i-1][0] + d[i-1][2];
			d[i][2] = d[i-1][0] + d[i-1][1];
		}
		
		int ans = 0;
		for (int i = 0; i < 3; i++) {
			ans += d[n][i];
		}
		
		System.out.println(ans%9901);
	}

}
