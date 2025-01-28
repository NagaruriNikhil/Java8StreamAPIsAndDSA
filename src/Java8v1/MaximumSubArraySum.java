package Java8v1;

public class MaximumSubArraySum {

	public static int maxSubArray(int[] a) {
		int maxsum = 0;
		int cursum = 0;
		
		for(int n: a) {
			if(cursum<0) {
				cursum =0;
			}
			cursum += n;
			maxsum = Math.max(maxsum, cursum);
		}
		return maxsum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		System.out.println("Max sum of the subarray in array is "+ maxSubArray(a));
	}

}
