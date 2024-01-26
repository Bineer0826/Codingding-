import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //0<K<=20 , K번째 피보나치 수 = n-1 번째 수 + n-2번째 수
        // 점화식 이용

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine()); //문자열에서 int형으로 바꿔준다.
        System.out.println(Fibo(K));
        }

        //Fibo 함수 정의
        static int Fibo(int K) {
        // n==0
            if (K==0) return 0;
            if (K==1) return 1;
            return Fibo(K - 1) + Fibo(K - 2);
        }


    }
