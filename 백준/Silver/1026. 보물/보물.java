import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        //길이 N인 정수 배열A,B -> S = A[0] × B[0] + ... + A[N-1] × B[N-1]
        //S의  최솟값을 얻기 위해 A의 수를 재배열  //B는 재배열 불가
        // N
        // A의 n 수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N]; // A 배열에서 N번으로 배열
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) { // 0번쨰부터 시작하고 N은 A의 인덱스보다 작아야함 -> 증가식
            A[i] = Integer.parseInt(st.nextToken()); // 문자열에서 인트로 변환
        }
        Arrays.sort(A); // A를 오름차순으로 정렬하도록 array.sort()를 썼다. -> 재배열

        Integer[] B = new Integer[N]; // integer는 int와 달리 객체로 저장하므로 B는 재배열 불가능하니 객체로 저장
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) { // B도 동일하게 0부터 인덱스 시작, n보다 인덱스가 작아야 한다
            B[i] = Integer.parseInt(st.nextToken()); // 동일
        }
        Arrays.sort(B, Comparator.reverseOrder()); // B를 내림차순으로 정렬
        // 컬렉션에서 제공해주는 내림차순 Comparator.reverseOrder()를 사용한다
        // 원래도 0~ N번쨰까지 이므로 내림차순이니까 재배열이 아님
        int sum = 0;
        for (int i = 0; i < N; i++) { // A의 가장 작은 값과 B의 가장 큰 값을 곱해서 더하면 된다
            sum += A[i] * B[i];
        }
        System.out.println(sum);
        }   
    }