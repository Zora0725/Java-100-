
public class FindMinMax {
	
	public static void main(String[] args) {
		int[] temp = {21, 18, 21, 23, 25, 25, 24, 22, 22, 16};
		int min = temp[0];
		int max = temp[0];
		
		for(int i : temp) {
			if(i < min) { //�P�_i�O�_�p��min�̤p��
				min = i; 
			}
			
			if(i > max) {
				max = i;
			}
		}
		
		System.out.println("���x�ثe�̧C�ū׭�:" + min + "��");
		System.out.println("���x�ثe�̰��ݧ���:" + max + "��");
		
	}

}
