import java.util.Scanner;

public class test7tatol {
	
	public static void main(String[] args) {
		
		int total = 0 , price = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter price?");
		price = input.nextInt();
		
		if (price > 0) {
			total = total + price;
			System.out.println("Enter price?");
			price = input.nextInt();
			
		}
		
		System.out.println("Total = " + total);
		input.close();
		
	}

}
