
public class RainArray {
	
	public static void main(String[] args) {
		String[] city = {"�x�_", "��", "�y��"};
		double[][] rain = // �륭���B�q
				// �@��    �G��   �T��   �|��   ����   ����
			{{83.2, 170.3, 180.4, 177.8, 234.5, 325.9}, // �x�_
			{331.6, 397.0, 321.0, 242.0, 285.1, 301.6}, // ��
			{147.0, 182.3, 127.5, 138.4, 211.7, 214.2}}; // �y��
		
		int indexMin = 0, indexMax = 0; // �]�w�w�]��
		
		// ��U����B�q�̧C�̰���
		for(int month = 0; month < 6; month++) {
			for(int i = 0; i < rain.length; i++) { // ��̧C �̰������B�q
				if(rain[i][month] < rain[indexMin][month])
					indexMin = i;
				
				if(rain[i][month] > rain[indexMax][month])
					indexMax = i;
			}
			
			System.out.println((month + 1) + "�륭���B�q�̧C:" + city[indexMin] + "\t�̰�:" + city[indexMax]);
			
			
		}
		
	}

}
