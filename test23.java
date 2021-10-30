import java.util.Scanner;

public class test23 {

	public static void main(String[] args) {
		
		System.out.println("點幾號餐 (1.炸雞餐 2.漢堡餐 3.起司堡餐 4.兒童餐) ? ");
		
		Scanner sc = new Scanner(System.in);
		int food = sc.nextInt();
		
		switch (food) {
		
		case 1:
			System.out.println("您點的餐點價格為 109元");
			break;
			
		case 2:
			
		case 3:
			System.out.println("您的餐點價格為 99元");
			break;
			
		case 4:
			System.out.println("您點的餐點價格為 69元");
			break;
		
		}
		
		sc.close();
		

	}

}
