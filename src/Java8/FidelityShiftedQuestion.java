package Java8;

public class FidelityShiftedQuestion {

	
	public static boolean shared(String s1, String s2) {
		
		if(s1.length() != s2.length()) {
			return false;
		}
		String s3 = s1 + s1;
		
		
		return s3.contains(s2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Check if s2 is rotatable of s2"+ shared("abcde", "defabc"));
	}

}
