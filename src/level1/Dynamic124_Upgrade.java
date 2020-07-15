package level1;

import java.util.Scanner;

//정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.
//단, 같은 수를 두 번 이상 연속해서 사용하면 안 된다.

//첫째 줄에 테스트 케이스의 개수 T가 주어진다. 
//각 테스트 케이스는 한 줄로 이루어져 있고, 정수 n이 주어진다. n은 양수이며 100,000보다 작다.

//각 테스트 케이스마다, n을 1, 2, 3의 합으로 나타내는 방법의 수를 1,000,000,009로 나눈 나머지를 출력한다.

public class Dynamic124_Upgrade {
    static final long mod = 1000000009L;
    static final int limit = 100000;
    static long[][] d = new long[limit+1][4];
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        for (int i=1; i<=limit; i++) {
            if (i-1 >= 0) {							//d[0][j]는 초기화 하지 않는다.
                d[i][1] = d[i-1][2] + d[i-1][3];
                if (i == 1) {							//d[1][1] = d[0][2] + d[0][3]을 구할 필요없이 
                    d[i][1] = 1;							//d[1][1] = 1로 초기화. 
                }
            }
            if (i-2 >= 0) {
                d[i][2] = d[i-2][1] + d[i-2][3];
                if (i == 2) {
                    d[i][2] = 1;
                }
            }
            if (i-3 >= 0) {
                d[i][3] = d[i-3][1] + d[i-3][2];
                if (i == 3) {
                    d[i][3] = 1;
                }
            }
//            d[i][1] %= mod;
//            d[i][2] %= mod;
//            d[i][3] %= mod;
        }
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println((d[n][1] + d[n][2] + d[n][3])%mod);
        }
    }

}
