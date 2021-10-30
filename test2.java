import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		//INPUT
		System.out.println("Enter r?");
		int r = input.nextInt();
		
		
		if(r > 0); {
		// Algorithm
		double A = r * r * 3.14;
		
		//OUTPUT
		System.out.println(A);
		} 	
		
		input.close();
		
		}
}