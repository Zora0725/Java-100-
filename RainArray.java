
public class RainArray {
	
	public static void main(String[] args) {
		String[] city = {"台北", "基隆", "宜蘭"};
		double[][] rain = // 月平均雨量
				// 一月    二月   三月   四月   五月   六月
			{{83.2, 170.3, 180.4, 177.8, 234.5, 325.9}, // 台北
			{331.6, 397.0, 321.0, 242.0, 285.1, 301.6}, // 基隆
			{147.0, 182.3, 127.5, 138.4, 211.7, 214.2}}; // 宜蘭
		
		int indexMin = 0, indexMax = 0; // 設定預設值
		
		// 找各月份雨量最低最高者
		for(int month = 0; month < 6; month++) {
			for(int i = 0; i < rain.length; i++) { // 找最低 最高平均雨量
				if(rain[i][month] < rain[indexMin][month])
					indexMin = i;
				
				if(rain[i][month] > rain[indexMax][month])
					indexMax = i;
			}
			
			System.out.println((month + 1) + "月平均雨量最低:" + city[indexMin] + "\t最高:" + city[indexMax]);
			
			
		}
		
	}

}
