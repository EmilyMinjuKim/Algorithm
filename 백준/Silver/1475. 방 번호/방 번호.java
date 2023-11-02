import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[10];

        while(num > 0){
            arr[num%10] += 1;
            num /= 10;
        }

        int temp = arr[6] + arr[9];
        if(temp%2==0){
            temp = temp/2;
        } else{
            temp = temp/2 + 1;
        }
        arr[6] = arr[9] = temp;

        int max = 0;
        for(int i = 0; i < 10; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }


}
