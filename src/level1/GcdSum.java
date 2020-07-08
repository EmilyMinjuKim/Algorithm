package level1;

//양의 정수 n개가 주어졌을 때, 가능한 모든 쌍의 GCD합을 구하는 프로그램
//첫 줄에 테스트 케이스의 개수 t(1~100)가 주어진다. 각 테스트 케이스는 한 줄.
//각 테스트 케이스의 수n)가 주어지고, 다음에는 n개의 수가 주어진다.

import java.util.Scanner;

public class GcdSum {
	
	public static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		} else {
			return gcd(b, a%b);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); 
		
		while(t-- > 0) {
			int n = sc.nextInt();
			
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			
			long sum = 0;
			for (int i = 0; i < n-1; i++) {
				for (int j = i+1; j < n; j++) {
					sum += gcd(arr[i], arr[j]);
				}
			}
			System.out.println(sum);
		}

	}

}
