package level1;

//주어진 숫자 내에서 소수의 갯수 구하

class PNum {

	public static void main(String[] args) {
		
		Num sol = new Num();
		System.out.println(sol.solution(10));
		
	}
}

class Num {

    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            arr[i] = i;
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 2; i*j<=n; j++) {
                if(arr[i]==0){ 
                    break;}
                else{
                arr[i*j]=0; 
                }
            }
            if (arr[i] != 0) {
                answer++; 
           }
        }
        return answer;
    }
}
