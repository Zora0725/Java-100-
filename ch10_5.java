
public class ch10_5 {
	public static void main(String[] args) {
		int x1 = 30;
		int x2 = 50;
		int x3 = 80;
		int maxV;
		
		maxV = Math.max(Math.max(x1,  x2), x3);
		System.out.println("三個數值最大值是 : " + maxV);
		double y1 = 5.5;
		double y2 = 3.6;
		double minV;
		minV = Math.min(y1, y2);
		System.out.println("兩個數值的最小值是 : " + minV);
		
	}

}
