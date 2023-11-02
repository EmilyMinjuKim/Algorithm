import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        for(int i = 0; i < 3; i++){
            num *= sc.nextInt();
        }
        int[] arr = new int[10];

        while(num > 0){
            arr[num%10] += 1;
            num /= 10;
        }
        for(int i = 0; i < 10; i++){
            System.out.println(arr[i]);
        }
    }


}
