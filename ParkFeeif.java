
public class ParkFeeif {

	public static void main(String[] argv) {
		
		int hours = 0;
		int fee = 0;
		
		// �ഫ int
		hours = Integer.parseInt(argv[0]);
		
		if(hours > 6) { //�����ɶ��j��6�p��
			fee += (hours - 6) * 100;
			hours = 6;
		}
		
		if(hours > 4) { // 4-6�p��
			fee += (hours - 4) * 80;
			hours = 4;
		}
		
		if(hours > 2) { // 2-4�p��
			fee+= (hours - 2) * 50;
			hours = 2;
		}
		
		if(hours > 0) { // 2�p�ɥH��
			fee += (hours - 0) * 30;
			hours = 0;
		}
		
		System.out.println("�����ɼ�:" + argv[0] + "�p��");
		System.out.println("��ú�O��:" + fee + "����");

	}

}
