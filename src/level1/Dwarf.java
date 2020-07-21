package level1;

import java.util.Arrays;
import java.util.Scanner;

/*아홉 개의 줄에 걸쳐 난쟁이들의 키가 주어진다. 
 * 주어지는 키는 100을 넘지 않는 자연수이며, 아홉 난쟁이의 키는 모두 다르며, 가능한 정답이 여러 가지인 경우에는 아무거나 출력한다.
 * 
 * 일곱 난쟁이의 키를 오름차순으로 출력한다. 일곱 난쟁이를 찾을 수 없는 경우는 없다.
 * */

public class Dwarf {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			int n = 9;
			int [] a = new int[n];
			int sum = 0;
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				sum += a[i];
			}
			Arrays.sort(a);
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if(sum - a[i] - a[j] == 100) {
						for (int k = 0; k < n; k++) {
							if(i == k || j == k) continue;
							System.out.println(a[k]);
						}
						System.exit(0);
					}
				}
			}
		}
}
