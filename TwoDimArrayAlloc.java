
public class TwoDimArrayAlloc {

	public static void main(String[] args) {
		
		int[][] a = new int[3][];
		for(int i = 0; i < a.length; i++)
			a[i] = new int[4];
		
		System.out.println("a 共有" + a.length + "個元素");
		
		for(int i = 0; i < a.length;i++) {
			System.out.println("a [" + i + "] 共有 " + a[i].length + "個元素");
		}
	}

}
