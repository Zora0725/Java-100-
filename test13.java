
public class test13 {

	public static void main(String[] args) {
		
		int i = 1 + 3 * 5 + 7; //先算3*5
		System.out.println("1 + 3 * 5 + 7 = " + i); 
		
		i = (1 + 3) * 5 + 7; //先算 1+3
		System.out.println(" (1+3) * 5 + 7 = " + i);
		
		i = 1 + 3 * (5 + 7); // 先算 5+7
		System.out.println("1 + 3 * (5 + 7) = " + i);
		
		
	}
	
}
