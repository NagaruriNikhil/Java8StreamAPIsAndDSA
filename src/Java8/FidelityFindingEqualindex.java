package Java8;

public class FidelityFindingEqualindex {

	
	public static int indexofequalsum(int[] a) {
		int l=0;
		int sum = 0;
		int r=0;
		for(int i: a) {
			sum += i;
		}
		for(int i=0; i< a.length;i++) {
			 r= sum-l-a[i];
			if(l== r) {
				return i;
			}
			l += a[i];
		}
		
		return -1;
					
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Check for index with equal sum "+ indexofequalsum(new int[]{1,7,3,6,5,6}));
	}

}
