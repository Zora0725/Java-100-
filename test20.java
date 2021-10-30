
import java.util.Scanner;

public class test20 {

	public static void main(String[] args) {
		
		
		int apple, people = 7, q, r;
		
		System.out.println(people + "人分蘋果，要分幾個蘋果？");
		Scanner sc = new Scanner(System.in); //由System.in 取得輸入
		apple = sc.nextInt();
		
		q = apple / people; //取商數
		r = apple % people; //取餘數
		
		System.out.println(people + "人分" + "apple" + "個蘋果,");
		System.out.println("每人分" + q + "個, 還剩" + r + "個");
		
		sc.close();
		
		
	}

}
