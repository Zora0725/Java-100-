
public class FindMinMax {
	
	public static void main(String[] args) {
		int[] temp = {21, 18, 21, 23, 25, 25, 24, 22, 22, 16};
		int min = temp[0];
		int max = temp[0];
		
		for(int i : temp) {
			if(i < min) { //判斷i是否小於min最小值
				min = i; 
			}
			
			if(i > max) {
				max = i;
			}
		}
		
		System.out.println("全台目前最低溫度韋:" + min + "度");
		System.out.println("全台目前最高問杜氏:" + max + "度");
		
	}

}
