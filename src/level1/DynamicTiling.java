package level1;

import java.util.Scanner;

//2×n 직사각형을 1×2, 2×1과 2×2 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
//입력: 첫째 줄에 n이 주어진다.
//출력: 2xn 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력. 

public class DynamicTiling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] d = new int[100];
		d[0] = 1;
		d[1] = 1;
		for (int i = 2; i <=n; i++) {
			d[i] = d[i-1] + d[i-2];
		}
		System.out.println(d[n]%10007);
	}

}
