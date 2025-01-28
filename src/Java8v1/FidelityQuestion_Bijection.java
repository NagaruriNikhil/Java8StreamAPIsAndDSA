package Java8v1;

import java.util.HashMap;
import java.util.HashSet;

public class FidelityQuestion_Bijection {
	
	

	public static boolean str_map(String s1, String s2) {
		
		HashMap<Character, Character> map= new HashMap<>();
		HashSet<Character> set = new HashSet<Character>();
		
		for(int i =0;i< s1.length();i++)
		{
			char c1= s1.charAt(i);
			char c2= s2.charAt(i);
			
			if(map.containsKey(c1)) {
				if(map.get(c1) != c2) {
					return false;
				}
			}
			else {
				if(set.contains(c2)) {
					return false;
				}
				
			}
			map.put(c1, c2);
			set.add(c2);
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("is string abc and def are bijection"+ str_map("def", "aba"));
	}

}
