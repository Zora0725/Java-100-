
public class MultiArrayInit {

	public static void main(String[] args) {
		
		// �����t�m�P�]�w������
		int[][] a = {{1,2,3,4}, {5,6,7,8}};
		
		System.out.println("a �@��" + a.length + "�Ӥ���");
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("a [" + i + "] �@��" + a[i].length + "�Ӥ���");
			
			for(int j = 0; j < a[i].length; j++)
				System.out.println("a[" + i + "][" + j + "] : " + a[i][j]);
			
		
		}
	}

}
