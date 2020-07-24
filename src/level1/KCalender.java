package level1;

import java.util.*;
import java.io.*;

/*6064번 카잉 달력
 * M과 N보다 작거나 같은 두 개의 자연수 x, y를 가지고 각 년도를 <x:y>와 같은 형식으로 표현. 
 * 첫 번째 해 <1:1>, 두 번째 해 <2:2>. 
 * <x:y>의 다음 해를 표현한 것을 <x':y'>이라고 하자. 만일 x < M 이면 x' = x + 1이고, 그렇지 않으면 x' = 1. 
 * 네 개의 정수 M, N, x와 y가 주어질 때, <M:N>이 카잉 달력의 마지막 해라고 하면 <x:y>는 몇 번째 해를 나타내는지 구하는 프로그램을 작성하라. 
 * 
 * 입력 데이터는 표준 입력을 사용한다. 입력은 T개의 테스트 데이터로 구성된다. 
 * 입력의 첫 번째 줄에는 입력 데이터의 수를 나타내는 정수 T가 주어진다. 각 테스트 데이터는 한 줄로 구성된다. 
 * 각 줄에는 네 개의 정수 M, N, x와 y가 주어진다. (1 ≤ M, N ≤ 40,000, 1 ≤ x ≤ M, 1 ≤ y ≤ N)
 * */

public class KCalender {


	    public static void main(String args[]) throws IOException {
	        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	        int t = Integer.valueOf(bf.readLine());
	        while (t-- > 0) {
	            String[] line = bf.readLine().split(" ");
	            int m = Integer.valueOf(line[0]);
	            int n = Integer.valueOf(line[1]);
	            int x = Integer.valueOf(line[2])-1;
	            int y = Integer.valueOf(line[3])-1;
	            boolean ok = false;
	            for (int k=x; k<(n*m); k+=m) {
	                if (k%n == y) {
	                    System.out.println(k+1);
	                    ok = true;
	                    break;
	                }
	            }
	            if (!ok) {
	                System.out.println(-1);
	            }
	        }
	    }

}
