
public class ch12_14 {
	public static void main(String[] args) {
		String str = "漢皇重色思傾國，御宇多年求不得。楊家有女初長成，養在深閨人未識。\n"
				+ "天生麗質難自棄，一朝選在君王側。回眸一笑百媚生，六宮粉黛無顏色。\n"
				+ "春寒賜浴華清池，溫泉水滑洗凝脂。侍兒扶起嬌無力，始是新承恩澤時。\n"
				+ "雲鬢花顏金步搖，芙蓉帳暖度春宵。春宵苦短日高起，從此君王不早朝。\n";
		
		String s = "媚";
		System.out.println("媚最先出現的位置 : " + str.indexOf(s));
		System.out.println("媚最後出現的位置 : " + str.lastIndexOf(s));
		System.out.println("雲在index = 1起最先出現的位置 : " + str.indexOf(s));
		System.out.println("雲在index = 1起最後出現的位置 : " + str.lastIndexOf(s));
		System.out.println("恩最先出現位置 : " + str.indexOf("恩"));

	}

}
