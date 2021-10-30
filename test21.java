import java.util.Scanner;

public class test21 {

	public static void main(String[] args) {
		
		System.out.println("請輸入現在的油量（單位：公升） : ");
		
		Scanner sc = new Scanner(System.in); //輸入資料而加入的程式
		int liter = sc.nextInt(); //輸入整數資料
		
		if (liter < 2)
			System.out.println("油量不足，該加油了！");
		
		System.out.println("祝您行車愉快！");
		
		sc.close();
		
	}

}
