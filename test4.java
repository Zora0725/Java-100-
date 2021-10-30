import java.util.Scanner;
public class test4 {

	public static void main(String[] args) {
		
		// to do
		// (1) generate two random integers
		
		int x = (int) (Math.random() *10);
		int y = (int) (Math.random() *10);
		
		// (2) Display the math qestion
		System.out.println(x + " + " + y + "= ? ");
		
		// (3) User input
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		
		// (4) Judge the input
		if (answer == x + y) {
			System.out.println("Correcet");
		} else {
			System.out.println("Wrong.");
			System.out.println("The answer is " + (x + y) + ".");
		}
		
		input.close();
		
	}

}