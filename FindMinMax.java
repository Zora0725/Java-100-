
public class FindMinMax {
	
	public static void main(String[] args) {
		int[] temp = {21, 18, 21, 23, 25, 25, 24, 22, 22, 16};
		int min = temp[0];
		int max = temp[0];
		
		for(int i : temp) {
			if(i < min) { //耞i琌min程
				min = i; 
			}
			
			if(i > max) {
				max = i;
			}
		}
		
		System.out.println("ヘ玡程放:" + min + "");
		System.out.println("ヘ玡程蔼拜ん:" + max + "");
		
	}

}
