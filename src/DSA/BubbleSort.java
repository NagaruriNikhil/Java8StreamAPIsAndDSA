package DSA;

public class BubbleSort {

	public static void main(String[] args)
	{
		int[] a= {3,4,2,5,1,4,8};
		int s= a.length;
		for(int i: a) {
		System.out.print(i);
		}
		
		for(int i=0;i<s;i++)
		{
			for(int j=0;j<s-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					a[j]= a[j]+a[j+1];
					a[j+1]= a[j]-a[j+1];
					a[j]= a[j] - a[j+1];		
				}
			}
		}
		System.out.println("After bubble sort");
		for(int i: a) {
			System.out.print(i+",");
			}
		
	}
}
