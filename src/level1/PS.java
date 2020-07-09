package level1;
//괄호문자
//입력의 첫 번째 줄에는 입력 데이터의 수를 나타내는 정수 T가 주어진다. 
//각 테스트 데이터의 첫째 줄에는 괄호 문자열이 한 줄에 주어진다. 하나의 괄호 문자열의 길이는 2 이상 50 이하이다. 

import java.util.*;

public class PS {
	
    public static String isValid(String s) {
        int n = s.length();		//문자열 길이 
        int cnt = 0;		//스텍 
        for (int i=0; i<n; i++) {
            if (s.charAt(i) == '(') {
                cnt += 1;
            } else {
                cnt -= 1;
            }
            if (cnt < 0) {
                return "NO";
            }
        }
        if (cnt == 0) {
            return "YES";
        } else {
            return "NO";
        }
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();		//int값만 입력받음 
        while (n-- > 0) {
            System.out.println(isValid(sc.next()));		//공백 이전까지의 문자열을 입력받음 
        }
    }
}
