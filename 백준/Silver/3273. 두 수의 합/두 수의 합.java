import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

import static java.lang.Math.*;

public class Main {

    static int N, X;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        X = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        int s = 0; int e = N-1; int sum = 0; int ans = 0;

        while(s < e){
            sum = arr[s] + arr[e];
            if(sum == X) ans++;
            if(sum <= X) s++;
            else e--;
        }

        br.close();
        System.out.print(ans);

    }


}
