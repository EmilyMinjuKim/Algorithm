package level1;

import java.util.Scanner;

//팩토리얼 0의 개
public class Factorial0 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i=5; i<=n; i*=5) {
            ans += n/i;
        }
        System.out.println(ans);

	}

}
