package DSA;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,5,2,7,5,8,1};
		System.out.println("Before");
		for(int i:a) {
			System.out.print(i+",");
		}
		System.out.println();
		int l=a.length;
		int max=-1,min=-1;
		//by taking largest element
//		for(int i=l-1;i>0;i--)
//		{
//			max= 0;
//			for(int j=0;j<i;j++)
//			{
//				if(a[j]>=a[max]) {
//					max=j;
//				}
//				
//			}
//			a[i]= a[i]+a[max];
//			a[max]= a[i]-a[max];
//			a[i]= a[i]-a[max];
//			for(int n:a) {
//				System.out.print(n+",");
//			}
//			System.out.println();
//
//		}
		//by taking smallest element
		for(int i=0;i<l-1;i++)
		{
			min= i;
			for(int j=i+1;j<l;j++)
			{
				if(a[j]<a[min]) {
					min=j;
				}
				
			}
			a[i]= a[i]+a[min];
			a[min]= a[i]-a[min];
			a[i]= a[i]-a[min];
			for(int n:a) {
				System.out.print(n+",");
			}
			System.out.println();

		}
		System.out.println("After bubble sort");
		for(int i:a) {
			System.out.print(i+",");
		}
	}

}
