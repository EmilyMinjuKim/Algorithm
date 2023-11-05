import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static int N, M;
    private static int[] A1, A2;
    public static int sol(int n, int[] arr){
        int l = 0; int r = arr.length - 1;

        do{
            int mid = (l + r) / 2;
            if(arr[mid] == n)
                return 1;
            else if (arr[mid] < n)
                l = mid + 1;
            else
                r = mid - 1;
        } while(l <= r);

        return 0;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        A1 = new int[N];
        for(int i = 0; i < N; i++){
            A1[i] = Integer.parseInt(st.nextToken());
        }

        M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        A2 = new int[M];
        for(int i = 0; i < M; i++){
            A2[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A1);

        for(int i = 0; i < M; i++){
            System.out.println(sol(A2[i], A1));
        }

        br.close();

    }


}
