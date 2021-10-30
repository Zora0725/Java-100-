import java.io.*;

public class test25 {

	public static void main(String[] args) 
		throws IOException {
			
	BufferedReader br = new
		BufferedReader(new InputStreamReader (System.in));
			
	int i, j, k;
	
	// 輸入第1邊邊長
	System.out.println("請輸入三角形的三邊長 : ");
	System.out.println("邊長 1 >>> ");
	String str = br.readLine();
	i = Integer.parseInt(str);
	
	// 輸入第2邊邊長
	System.out.println("邊長 2 >>>");
	str = br.readLine();
	j = Integer.parseInt(str);
	
	// 輸入第3邊邊長
	System.out.println("邊長 3 >>>");
	str = br.readLine();
	k = Integer.parseInt(str);
	
	if ((i+j) > k) // 判斷第1 2 邊的和是否大於第3邊
		if ((i+k) > j) // 判斷第 1 3 邊的和是否大於第2邊
			if ((j+k) > i) // 判斷第 2 3 邊的和是否大於第3邊
				System.out.println("可以為三角形的三邊長");
			else
				System.out.println("第2 3邊長的和應大於第1邊");
			else
				System.out.println("第 1 3 邊長的和應大於第2邊");
		else
			System.out.println("第1 2 邊長的和應大於第3邊");		
		

	}

}
