import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Stack;


//push X: 정수 X를 스택에 넣는 연산이다.
//pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//size: 스택에 들어있는 정수의 개수를 출력한다.
//empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
//top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //변수변환
        StringTokenizer st = null;
        Stack<Integer> stack = new Stack<>(); 

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            switch(st.nextToken()){ // 해당 케이스대로 값을 출력하도록 스위치를 사용
                case "push":
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if(!stack.isEmpty())
                        System.out.println(stack.pop());
                    else
                        System.out.println(-1);
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    if(!stack.isEmpty())
                        System.out.println(0); //값이 비어있으면 0
                    else
                        System.out.println(1); //아니면 1
                    break;
                case "top":
                    if(!stack.isEmpty())
                        System.out.println(stack.peek());
                    else
                        System.out.println(-1);
                    break;
            }
        }
    }
}
