
public class Factory {

	public static void main(String[] argv) {
		
		double fact = 1;
		int i = 5;
		
		if(argv.length > 0) // �p�G���]�w�R�O�C�Ѽ�
			i = Integer.parseInt(argv[0]); // �N�Ʀr�c�����r���ഫ���ƭ�int
		
		System.out.println(i + "!=");
		for(;i > 0; i--)
			fact *= i;
		System.out.println(fact);

	}

}
