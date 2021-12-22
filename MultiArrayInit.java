
public class MultiArrayInit {

	public static void main(String[] args) {
		
		// 直接配置與設定元素值
		int[][] a = {{1,2,3,4}, {5,6,7,8}};
		
		System.out.println("a 共有" + a.length + "個元素");
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("a [" + i + "] 共有" + a[i].length + "個元素");
			
			for(int j = 0; j < a[i].length; j++)
				System.out.println("a[" + i + "][" + j + "] : " + a[i][j]);
			
		
		}
	}

}
