import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String a = "abcdefghijklmnopqrstuvwxyz";
        int[] cnt = new int[a.length()];
        for(int i = 0; i < input.length(); i++){
            for(int j = 0; j < a.length(); j++){
                if(input.charAt(i) == a.charAt(j)){
                    cnt[j] += 1;
                }
            }
        }
        for(int i = 0; i < cnt.length; i++){
            System.out.print(cnt[i] + " ");
        }
    }


}
