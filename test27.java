
import java.util.Scanner;
public class test27 {

	public static void main(String[] args) {
		
		// 判斷手機序號的製造年份
		
		System.out.print("請輸入序號中的第四碼 -> ");
		Scanner sc = new Scanner(System.in);
		String year = sc.next();
		year = year.toUpperCase();
		
		System.out.print("您的手機製造年份是在 : ");
		
		if (year.equals("M") || year.equals("N"))
			System.out.println("2014年");
			
		else if (year.equals("P") || year.equals("Q"))
			System.out.print("2015年");
		
		else if (year.equals("R") || year.equals("S"))
			System.out.print("2016年");
		else if (year.equals("T") || year.equals("V"))
			System.out.println("2017年");
		else if (year.equals("W") || year.equals("X"))
			System.out.println("2018年");
		else if (year.equals("C") || year.equals("D"))
			System.out.println("2020年");
		else if (year.equals("F") || year.equals("G"))
			System.out.println("2021年");
		else
			System.out.println("您輸入的序號有誤");

		sc.close();
		
	}
	

}
