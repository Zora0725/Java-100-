
public class ArrayIntWithExpr {
	
	public static void main(String[] argv) {
		double[] students = {70, 65, 90, 85, 90};
		double sum = 0;
		
		for (double score : students) { // �ϥ�for�j��
			sum += score; // �[�`
		
		}
		
		double average = sum / students.length; // �p�⥭��
		System.out.println("�������Z:" + average);
		
	}

}
