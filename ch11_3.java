import java.util.*;
public class ch11_3 {
	public static void main(String[] args) {
		long startDate, endDate;
		final int password = 70;
		int num;
		Scanner scanner = new Scanner(System.in);
		startDate = System.currentTimeMillis();
		for (; ;) {
			System.out.print("�вq 0-99 ���Ʀr");
			num = scanner.nextInt();
			if (num == password) {
				System.out.print("���ߵ���F!");
				endDate = System.currentTimeMillis();
				break;
			}
			System.out.println("�q���F!�ЦA���@��!");
			
		}
		System.out.printf("�Ҫ�ɶ��� %d �@��" + (endDate - startDate));
	}

}
