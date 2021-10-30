import java.io.*;
public class test26 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new
			BufferedReader (new InputStreamReader(System.in));
		
		System.out.println("請輸入想要選購的電影票種類");
		System.out.print("1.全票(300) 2.優待票(270) 3. 早鳥票(240)");
		
		String str = br.readLine(); // 輸入票種
		int option = Integer.parseInt(str);
		
		System.out.print("請輸入購入張數");
		str = br.readLine();
		int num = Integer.parseInt(str);
		
		int price; // 電影票單價
		switch(option) { // 依據票種取得單價
			default:
			case 1: // 全票300
				price = 300;
				break;
			case 2: // 優待票
				price = 270;
				break;
			case 3: // 早鳥票
				price = 240;
				break;
		
	}
		
		System.out.println("總價 : " + (price * num));

	}

}
