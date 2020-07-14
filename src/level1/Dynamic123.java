package level1;

import java.util.Scanner;

//정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.

//첫째 줄에 테스트 케이스의 개수 T가 주어진다. 
//각 테스트 케이스는 한 줄로 이루어져 있고, 정수 n이 주어진다. n은 양수이며 11보다 작다.

public class Dynamic123 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] d = new int[11];
		d[0] = 1;
		for (int i = 1; i <= 10; i++) {			//n은 양수이며 11보다 작다.
			for (int j = 1; j <= 3; j++) {
				if(i-j >= 0) {
					d[i] += d[i-j];						//D[n] = D[n-1] + D[n-2] + D[n-3]
				}
			}
		}
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			System.out.println(d[n]);
		}

	}

}
