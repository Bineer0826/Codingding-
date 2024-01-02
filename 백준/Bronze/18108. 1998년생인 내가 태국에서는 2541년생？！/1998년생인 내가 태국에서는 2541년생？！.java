import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        //불기년도
         int y = sc.nextInt();
        if(y>1000&&y<3000) {
           //불기년도-543년 = 서기년도
        System.out.println(y-543);
        }
        
		
	}
}