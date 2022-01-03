import java.util.*;
public class ch11_3 {
	public static void main(String[] args) {
		long startDate, endDate;
		final int password = 70;
		int num;
		Scanner scanner = new Scanner(System.in);
		startDate = System.currentTimeMillis();
		for (; ;) {
			System.out.print("請猜 0-99 的數字");
			num = scanner.nextInt();
			if (num == password) {
				System.out.print("恭喜答對了!");
				endDate = System.currentTimeMillis();
				break;
			}
			System.out.println("猜錯了!請再答一次!");
			
		}
		System.out.printf("所花時間為 %d 毫秒" + (endDate - startDate));
	}

}
