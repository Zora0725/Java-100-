
public class ch10_11_pow {
	public static void main(String[] args) {
		double rate = 0.06; // 利率
		double capital = 1000000; // 本金
		double capitalinfo;
		
		for (int i = 1; i <= 20; i++) {
			capitalinfo = capital * Math.pow((1.0 + rate), i);
			System.out.printf("第 %2d 後的本金和是 %10.2f\n", i, capitalinfo);
			
		}
	}

}
