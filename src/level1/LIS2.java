package level1;

import java.util.Scanner;

/*
 가장 긴 증가하는 부분 수열 14002번
 
수열 A = {10, 20, 10, 30, 20, 50} 인 경우에 가장 긴 증가하는 부분 수열은 A = {10, 20, 10, 30, 20, 50} 이고, 길이는 4이다.
첫째 줄에 수열 A의 크기 N (1 ≤ N ≤ 1,000)이 주어진다.
둘째 줄에는 수열 A를 이루고 있는 Ai가 주어진다. (1 ≤ Ai ≤ 1,000)

첫째 줄에 수열 A의 가장 긴 증가하는 부분 수열의 길이를 출력한다.
둘째 줄에는 가장 긴 증가하는 부분 수열을 출력한다. 그러한 수열이 여러가지인 경우 아무거나 출력한다.
 */
public class LIS2 {

	static int[] a;
    static int[] d;
    static int[] v;
    static void go(int p) {
        if (p == -1) return;
        go(v[p]);
        System.out.print(a[p] + " ");
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        d = new int[n];
        v = new int[n];
        for (int i=0; i<n; i++) {
            d[i] = 1;
            v[i] = -1;
            for (int j=0; j<i; j++) {
                if (a[j] < a[i] && d[i] < d[j]+1) {
                    d[i] = d[j]+1;
                    v[i] = j;
                }
            }
        }
        int ans = d[0];
        int p = 0;
        for (int i=0; i<n; i++) {
            if (ans < d[i]) {
                ans = d[i];
                p = i;
            }
        }
        System.out.println(ans);
        go(p);
        System.out.println();
    }

}
