import java.util.Scanner;
import java.io.*;
public class test28 {


	public static void main(String[] args) throws IOException {

		System.out.print("請輸入序號中的第四碼");
		Scanner sc = new Scanner(System.in);
		String year = sc.next();
		year = year.toUpperCase();
		
		switch (year) {
		case "M" : case "N":
			System.out.println("2014年");
			break;
			
		case "P" : case "Q":
			System.out.println("2015年");
			break;
			
		case "R" : case "S":
			System.out.println("2016年");
			break;
		case "T" : case "V":
			System.out.println("2017年");
			break;
			
		case "W" : case "X":
			System.out.println("2018年");
			break;
			
		case "Y" : case "Z":
			System.out.println("2020年");
			break;
			
		case "F" : case "G":
			System.out.println("2021年");
			break;
			
		default:
			System.out.println("您輸入的序號有誤");
			
		}

	}

}
