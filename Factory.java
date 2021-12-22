
public class Factory {

	public static void main(String[] argv) {
		
		double fact = 1;
		int i = 5;
		
		if(argv.length > 0) // 狦Τ砞﹚㏑把计
			i = Integer.parseInt(argv[0]); // 盢计篶Θ﹃锣传计int
		
		System.out.println(i + "!=");
		for(;i > 0; i--)
			fact *= i;
		System.out.println(fact);

	}

}
