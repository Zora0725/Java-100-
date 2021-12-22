
public class ArrayIntWithExpr {
	
	public static void main(String[] argv) {
		double[] students = {70, 65, 90, 85, 90};
		double sum = 0;
		
		for (double score : students) { // 使用for迴圈
			sum += score; // 加總
		
		}
		
		double average = sum / students.length; // 計算平均
		System.out.println("平均成績:" + average);
		
	}

}
