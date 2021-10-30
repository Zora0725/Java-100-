import java.util.Scanner;

public class test24 {

	public static void main(String[] args) {
		
		// default
		
	System.out.println("要買什麼票 (1.全票 2.優待票 3.星光票) ?");
	
	Scanner sc = new Scanner(System.in);
	int choice = sc.nextInt();
	
	switch (choice) {
	
	case 1:
		System.out.println("全票 399");
		break;
		
	case 2:
		System.out.println("優待票 199");
		break;
		
	case 3:
		System.out.println("星光票 249");
		break;
		
	default:
		System.out.println("輸入錯誤");
	
	}
	
	sc.close();
		

	}

}
