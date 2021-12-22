
public class ParkFeeif {

	public static void main(String[] argv) {
		
		int hours = 0;
		int fee = 0;
		
		// 轉換 int
		hours = Integer.parseInt(argv[0]);
		
		if(hours > 6) { //停車時間大於6小時
			fee += (hours - 6) * 100;
			hours = 6;
		}
		
		if(hours > 4) { // 4-6小時
			fee += (hours - 4) * 80;
			hours = 4;
		}
		
		if(hours > 2) { // 2-4小時
			fee+= (hours - 2) * 50;
			hours = 2;
		}
		
		if(hours > 0) { // 2小時以內
			fee += (hours - 0) * 30;
			hours = 0;
		}
		
		System.out.println("停車時數:" + argv[0] + "小時");
		System.out.println("應繳費用:" + fee + "元整");

	}

}
