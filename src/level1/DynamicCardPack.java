package level1;

import java.util.Scanner;

//카드 N개를 구매해야 한다.
//카드팩은 총 N가지 종류가 존재한다.
//i번째 카드팩은 i개의 카드를 담고 있고, 가격은 P[i]원이다.
//카드 N개를 구매하는 비용의 최대값은?

//첫째 줄에 구매하려고 하는 카드의 개수 N이 주어진다. (1 ≤ N ≤ 1,000)
//둘째 줄에는 Pi가 P1부터 PN까지 순서대로 주어진다. (1 ≤ Pi ≤ 10,000)

public class DynamicCardPack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n+1];
		for (int i = 1; i <= n; i++) {
			p[i] = sc.nextInt();
		}
		int[] d = new int[n+1];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if(d[i] < d[i-j] + p[j]) {				//D[N] = max(D[N-i] + p[i])
					d[i] = d[i-j] + p[j];
				}
			}
		}
		System.out.println(d[n]);
	}

}
