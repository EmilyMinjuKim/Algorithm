package level1;

import java.util.Scanner;

/*14500번 테트로미노
 * 첫째 줄에 종이의 세로 크기 N과 가로 크기 M이 주어진다. (4 ≤ N, M ≤ 500)
 * 둘째 줄부터 N개의 줄에 종이에 쓰여 있는 수가 주어진다. 
 * i번째 줄의 j번째 수는 위에서부터 i번째 칸, 왼쪽에서부터 j번째 칸에 쓰여 있는 수이다. 입력으로 주어지는 수는 1,000을 넘지 않는 자연수이다.
 * 
 * 첫째 줄에 테트로미노가 놓인 칸에 쓰인 수들의 합의 최댓값을 출력한다.
 * */

public class Tetromino {
    static int[][][] block = {
            {{0,1}, {0,2}, {0,3}},
            {{1,0}, {2,0}, {3,0}},
            {{1,0}, {1,1}, {1,2}},
            {{0,1}, {1,0}, {2,0}},
            {{0,1}, {0,2}, {1,2}},
            {{1,0}, {2,0}, {2,-1}},
            {{0,1}, {0,2}, {-1,2}},
            {{1,0}, {2,0}, {2,1}},
            {{0,1}, {0,2}, {1,0}},
            {{0,1}, {1,1}, {2,1}},
            {{0,1}, {1,0}, {1,1}},
            {{0,1}, {-1,1}, {-1,2}},
            {{1,0}, {1,1}, {2,1}},
            {{0,1}, {1,1}, {1,2}},
            {{1,0}, {1,-1}, {2,-1}},
            {{0,1}, {0,2}, {-1,1}},
            {{0,1}, {0,2}, {1,1}},
            {{1,0}, {2,0}, {1,1}},
            {{1,0}, {2,0}, {1,-1}},
        };
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] a = new int[n][m];
            for (int i=0; i<n; i++) {
                for (int j=0; j<m; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            int ans = 0;
            for (int i=0; i<n; i++) {
                for (int j=0; j<m; j++) {
                    for (int k=0; k<19; k++) {
                        boolean ok = true;
                        int sum = a[i][j];
                        for (int l=0; l<3; l++) {
                            int x = i+block[k][l][0];
                            int y = j+block[k][l][1];
                            if (0 <= x && x < n && 0 <= y && y < m) {
                                sum += a[x][y];
                            } else {
                                ok = false;
                                break;
                            }
                        }
                        if (ok && ans < sum) {
                            ans = sum;
                        }
                    }
                }
            }
            System.out.println(ans);
        }
}
