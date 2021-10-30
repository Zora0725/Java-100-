import java.util.Scanner; 
public class test3 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		
		//BMI值
		
		//INPUT
		System.out.println("Enter your name?");
		String name = input.nextLine();
		
		System.out.println("Enter your height(cm)?");
		double height = input.nextDouble();
		
		System.out.println("Enter your weight(kg)?");
		double weight = input.nextDouble();
		
		//Algorithm
		double BMI = 10000 * weight / height / height;
		
		//OUTPUT: name(BMI)
		System.out.println(name + " (" + BMI + ") ");
		input.close();
		
	}

}