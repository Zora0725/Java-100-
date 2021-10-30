
public class test9 {

	public static void main(String[] args) {
	
		for (int j = 1; j <= 9; j++) {
			
			// In row i, output each j.
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%3d", j * i);
			}
			System.out.printf("\n");
		}
		
	}

}