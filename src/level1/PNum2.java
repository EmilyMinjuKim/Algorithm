package level1;

import java.util.Scanner;

//주어진 범위 내의 소수 구하기 

class PNum2 {

	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        
	        int n = sc.nextInt();
	        int m = sc.nextInt();
	        
	        boolean[] check = new boolean[m+1];
	        
	        check[0] = check[1] = true;
	        
	        for (int i=2; i*i <= m; i++) {
	            if (check[i] == true) {
	                continue;
	            }
	            for (int j=i+i; j<=m; j+=i) {
	                check[j] = true;
	            }
	        }
	        
	        for (int i=n; i<=m; i++) {
	            if (check[i] == false) {
	                System.out.println(i);
	            }
	        }
	    }
	
}

