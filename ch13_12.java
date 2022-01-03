
public class ch13_12 {
	public static void main(String[] args) {
		String str = "South-Taiwan University of Science and Technology";
		System.out.println("iじ瞷竚 : " + str.indexOf("i"));
		System.out.println("iじ程瞷竚 : " + str.lastIndexOf("i"));
		System.out.println("iじindex = 5 癬程瞷竚 : " + str.indexOf("i", 5));
		System.out.println("iじindex = 5 癬程瞷竚 : " + str.lastIndexOf("i", 5));
		System.out.println("iじindex = 7 癬程瞷竚 : " + str.indexOf("i", 7));
		System.out.println("iじindex = 7 癬程瞷竚 : " + str.lastIndexOf("i", 7));
		System.out.println("kじ程瞷竚 : " + str.indexOf("k"));
		System.out.println("kじ程瞷竚 : " + str.lastIndexOf("k")); // ⊿Τ杠肚-1
	}

}
