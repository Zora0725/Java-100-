import java.util.Scanner;

public class test22 {

	public static void main(String[] args) {
		
		System.out.println("請輸入年度考績 (優、甲、乙、丙: ");
		
		Scanner sc = new Scanner(System.in);
		String grade = sc.next();
		
		switch (grade) {
		
		case "優":
			System.out.println("出國去玩");
			break;
			
		case "甲":
			System.out.println("買手機給自己");
			break;
			
		case "丙":
			System.out.println("準備上求職網站找工作");
			break;
			
		
		}
		
		sc.close();

	}

}
