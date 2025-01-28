package Java8v1;

public class FidelityPalindrome {

	
	public static boolean palindrome(String s) {
		//String s1 = new StringBuilder(s).reverse().toString(); takes more space as we are using reverse method
		
		int left = 0, right= s.length()-1;
		
		while(left < right) {
			if(s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left ++;
			right --;
			
		}
		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Check for palindrome "+ palindrome("abcba"));
	}

}
