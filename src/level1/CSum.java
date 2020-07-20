package level1;

import java.util.Scanner;

/*
 * 1912번 
 * n개의 정수로 이루어진 임의의 수열이 주어진다. 이 중 연속된 몇 개의 수를 선택해서 구할 수 있는 합 중 가장 큰 합을 구하려고 한다. 
 * 단, 수는 한 개 이상 선택해야 한다.
 * 
 * 첫째 줄에 정수 n(1 ≤ n ≤ 100,000)이 주어지고 둘째 줄에는 n개의 정수로 이루어진 수열이 주어진다. 
 * 수는 -1,000보다 크거나 같고, 1,000보다 작거나 같은 정수이다.
 * */

public class CSum {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        int[] d = new int[n];
        for (int i=0; i<n; i++) {
            d[i] = a[i];
            if (i == 0) {
                continue;
            }
            if (d[i] < d[i-1] + a[i]) {
                d[i] = d[i-1] + a[i];
            }
        }
        
        int ans = d[0];
        for (int i=0; i<n; i++) {
            if (ans < d[i]) {		//최대값 찾기
                ans = d[i];
            }
        }
        System.out.println(ans);
    }
}
