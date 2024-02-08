import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static String isValid(String s) {
        Stack<Character> stack = new Stack<>();
        String answer = "YES";
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(c); //'('가 들어올 경우
            else {
                if (stack.isEmpty()) { //비어있을 경우
                    answer = "NO";
                    break;
                }
                stack.pop();
            }
        }
        if (!stack.isEmpty()) answer = "NO";
        stack.clear();
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(isValid(sc.next()));
        }
    }
}