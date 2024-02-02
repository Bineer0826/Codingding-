import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int n = Integer.parseInt(br.readLine());
        
		// 2원과 5원으로 이루어진 거스름돈 개수 (불가능하면 -1)
		int [] dp = new int[100001];
		
		dp[1] = -1;
		dp[2] = 1;  //2:1, 5:0
		dp[3] = -1;

		for(int i=4; i<=n; i++) {
			int a = i/5;
			int b = i%5;
			
			while(b%2 == 1) { //1개만 남으면 거슬러 줄 수 없으므로 1과 5를 더하여 2로 나눌 수 있도록 함
				a--;
				b += 5;
			}

			b /= 2;
			dp[i] = a + b;		
		}

		
		System.out.println(dp[n]);
	
	}
}
