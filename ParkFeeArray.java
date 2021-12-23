public class ParkFeeArray {
	
	public static void main (String[] args) {
		
		int[] hourTable = {0, 2, 4, 6};
		int[] feeTable = {30, 50, 80, 100};
		
		int hours = Integer.parseInt(args[0]);
		int fee = 0;
		
		int i = hourTable.length - 1;
		while(i > 0) {
			if(hourTable[i] < hours)
				break;
			i--;
			
		while(i >= 0) {
			fee += (hours - hourTable[i]) * feeTable[i];
			hours = hourTable[i];
			i--;
		}
		
		System.out.println("�����ɼ�:" + args[0] + "�p��");
		System.out.println("��ú�O��:" + fee + "����");
		}
		
	}
}
