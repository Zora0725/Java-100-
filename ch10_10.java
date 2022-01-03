// 一般數學方法應用

public class ch10_10 {
	public static void main(String[] args) {
		// 開根號值
		double x = 4.0;
		System.out.println("sqrt(4.0)的值是 : " + Math.sqrt(x));
		
		// 立方根值
		double y = 8.0;
		System.out.println("cbrt(8.0)的值是 : " + Math.cbrt(y));
		
		// 回傳x的y次方值
		double a = 3.0;
		System.out.println("pow的值是 : " + Math.pow(a, 4));
		
		// 回傳自然對數e的x次方值
		double b = 2.0;
		System.out.println("exp的值是 : " + Math.exp(b));
		
		// 回傳e為底的x對數值
		double c = 2.7;
		System.out.println("log的值是 : " + Math.log(c));
		
		// 回傳10為基底的x對數值
		double d = 10.0;
		System.out.println("log10(10.0)的值是 : " + Math.log10(d));
		
	}
}